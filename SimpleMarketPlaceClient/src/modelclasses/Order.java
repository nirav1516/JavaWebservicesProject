/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modelclasses;

public class Order  implements java.io.Serializable {
    private java.lang.String orderid;

    private java.lang.String orderuserid;

    private java.lang.String ordproductid;

    private java.lang.String orproname;

    private java.lang.String orproprice;

    private java.lang.String orqty;

    private java.lang.String ortotal;

    public Order() {
    }

    public Order(
           java.lang.String orderid,
           java.lang.String orderuserid,
           java.lang.String ordproductid,
           java.lang.String orproname,
           java.lang.String orproprice,
           java.lang.String orqty,
           java.lang.String ortotal) {
           this.orderid = orderid;
           this.orderuserid = orderuserid;
           this.ordproductid = ordproductid;
           this.orproname = orproname;
           this.orproprice = orproprice;
           this.orqty = orqty;
           this.ortotal = ortotal;
    }


    /**
     * Gets the orderid value for this Order.
     * 
     * @return orderid
     */
    public java.lang.String getOrderid() {
        return orderid;
    }


    /**
     * Sets the orderid value for this Order.
     * 
     * @param orderid
     */
    public void setOrderid(java.lang.String orderid) {
        this.orderid = orderid;
    }


    /**
     * Gets the orderuserid value for this Order.
     * 
     * @return orderuserid
     */
    public java.lang.String getOrderuserid() {
        return orderuserid;
    }


    /**
     * Sets the orderuserid value for this Order.
     * 
     * @param orderuserid
     */
    public void setOrderuserid(java.lang.String orderuserid) {
        this.orderuserid = orderuserid;
    }


    /**
     * Gets the ordproductid value for this Order.
     * 
     * @return ordproductid
     */
    public java.lang.String getOrdproductid() {
        return ordproductid;
    }


    /**
     * Sets the ordproductid value for this Order.
     * 
     * @param ordproductid
     */
    public void setOrdproductid(java.lang.String ordproductid) {
        this.ordproductid = ordproductid;
    }


    /**
     * Gets the orproname value for this Order.
     * 
     * @return orproname
     */
    public java.lang.String getOrproname() {
        return orproname;
    }


    /**
     * Sets the orproname value for this Order.
     * 
     * @param orproname
     */
    public void setOrproname(java.lang.String orproname) {
        this.orproname = orproname;
    }


    /**
     * Gets the orproprice value for this Order.
     * 
     * @return orproprice
     */
    public java.lang.String getOrproprice() {
        return orproprice;
    }


    /**
     * Sets the orproprice value for this Order.
     * 
     * @param orproprice
     */
    public void setOrproprice(java.lang.String orproprice) {
        this.orproprice = orproprice;
    }


    /**
     * Gets the orqty value for this Order.
     * 
     * @return orqty
     */
    public java.lang.String getOrqty() {
        return orqty;
    }


    /**
     * Sets the orqty value for this Order.
     * 
     * @param orqty
     */
    public void setOrqty(java.lang.String orqty) {
        this.orqty = orqty;
    }


    /**
     * Gets the ortotal value for this Order.
     * 
     * @return ortotal
     */
    public java.lang.String getOrtotal() {
        return ortotal;
    }


    /**
     * Sets the ortotal value for this Order.
     * 
     * @param ortotal
     */
    public void setOrtotal(java.lang.String ortotal) {
        this.ortotal = ortotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderid==null && other.getOrderid()==null) || 
             (this.orderid!=null &&
              this.orderid.equals(other.getOrderid()))) &&
            ((this.orderuserid==null && other.getOrderuserid()==null) || 
             (this.orderuserid!=null &&
              this.orderuserid.equals(other.getOrderuserid()))) &&
            ((this.ordproductid==null && other.getOrdproductid()==null) || 
             (this.ordproductid!=null &&
              this.ordproductid.equals(other.getOrdproductid()))) &&
            ((this.orproname==null && other.getOrproname()==null) || 
             (this.orproname!=null &&
              this.orproname.equals(other.getOrproname()))) &&
            ((this.orproprice==null && other.getOrproprice()==null) || 
             (this.orproprice!=null &&
              this.orproprice.equals(other.getOrproprice()))) &&
            ((this.orqty==null && other.getOrqty()==null) || 
             (this.orqty!=null &&
              this.orqty.equals(other.getOrqty()))) &&
            ((this.ortotal==null && other.getOrtotal()==null) || 
             (this.ortotal!=null &&
              this.ortotal.equals(other.getOrtotal())));
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
        if (getOrderid() != null) {
            _hashCode += getOrderid().hashCode();
        }
        if (getOrderuserid() != null) {
            _hashCode += getOrderuserid().hashCode();
        }
        if (getOrdproductid() != null) {
            _hashCode += getOrdproductid().hashCode();
        }
        if (getOrproname() != null) {
            _hashCode += getOrproname().hashCode();
        }
        if (getOrproprice() != null) {
            _hashCode += getOrproprice().hashCode();
        }
        if (getOrqty() != null) {
            _hashCode += getOrqty().hashCode();
        }
        if (getOrtotal() != null) {
            _hashCode += getOrtotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelclasses", "Order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "orderid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderuserid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "orderuserid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordproductid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "ordproductid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orproname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "orproname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orproprice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "orproprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "orqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ortotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "ortotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
