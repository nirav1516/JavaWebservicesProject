/**
 * Catalog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modelclasses;

public class Catalog  implements java.io.Serializable {
    private java.lang.String catid;

    private java.lang.String catname;

    public Catalog() {
    }

    public Catalog(
           java.lang.String catid,
           java.lang.String catname) {
           this.catid = catid;
           this.catname = catname;
    }


    /**
     * Gets the catid value for this Catalog.
     * 
     * @return catid
     */
    public java.lang.String getCatid() {
        return catid;
    }


    /**
     * Sets the catid value for this Catalog.
     * 
     * @param catid
     */
    public void setCatid(java.lang.String catid) {
        this.catid = catid;
    }


    /**
     * Gets the catname value for this Catalog.
     * 
     * @return catname
     */
    public java.lang.String getCatname() {
        return catname;
    }


    /**
     * Sets the catname value for this Catalog.
     * 
     * @param catname
     */
    public void setCatname(java.lang.String catname) {
        this.catname = catname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Catalog)) return false;
        Catalog other = (Catalog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catid==null && other.getCatid()==null) || 
             (this.catid!=null &&
              this.catid.equals(other.getCatid()))) &&
            ((this.catname==null && other.getCatname()==null) || 
             (this.catname!=null &&
              this.catname.equals(other.getCatname())));
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
        if (getCatid() != null) {
            _hashCode += getCatid().hashCode();
        }
        if (getCatname() != null) {
            _hashCode += getCatname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Catalog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelclasses", "Catalog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "catid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelclasses", "catname"));
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
