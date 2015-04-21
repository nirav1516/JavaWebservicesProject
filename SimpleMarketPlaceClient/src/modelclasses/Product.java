/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modelclasses;

public class Product  implements java.io.Serializable {
    private java.lang.String procatid;

    private java.lang.String prodesc;

    private java.lang.String proid;

    private java.lang.String proname;

    private java.lang.String proprice;

    private java.lang.String proqty;

    private java.lang.String sellerinfo;

    public Product() {
    }

    public Product(
           java.lang.String procatid,
           java.lang.String prodesc,
           java.lang.String proid,
           java.lang.String proname,
           java.lang.String proprice,
           java.lang.String proqty,
           java.lang.String sellerinfo) {
           this.procatid = procatid;
           this.prodesc = prodesc;
           this.proid = proid;
           this.proname = proname;
           this.proprice = proprice;
           this.proqty = proqty;
           this.sellerinfo = sellerinfo;
    }


    /**
     * Gets the procatid value for this Product.
     * 
     * @return procatid
     */
    public java.lang.String getProcatid() {
        return procatid;
    }


    /**
     * Sets the procatid value for this Product.
     * 
     * @param procatid
     */
    public void setProcatid(java.lang.String procatid) {
        this.procatid = procatid;
    }


    /**
     * Gets the prodesc value for this Product.
     * 
     * @return prodesc
     */
    public java.lang.String getProdesc() {
        return prodesc;
    }


    /**
     * Sets the prodesc value for this Product.
     * 
     * @param prodesc
     */
    public void setProdesc(java.lang.String prodesc) {
        this.prodesc = prodesc;
    }


    /**
     * Gets the proid value for this Product.
     * 
     * @return proid
     */
    public java.lang.String getProid() {
        return proid;
    }


    /**
     * Sets the proid value for this Product.
     * 
     * @param proid
     */
    public void setProid(java.lang.String proid) {
        this.proid = proid;
    }


    /**
     * Gets the proname value for this Product.
     * 
     * @return proname
     */
    public java.lang.String getProname() {
        return proname;
    }


    /**
     * Sets the proname value for this Product.
     * 
     * @param proname
     */
    public void setProname(java.lang.String proname) {
        this.proname = proname;
    }


    /**
     * Gets the proprice value for this Product.
     * 
     * @return proprice
     */
    public java.lang.String getProprice() {
        return proprice;
    }


    /**
     * Sets the proprice value for this Product.
     * 
     * @param proprice
     */
    public void setProprice(java.lang.String proprice) {
        this.proprice = proprice;
    }


    /**
     * Gets the proqty value for this Product.
     * 
     * @return proqty
     */
    public java.lang.String getProqty() {
        return proqty;
    }


    /**
     * Sets the proqty value for this Product.
     * 
     * @param proqty
     */
    public void setProqty(java.lang.String proqty) {
        this.proqty = proqty;
    }


    /**
     * Gets the sellerinfo value for this Product.
     * 
     * @return sellerinfo
     */
    public java.lang.String getSellerinfo() {
        return sellerinfo;
    }


    /**
     * Sets the sellerinfo value for this Product.
     * 
     * @param sellerinfo
     */
    public void setSellerinfo(java.lang.String sellerinfo) {
        this.sellerinfo = sellerinfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.procatid==null && other.getProcatid()==null) || 
             (this.procatid!=null &&
              this.procatid.equals(other.getProcatid()))) &&
            ((this.prodesc==null && other.getProdesc()==null) || 
             (this.prodesc!=null &&
              this.prodesc.equals(other.getProdesc()))) &&
            ((this.proid==null && other.getProid()==null) || 
             (this.proid!=null &&
              this.proid.equals(other.getProid()))) &&
            ((this.proname==null && other.getProname()==null) || 
             (this.proname!=null &&
              this.proname.equals(other.getProname()))) &&
            ((this.proprice==null && other.getProprice()==null) || 
             (this.proprice!=null &&
              this.proprice.equals(other.getProprice()))) &&
            ((this.proqty==null && other.getProqty()==null) || 
             (this.proqty!=null &&
              this.proqty.equals(other.getProqty()))) &&
            ((this.sellerinfo==null && other.getSellerinfo()==null) || 
             (this.sellerinfo!=null &&
              this.sellerinfo.equals(other.getSellerinfo())));
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
        if (getProcatid() != null) {
            _hashCode += getProcatid().hashCode();
        }
        if (getProdesc() != null) {
            _hashCode += getProdesc().hashCode();
        }
        if (getProid() != null) {
            _hashCode += getProid().hashCode();
        }
        if (getProname() != null) {
            _hashCode += getProname().hashCode();
        }
        if (getProprice() != null) {
            _hashCode += getProprice().hashCode();
        }
        if (getProqty() != null) {
            _hashCode += getProqty().hashCode();
        }
        if (getSellerinfo() != null) {
            _hashCode += getSellerinfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelclasses", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procatid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "procatid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "prodesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "proid"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proqty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "proqty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "sellerinfo"));
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
