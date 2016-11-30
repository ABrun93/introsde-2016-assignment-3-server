package introsde.assignment.soap.webservice;

import introsde.assignment.soap.model.Person;
import introsde.assignment.soap.model.Measure;
import introsde.assignment.soap.model.MeasureType;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface People 
{
	/* Person*/
	@WebMethod(operationName="getPeopleList")
    @WebResult(name="people") 
    public List<Person> getPeople();
    
	@WebMethod(operationName="readPerson")
    @WebResult(name="person") 
    public Person readPerson(@WebParam(name="personId") int id);

    @WebMethod(operationName="createPerson")
    @WebResult(name="person") 
    public int addPerson(@WebParam(name="person") Person person);

    @WebMethod(operationName="updatePerson")
    @WebResult(name="person") 
    public int updatePerson(@WebParam(name="person") Person person);

    @WebMethod(operationName="deletePerson")
    @WebResult(name="personId") 
    public int deletePerson(@WebParam(name="personId") int id);
    
    
    /* Measure */
    
    @WebMethod(operationName="getMeasureHistory")
    @WebResult(name="measureList") 
    public List<Measure> getMeasure(@WebParam(name="personId") int pId, @WebParam(name="measureTypeId") String typeMeasure);
    
    @WebMethod(operationName="readMeasure")
    @WebResult(name="measure") 
    public Measure readMeasure(@WebParam(name="personId") int pId, @WebParam(name="measureTypeId") String typeMeasure, @WebParam(name="measureId") int mId);
    
    @WebMethod(operationName="createMeasure")
    @WebResult(name="measure") 
    public int addMeasure(@WebParam(name="personId") int pId, @WebParam(name="measure") Measure measure);

    @WebMethod(operationName="updateMeasure")
    @WebResult(name="measure") 
    public int updateMeasure(@WebParam(name="personId") int pId, @WebParam(name="measure") Measure measure);
    
    @WebMethod(operationName="deleteMeasure")
    @WebResult(name="measureId") 
    public int deleteMeasure(@WebParam(name="measureId") int id);
    
    
    /* MeasureType */
    
    @WebMethod(operationName="getMeasureTypeList")
    @WebResult(name="measureTypeList") 
    public List<MeasureType> getMeasureType();
    
    @WebMethod(operationName="readMeasureType")
    @WebResult(name="measureType") 
    public MeasureType readMeasureType(@WebParam(name="measureId") int id);
}

