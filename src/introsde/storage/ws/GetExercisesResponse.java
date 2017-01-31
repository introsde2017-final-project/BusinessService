
package introsde.storage.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.adapter.ws.Exercise;


/**
 * <p>Classe Java per getExercisesResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getExercisesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exercises" type="{http://ws.adapter.introsde/}exercise" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExercisesResponse", propOrder = {
    "exercises"
})
public class GetExercisesResponse {

    protected List<Exercise> exercises;

    /**
     * Gets the value of the exercises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exercises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExercises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exercise }
     * 
     * 
     */
    public List<Exercise> getExercises() {
        if (exercises == null) {
            exercises = new ArrayList<Exercise>();
        }
        return this.exercises;
    }

}
