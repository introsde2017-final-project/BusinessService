
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getPersonByChatId complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getPersonByChatId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonByChatId", propOrder = {
    "chatId"
})
public class GetPersonByChatId {

    protected Long chatId;

    /**
     * Recupera il valore della proprietà chatId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChatId() {
        return chatId;
    }

    /**
     * Imposta il valore della proprietà chatId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChatId(Long value) {
        this.chatId = value;
    }

}
