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
			return null;
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
			return null;
		}
    	
    	//if both weight and height are set (check only when updating them)
    	if (measure.getMeasureType().equals("weight") || measure.getMeasureType().equals("height")) {
    		Double weight = null;
    		Double height = null;
    		
    		dbPerson = storage.getPersonByChatId(chatId); //refresh person

    		CurrentHealth cHealth = dbPerson.getCurrentHealth();
        	List<Measure> measureList = cHealth.getMeasure();
        	for (Measure m : measureList) {
        		if (m.getMeasureType().equals("weight")) {
        			weight = Double.parseDouble(m.getMeasureValue());
        		} else if (m.getMeasureType().equals("height")) {
        			height = Double.parseDouble(m.getMeasureValue());
        		}
        	}
        	if (weight != null && height != null) {
        		//TODO check goal if present
        		storage.setInfo(dbPerson, weight, height, weight-5);
        	}
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


