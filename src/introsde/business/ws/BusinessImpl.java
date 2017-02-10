package introsde.business.ws;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jws.WebParam;
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
	int NUM_EXERCISE = 4;
	
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
    public String savePersonMeasure(Long chatId, Measure measure) {
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
		
		String result = "";
		//if the measure updates an old value of weight
		if (measure.getMeasureType().equals("weight") && weight != null) {
			Double storedWeight = Double.parseDouble(measure.getMeasureValue());
			Double lostWeight = weight - storedWeight;
			if (lostWeight > 0) {
				result = "Congratulations, you lost " + lostWeight + " kg!";
			} else if (lostWeight < 0){
				result = "Pay attention! You gained " + Math.abs(lostWeight) + " kg.";
			}
			
		}
		
    	return result;
	}
	
	@Override
	public Person getProfile(Long chatId) {
		initialize();
		
		Person dbPerson = storage.getPersonByChatId(chatId);
		
		if (dbPerson!=null){
			//remove the application's informations
			dbPerson.setAuthSecret(null);
			dbPerson.setAuthToken(null);
			dbPerson.setChatId(null);
			dbPerson.setIdPerson(null);
			
			return dbPerson;	
		}
		
		return null;
		
	}


	@Override
	public Person updatePerson(Person person) {
		initialize();
		
		Person dbPerson = storage.getPersonByChatId(person.getChatId());
		
		if (dbPerson!=null){
			//Save new values
			person.setIdPerson(dbPerson.getIdPerson());

			Holder<Person> holder = new Holder<>(person);
			storage.updatePerson(holder);

			return holder.value;
		}
		else 
			return this.createPerson(person);
	}
	
	
	
	
	
	public Exercise search_by_name(List<Exercise> list, String name){
		for(Exercise e:list){
			
			if (e.getName().equals(name)){
				return e;
			}
				
		}
		return null;
	}
	
	public Exercise search_by_id(List<Exercise> list, int id){
		for(Exercise e:list){
			if (e.getId()==id){
				return e;
			}
				
		}
		return null;
	}

	@Override
	public Exercise getCalories(Long chatId, Exercise exe) {
		initialize();
		
		Person dbPerson = storage.getPersonByChatId(chatId);
		Exercise res = search_by_name(storage.getExercises(), exe.getName());

		// insert the new exercise in the current day
		storage.editExerciseEntry(dbPerson, res.getId(), exe.getMinutes());
		
		res = search_by_id(storage.getExerciseEntry(dbPerson, 0), res.getId());
		
		storage.commitDay(dbPerson);
		
		//proportion to get calories for correct minutes and not the sum of what done during the day
		//min_da_telegram : x = min_da_db : calorie_calcolate
		int newCalories = (int)(exe.getMinutes() * res.getCalories()) / res.getMinutes();
		res.setCalories(newCalories);
		res.setMinutes(exe.getMinutes());
				
		return res;
	}
	
	@Override
	public void setSleepTime(@WebParam(name="chatId") Long chatId, @WebParam(name="hours") double hours){
		initialize();
		
		Person dbPerson = storage.getPersonByChatId(chatId);
		System.out.println(hours);
		int h = (int) hours;
		int m =(int) ((hours - h) * 100);
		int minutes=h*60+m;
		// return the current sleeping(id=1) exercise
		Exercise res = search_by_id(storage.getExerciseEntry(dbPerson, 0), 1);
		
		if (res.getMinutes() > minutes){
			storage.removeSleepTime(dbPerson, res.getMinutes() - minutes);
			
		}else if(res.getMinutes() < minutes){
			storage.editExerciseEntry(dbPerson, 1, minutes - res.getMinutes());
		}
		
		storage.saveTemplate(dbPerson, 127);
		
	}


	@Override
	public Exercise getExercise(Long chatId) {
		initialize();
		
		Person dbPerson = storage.getPersonByChatId(chatId);
		
		if(dbPerson == null)
			return null;
		if(dbPerson.getCurrentHealth()==null)
			return null;
		
		List<Measure> currentHealth = dbPerson.getCurrentHealth().getMeasure();
		boolean height= false;
		boolean weight=false;
		for (int i = 0; i<currentHealth.size();i++){
			if (currentHealth.get(i).getMeasureType().equals("height"))
				height=true;
			if (currentHealth.get(i).getMeasureType().equals("weight"))
				weight=true;
		}
		
		// return if it is not already set weight and height
		if (!(height && weight))
			return null;
		
		List<Exercise> exercises = storage.getExercises();
	
		int exe = (int)(Math.random() * exercises.size());
		
		return exercises.get(exe);
	}


	@Override
	public List<Exercise> getTodayExercises(Long chatId) {
		initialize();
		
		//Get person
		Person dbPerson = storage.getPersonByChatId(chatId);
		
		//if height and set, return null -> not possible to calculate calories
		List<Measure> currentHealth = dbPerson.getCurrentHealth().getMeasure();
		boolean height= false;
		boolean weight=false;
		for (int i = 0; i<currentHealth.size();i++){
			if (currentHealth.get(i).getMeasureType().equals("height"))
				height=true;
			if (currentHealth.get(i).getMeasureType().equals("weight"))
				weight=true;
		}
		
		// return if it is not already set weight and height
		if (!(height && weight))
			return null;
		
		//Get today's exercises
		List<Exercise> exerciseList = storage.getExerciseEntry(dbPerson, 0);
		return exerciseList;
	}
	
	
}


