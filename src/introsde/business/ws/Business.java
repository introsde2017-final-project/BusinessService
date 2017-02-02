package introsde.business.ws;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import introsde.localdatabase.soap.Measure;
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
 
    
}
