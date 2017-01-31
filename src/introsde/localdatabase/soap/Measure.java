
package introsde.localdatabase.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per measure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="measure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateRegistered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMeasure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measure", propOrder = {
    "dateRegistered",
    "idMeasure",
    "measureType",
    "measureValue",
    "measureValueType"
})
public class Measure {

    protected String dateRegistered;
    protected Long idMeasure;
    protected String measureType;
    protected String measureValue;
    protected String measureValueType;

    /**
     * Recupera il valore della proprietà dateRegistered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateRegistered() {
        return dateRegistered;
    }

    /**
     * Imposta il valore della proprietà dateRegistered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRegistered(String value) {
        this.dateRegistered = value;
    }

    /**
     * Recupera il valore della proprietà idMeasure.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMeasure() {
        return idMeasure;
    }

    /**
     * Imposta il valore della proprietà idMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMeasure(Long value) {
        this.idMeasure = value;
    }

    /**
     * Recupera il valore della proprietà measureType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Imposta il valore della proprietà measureType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

    /**
     * Recupera il valore della proprietà measureValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureValue() {
        return measureValue;
    }

    /**
     * Imposta il valore della proprietà measureValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureValue(String value) {
        this.measureValue = value;
    }

    /**
     * Recupera il valore della proprietà measureValueType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureValueType() {
        return measureValueType;
    }

    /**
     * Imposta il valore della proprietà measureValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureValueType(String value) {
        this.measureValueType = value;
    }

}
