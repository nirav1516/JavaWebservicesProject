/**
 * WebservicemathServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.simplemathsolver.webservices;

public class WebservicemathServiceLocator extends org.apache.axis.client.Service implements com.simplemathsolver.webservices.WebservicemathService {

    public WebservicemathServiceLocator() {
    }


    public WebservicemathServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebservicemathServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Webservicemath
    private java.lang.String Webservicemath_address = "http://localhost:8080/Mathsolver_JSP/services/Webservicemath";

    public java.lang.String getWebservicemathAddress() {
        return Webservicemath_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebservicemathWSDDServiceName = "Webservicemath";

    public java.lang.String getWebservicemathWSDDServiceName() {
        return WebservicemathWSDDServiceName;
    }

    public void setWebservicemathWSDDServiceName(java.lang.String name) {
        WebservicemathWSDDServiceName = name;
    }

    public com.simplemathsolver.webservices.Webservicemath getWebservicemath() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Webservicemath_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebservicemath(endpoint);
    }

    public com.simplemathsolver.webservices.Webservicemath getWebservicemath(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.simplemathsolver.webservices.WebservicemathSoapBindingStub _stub = new com.simplemathsolver.webservices.WebservicemathSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebservicemathWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebservicemathEndpointAddress(java.lang.String address) {
        Webservicemath_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.simplemathsolver.webservices.Webservicemath.class.isAssignableFrom(serviceEndpointInterface)) {
                com.simplemathsolver.webservices.WebservicemathSoapBindingStub _stub = new com.simplemathsolver.webservices.WebservicemathSoapBindingStub(new java.net.URL(Webservicemath_address), this);
                _stub.setPortName(getWebservicemathWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Webservicemath".equals(inputPortName)) {
            return getWebservicemath();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.simplemathsolver.com", "WebservicemathService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.simplemathsolver.com", "Webservicemath"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Webservicemath".equals(portName)) {
            setWebservicemathEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
