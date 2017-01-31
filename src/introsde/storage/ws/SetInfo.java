
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import introsde.localdatabase.soap.Person;


/**
 * <p>Classe Java per setInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://soap.localdatabase.introsde/}person" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weight_goal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setInfo", propOrder = {
    "user",
    "weight",
    "height",
    "weightGoal"
})
public class SetInfo {

    protected Person user;
    protected double weight;
    protected double height;
    @XmlElement(name = "weight_goal")
    protected double weightGoal;

    /**
     * Recupera il valore della proprietà user.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getUser() {
        return user;
    }

    /**
     * Imposta il valore della proprietà user.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setUser(Person value) {
        this.user = value;
    }

    /**
     * Recupera il valore della proprietà weight.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Imposta il valore della proprietà weight.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà weightGoal.
     * 
     */
    public double getWeightGoal() {
        return weightGoal;
    }

    /**
     * Imposta il valore della proprietà weightGoal.
     * 
     */
    public void setWeightGoal(double value) {
        this.weightGoal = value;
    }

}
