
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
 *         &lt;element name="getStockInfoByCodeResult" type="{http://WebXml.com.cn/}ArrayOfString" minOccurs="0"/>
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
    "getStockInfoByCodeResult"
})
@XmlRootElement(name = "getStockInfoByCodeResponse")
public class GetStockInfoByCodeResponse {

    protected ArrayOfString getStockInfoByCodeResult;

    /**
     * Gets the value of the getStockInfoByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetStockInfoByCodeResult() {
        return getStockInfoByCodeResult;
    }

    /**
     * Sets the value of the getStockInfoByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetStockInfoByCodeResult(ArrayOfString value) {
        this.getStockInfoByCodeResult = value;
    }

}
