
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.adapter.ws.Recipe;


/**
 * <p>Classe Java per getRecipeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getRecipeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipe" type="{http://ws.adapter.introsde/}recipe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecipeResponse", propOrder = {
    "recipe"
})
public class GetRecipeResponse {

    protected Recipe recipe;

    /**
     * Recupera il valore della proprietà recipe.
     * 
     * @return
     *     possible object is
     *     {@link Recipe }
     *     
     */
    public Recipe getRecipe() {
        return recipe;
    }

    /**
     * Imposta il valore della proprietà recipe.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipe }
     *     
     */
    public void setRecipe(Recipe value) {
        this.recipe = value;
    }

}
