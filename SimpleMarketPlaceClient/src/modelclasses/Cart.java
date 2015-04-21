/**
 * Cart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modelclasses;

public class Cart  implements java.io.Serializable {
    private java.lang.String cartid;

    private java.lang.String cartqty;

    private java.lang.String carttotal;

    private java.lang.String cartuserid;

    private java.lang.String productid;

    private java.lang.String proname;

    private java.lang.String proprice;

    public Cart() {
    }

    public Cart(
           java.lang.String cartid,
           java.lang.String cartqty,
           java.lang.String carttotal,
           java.lang.String cartuserid,
           java.lang.String productid,
           java.lang.String proname,
           java.lang.String proprice) {
           this.cartid = cartid;
           this.cartqty = cartqty;
           this.carttotal = carttotal;
           this.cartuserid = cartuserid;
           this.productid = productid;
           this.proname = proname;
           this.proprice = proprice;
    }


    /**
     * Gets the cartid value for this Cart.
     * 
     * @return cartid
     */
    public java.lang.String getCartid() {
        return cartid;
    }


    /**
     * Sets the cartid value for this Cart.
     * 
     * @param cartid
     */
    public void setCartid(java.lang.String cartid) {
        this.cartid = cartid;
    }


    /**
     * Gets the cartqty value for this Cart.
     * 
     * @return cartqty
     */
    public java.lang.String getCartqty() {
        return cartqty;
    }


    /**
     * Sets the cartqty value for this Cart.
     * 
     * @param cartqty
     */
    public void setCartqty(java.lang.String cartqty) {
        this.cartqty = cartqty;
    }


    /**
     * Gets the carttotal value for this Cart.
     * 
     * @return carttotal
     */
    public java.lang.String getCarttotal() {
        return carttotal;
    }


    /**
     * Sets the carttotal value for this Cart.
     * 
     * @param carttotal
     */
    public void setCarttotal(java.lang.String carttotal) {
        this.carttotal = carttotal;
    }


    /**
     * Gets the cartuserid value for this Cart.
     * 
     * @return cartuserid
     */
    public java.lang.String getCartuserid() {
        return cartuserid;
    }


    /**
     * Sets the cartuserid value for this Cart.
     * 
     * @param cartuserid
     */
    public void setCartuserid(java.lang.String cartuserid) {
        this.cartuserid = cartuserid;
    }


    /**
     * Gets the productid value for this Cart.
     * 
     * @return productid
     */
    public java.lang.String getProductid() {
        return productid;
    }


    /**
     * Sets the productid value for this Cart.
     * 
     * @param productid
     */
    public void setProductid(java.lang.String productid) {
        this.productid = productid;
    }


    /**
     * Gets the proname value for this Cart.
     * 
     * @return proname
     */
    public java.lang.String getProname() {
        return proname;
    }


    /**
     * Sets the proname value for this Cart.
     * 
     * @param proname
     */
    public void setProname(java.lang.String proname) {
        this.proname = proname;
    }


    /**
     * Gets the proprice value for this Cart.
     * 
     * @return proprice
     */
    public java.lang.String getProprice() {
        return proprice;
    }


    /**
     * Sets the proprice value for this Cart.
     * 
     * @param proprice
     */
    public void setProprice(java.lang.String proprice) {
        this.proprice = proprice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cart)) return false;
        Cart other = (Cart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartid==null && other.getCartid()==null) || 
             (this.cartid!=null &&
              this.cartid.equals(other.getCartid()))) &&
            ((this.cartqty==null && other.getCartqty()==null) || 
             (this.cartqty!=null &&
              this.cartqty.equals(other.getCartqty()))) &&
            ((this.carttotal==null && other.getCarttotal()==null) || 
             (this.carttotal!=null &&
              this.carttotal.equals(other.getCarttotal()))) &&
            ((this.cartuserid==null && other.getCartuserid()==null) || 
             (this.cartuserid!=null &&
              this.cartuserid.equals(other.getCartuserid()))) &&
            ((this.productid==null && other.getProductid()==null) || 
             (this.productid!=null &&
              this.productid.equals(other.getProductid()))) &&
            ((this.proname==null && other.getProname()==null) || 
             (this.proname!=null &&
              this.proname.equals(other.getProname()))) &&
            ((this.proprice==null && other.getProprice()==null) || 
             (this.proprice!=null &&
              this.proprice.equals(other.getProprice())));
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
        if (getCartid() != null) {
            _hashCode += getCartid().hashCode();
        }
        if (getCartqty() != null) {
            _hashCode += getCartqty().hashCode();
        }
        if (getCarttotal() != null) {
            _hashCode += getCarttotal().hashCode();
        }
        if (getCartuserid() != null) {
            _hashCode += getCartuserid().hashCode();
        }
        if (getProductid() != null) {
            _hashCode += getProductid().hashCode();
        }
        if (getProname() != null) {
            _hashCode += getProname().hashCode();
        }
        if (getProprice() != null) {
            _hashCode += getProprice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelclasses", "Cart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "cartid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "cartqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carttotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "carttotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartuserid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "cartuserid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "productid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "proname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proprice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "proprice"));
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
