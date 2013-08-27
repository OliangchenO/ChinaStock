
package com.springtour.stockservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getStockImage_kByteByCodeResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStockImageKByteByCodeResult"
})
@XmlRootElement(name = "getStockImage_kByteByCodeResponse")
public class GetStockImageKByteByCodeResponse {

    @XmlElement(name = "getStockImage_kByteByCodeResult")
    protected byte[] getStockImageKByteByCodeResult;

    /**
     * Gets the value of the getStockImageKByteByCodeResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetStockImageKByteByCodeResult() {
        return getStockImageKByteByCodeResult;
    }

    /**
     * Sets the value of the getStockImageKByteByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetStockImageKByteByCodeResult(byte[] value) {
        this.getStockImageKByteByCodeResult = ((byte[]) value);
    }

}
