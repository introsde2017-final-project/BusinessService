package introsde.business.ws;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import introsde.adapter.ws.Exercise;
import introsde.localdatabase.soap.Measure;
import introsde.localdatabase.soap.Person;
import introsde.localdatabase.soap.Person.CurrentHealth;
import introsde.storage.ws.Storage;
import introsde.storage.ws.StorageService;

@WebService(endpointInterface = "introsde.business.ws.Business",serviceName="BusinessService")
public class BusinessImpl implements Business{
	
	StorageService sService;
	Storage storage;	
	
	public void initialize(){
		sService = new StorageService();
		storage = sService.getStorageImplPort();
	}


	@Override
	public Person createPerson(Person person) {
		initialize();

		Person dbPerson = storage.getPersonByChatId(person.getChatId());

		// if person with chatId does not exist
		if (dbPerson == null) {
			Holder<Person> holder = new Holder<>(person);
			storage.createPerson(holder);
			return holder.value;
		}
		return null;
	}

	@Override
    public Measure savePersonMeasure(Long chatId, Measure measure) {
    	initialize();

    	//search person with chatId in db
    	Person dbPerson = null;
		try{
			dbPerson = storage.getPersonByChatId(chatId);
		} catch (Exception e) {
			System.err.println(e);
			return null; //return null if person not in db
		}
		
		//check (when updating weight or height) if they were already set and keep value
		Double weight = null;
		Double height = null;
		if (measure.getMeasureType().equals("weight") || measure.getMeasureType().equals("height")) {
			CurrentHealth cHealth = dbPerson.getCurrentHealth();
        	List<Measure> measureList = cHealth.getMeasure();
        	for (Measure m : measureList) {
        		if (m.getMeasureType().equals("weight")) {
        			weight = Double.parseDouble(m.getMeasureValue());
        		} else if (m.getMeasureType().equals("height")) {
        			height = Double.parseDouble(m.getMeasureValue());
        		}
        	}
		}		
    	
    	//set today date
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	Date date = new Date();
    	measure.setDateRegistered(dateFormat.format(date));
    	
    	Holder<Measure> holder = new Holder<>(measure);
    	try {
    		storage.savePersonMeasure(dbPerson.getIdPerson(), holder);
    	} catch (Exception e) {
			System.err.println(e);
			return null; //return null if the person was not saved for some error
		}
    	
    	//call setInfo only if for the first time weight and height are both set
		if (measure.getMeasureType().equals("weight") && weight == null && height != null) {
			Double storedWeight = Double.parseDouble(measure.getMeasureValue());
			storage.setInfo(dbPerson, storedWeight, height, storedWeight - 5);
		} else if (measure.getMeasureType().equals("height") && height == null && weight != null) {
			Double storedHeight = Double.parseDouble(measure.getMeasureValue());
			storage.setInfo(dbPerson, weight, storedHeight, weight - 5);
		}
    	return holder.value;
	}
	
	public Exercise search(List<Exercise> list, String name){
		for(Exercise e:list){
			if (e.getName().equals(name)){
				return e;
			}
				
		}
		return null;
	}

	@Override
	public double getCalories(Long chatId, Exercise exe) {
		initialize();
		
		Person dbPerson = storage.getPersonByChatId(chatId);
		Exercise res = search(storage.getExercises(), exe.getName());
		
		storage.setInfo(dbPerson, 80, 180, 75);

		
		// insert the new exercise in the current day
		storage.editExerciseEntry(dbPerson, res.getId(), exe.getMinutes());
		
		res = search(storage.getExerciseEntry(dbPerson, 0),exe.getName());
		
		double calories = res.getCalories();
		
		storage.commitDay(dbPerson);
		
		return calories;
	}
}


