
package introsde.adapter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per food complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="food">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="food_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="food_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="food_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="food_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="food_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "food", propOrder = {
    "foodDescription",
    "foodId",
    "foodName",
    "foodType",
    "foodUrl"
})
public class Food {

    @XmlElement(name = "food_description")
    protected String foodDescription;
    @XmlElement(name = "food_id")
    protected int foodId;
    @XmlElement(name = "food_name")
    protected String foodName;
    @XmlElement(name = "food_type")
    protected String foodType;
    @XmlElement(name = "food_url")
    protected String foodUrl;

    /**
     * Recupera il valore della proprietà foodDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodDescription() {
        return foodDescription;
    }

    /**
     * Imposta il valore della proprietà foodDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodDescription(String value) {
        this.foodDescription = value;
    }

    /**
     * Recupera il valore della proprietà foodId.
     * 
     */
    public int getFoodId() {
        return foodId;
    }

    /**
     * Imposta il valore della proprietà foodId.
     * 
     */
    public void setFoodId(int value) {
        this.foodId = value;
    }

    /**
     * Recupera il valore della proprietà foodName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Imposta il valore della proprietà foodName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodName(String value) {
        this.foodName = value;
    }

    /**
     * Recupera il valore della proprietà foodType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * Imposta il valore della proprietà foodType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodType(String value) {
        this.foodType = value;
    }

    /**
     * Recupera il valore della proprietà foodUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodUrl() {
        return foodUrl;
    }

    /**
     * Imposta il valore della proprietà foodUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodUrl(String value) {
        this.foodUrl = value;
    }

}
