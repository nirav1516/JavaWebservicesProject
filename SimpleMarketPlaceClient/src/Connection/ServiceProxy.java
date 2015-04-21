package Connection;

public class ServiceProxy implements Connection.Service {
  private String _endpoint = null;
  private Connection.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new Connection.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Connection.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public java.lang.String register(java.lang.String fname, java.lang.String lname, java.lang.String email, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.register(fname, lname, email, pwd);
  }
  
  public modelclasses.User login(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.login(username, pwd);
  }
  
  public java.lang.String addproducttocart(java.lang.String uid, java.lang.String proid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.addproducttocart(uid, proid);
  }
  
  public modelclasses.Product[] fetchMyproducts(java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchMyproducts(uid);
  }
  
  public modelclasses.Order[] fetchorderdata(java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchorderdata(uid);
  }
  
  public modelclasses.Sellinghistory[] fetchSellingHistory(java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchSellingHistory(uid);
  }
  
  public java.lang.String insertcatalog(java.lang.String catname) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.insertcatalog(catname);
  }
  
  public java.lang.String insertproduct(java.lang.String uid, java.lang.String catId, java.lang.String proname, java.lang.String prodesc, java.lang.String proprice, java.lang.String proqty) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.insertproduct(uid, catId, proname, prodesc, proprice, proqty);
  }
  
  public modelclasses.Catalog[] fetchcatlogs() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchcatlogs();
  }
  
  public modelclasses.Product[] fetchproducts(java.lang.String procatid, java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchproducts(procatid, uid);
  }
  
  public java.lang.String deleteproduct(java.lang.String proid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.deleteproduct(proid);
  }
  
  public double gettotalorder(java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.gettotalorder(uid);
  }
  
  public java.lang.String generateOrder(java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.generateOrder(uid);
  }
  
  public modelclasses.Cart[] fetchcartdata(java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchcartdata(uid);
  }
  
  public double gettotalcart(java.lang.String uid) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.gettotalcart(uid);
  }
  
  
}