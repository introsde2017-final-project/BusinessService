package introsde.business.ws;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


import introsde.localdatabase.soap.Measure;

import introsde.adapter.ws.Exercise;
import introsde.adapter.ws.Recipe;
import introsde.localdatabase.soap.Person;



@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Business {
    
	@WebMethod(operationName="createPerson")
	@WebResult(name="person") 
	public Person createPerson(@WebParam(name="person") Person person);
	
    @WebMethod(operationName="savePersonMeasure")
    @WebResult(name="measure") 
    public String savePersonMeasure(@WebParam(name="chatId") Long chatId, @WebParam(name="measure") Measure measure);
	
    @WebMethod(operationName="getProfile")
    @WebResult(name="person") 
    public Person getProfile(@WebParam(name="chatId") Long chatId);
    
    @WebMethod(operationName="updatePerson")
    @WebResult(name="person") 
    public Person updatePerson(@WebParam(name="person") Person person);
    
	@WebMethod(operationName="getCalories")
	@WebResult(name="calories")
	public Exercise getCalories(@WebParam(name="chatId") Long chatId, @WebParam(name="exercise") Exercise exe);
	
	@WebMethod(operationName="setSleepTime")
	public void setSleepTime(@WebParam(name="chatId") Long chatId, @WebParam(name="hours") double hours);
	
	@WebMethod(operationName="getExercise")
	@WebResult(name="exercise")
	public Exercise getExercise(@WebParam(name="chatId") Long chatId);
	
	@WebMethod(operationName="getTodayExercises")
	@WebResult(name="exercises")
	public List<Exercise> getTodayExercises(@WebParam(name="chatId") Long chatId);
    
	@WebMethod(operationName="getSentenceRecipeCalories")
	public String getSentenceRecipeCalories(@WebParam(name="chatId") Long chatId, @WebParam(name="recipeId") Integer recipeId);
}
