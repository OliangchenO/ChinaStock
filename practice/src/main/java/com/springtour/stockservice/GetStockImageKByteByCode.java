
package com.springtour.stockservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="theStockCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "theStockCode",
    "theType"
})
@XmlRootElement(name = "getStockImage_kByteByCode")
public class GetStockImageKByteByCode {

    protected String theStockCode;
    protected String theType;

    /**
     * Gets the value of the theStockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheStockCode() {
        return theStockCode;
    }

    /**
     * Sets the value of the theStockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheStockCode(String value) {
        this.theStockCode = value;
    }

    /**
     * Gets the value of the theType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheType() {
        return theType;
    }

    /**
     * Sets the value of the theType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheType(String value) {
        this.theType = value;
    }

}
