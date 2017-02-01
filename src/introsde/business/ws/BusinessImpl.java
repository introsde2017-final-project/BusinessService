package introsde.business.ws;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import introsde.adapter.ws.Exercise;
import introsde.localdatabase.soap.Person;
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
			Holder<Person> holder = new Holder<Person>(person);
			storage.createPerson(holder);
			return holder.value;
		}
		return null;
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


