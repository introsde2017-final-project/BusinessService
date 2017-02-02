package introsde.business.ws;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


import introsde.localdatabase.soap.Measure;

import introsde.adapter.ws.Exercise;
import introsde.localdatabase.soap.Person;



@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Business {
    
	@WebMethod(operationName="createPerson")
	@WebResult(name="person") 
	public Person createPerson(@WebParam(name="person") Person person);
	
    @WebMethod(operationName="savePersonMeasure")
    @WebResult(name="measure") 
    public Measure savePersonMeasure(@WebParam(name="chatId") Long chatId, @WebParam(name="measure") Measure measure);
 
	@WebMethod(operationName="getCalories")
	@WebResult(name="calories")
	public double getCalories(@WebParam(name="chatId") Long chatId, @WebParam(name="exercise") Exercise exe);
	
    @WebMethod(operationName="getProfile")
    @WebResult(name="person") 
    public Person getProfile(@WebParam(name="chatId") Long chatId);
    
    @WebMethod(operationName="updatePerson")
    @WebResult(name="person") 
    public Person updatePerson(@WebParam(name="person") Person person);
    
}
