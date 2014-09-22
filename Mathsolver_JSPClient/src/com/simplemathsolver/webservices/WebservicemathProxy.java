package com.simplemathsolver.webservices;

public class WebservicemathProxy implements com.simplemathsolver.webservices.Webservicemath {
  private String _endpoint = null;
  private com.simplemathsolver.webservices.Webservicemath webservicemath = null;
  
  public WebservicemathProxy() {
    _initWebservicemathProxy();
  }
  
  public WebservicemathProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebservicemathProxy();
  }
  
  private void _initWebservicemathProxy() {
    try {
      webservicemath = (new com.simplemathsolver.webservices.WebservicemathServiceLocator()).getWebservicemath();
      if (webservicemath != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webservicemath)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webservicemath)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webservicemath != null)
      ((javax.xml.rpc.Stub)webservicemath)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.simplemathsolver.webservices.Webservicemath getWebservicemath() {
    if (webservicemath == null)
      _initWebservicemathProxy();
    return webservicemath;
  }
  
  public java.lang.String checkprime(int n) throws java.rmi.RemoteException{
    if (webservicemath == null)
      _initWebservicemathProxy();
    return webservicemath.checkprime(n);
  }
  
  public boolean isPrime(int no) throws java.rmi.RemoteException{
    if (webservicemath == null)
      _initWebservicemathProxy();
    return webservicemath.isPrime(no);
  }
  
  public java.lang.String findprimeseries(int num) throws java.rmi.RemoteException{
    if (webservicemath == null)
      _initWebservicemathProxy();
    return webservicemath.findprimeseries(num);
  }
  
  
}