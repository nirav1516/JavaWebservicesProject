/**
 * Sellinghistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modelclasses;

public class Sellinghistory  implements java.io.Serializable {
    private java.lang.String buyer;

    private java.lang.String sellproname;

    private double sellproprice;

    private int sellproqty;

    public Sellinghistory() {
    }

    public Sellinghistory(
           java.lang.String buyer,
           java.lang.String sellproname,
           double sellproprice,
           int sellproqty) {
           this.buyer = buyer;
           this.sellproname = sellproname;
           this.sellproprice = sellproprice;
           this.sellproqty = sellproqty;
    }


    /**
     * Gets the buyer value for this Sellinghistory.
     * 
     * @return buyer
     */
    public java.lang.String getBuyer() {
        return buyer;
    }


    /**
     * Sets the buyer value for this Sellinghistory.
     * 
     * @param buyer
     */
    public void setBuyer(java.lang.String buyer) {
        this.buyer = buyer;
    }


    /**
     * Gets the sellproname value for this Sellinghistory.
     * 
     * @return sellproname
     */
    public java.lang.String getSellproname() {
        return sellproname;
    }


    /**
     * Sets the sellproname value for this Sellinghistory.
     * 
     * @param sellproname
     */
    public void setSellproname(java.lang.String sellproname) {
        this.sellproname = sellproname;
    }


    /**
     * Gets the sellproprice value for this Sellinghistory.
     * 
     * @return sellproprice
     */
    public double getSellproprice() {
        return sellproprice;
    }


    /**
     * Sets the sellproprice value for this Sellinghistory.
     * 
     * @param sellproprice
     */
    public void setSellproprice(double sellproprice) {
        this.sellproprice = sellproprice;
    }


    /**
     * Gets the sellproqty value for this Sellinghistory.
     * 
     * @return sellproqty
     */
    public int getSellproqty() {
        return sellproqty;
    }


    /**
     * Sets the sellproqty value for this Sellinghistory.
     * 
     * @param sellproqty
     */
    public void setSellproqty(int sellproqty) {
        this.sellproqty = sellproqty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sellinghistory)) return false;
        Sellinghistory other = (Sellinghistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buyer==null && other.getBuyer()==null) || 
             (this.buyer!=null &&
              this.buyer.equals(other.getBuyer()))) &&
            ((this.sellproname==null && other.getSellproname()==null) || 
             (this.sellproname!=null &&
              this.sellproname.equals(other.getSellproname()))) &&
            this.sellproprice == other.getSellproprice() &&
            this.sellproqty == other.getSellproqty();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBuyer() != null) {
            _hashCode += getBuyer().hashCode();
        }
        if (getSellproname() != null) {
            _hashCode += getSellproname().hashCode();
        }
        _hashCode += new Double(getSellproprice()).hashCode();
        _hashCode += getSellproqty();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sellinghistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelclasses", "Sellinghistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "buyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellproname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "sellproname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellproprice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "sellproprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellproqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "sellproqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
