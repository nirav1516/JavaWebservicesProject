/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connection;

public interface Service extends java.rmi.Remote {
    public java.lang.String register(java.lang.String fname, java.lang.String lname, java.lang.String email, java.lang.String pwd) throws java.rmi.RemoteException;
    public modelclasses.User login(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String addproducttocart(java.lang.String uid, java.lang.String proid) throws java.rmi.RemoteException;
    public modelclasses.Product[] fetchMyproducts(java.lang.String uid) throws java.rmi.RemoteException;
    public modelclasses.Order[] fetchorderdata(java.lang.String uid) throws java.rmi.RemoteException;
    public modelclasses.Sellinghistory[] fetchSellingHistory(java.lang.String uid) throws java.rmi.RemoteException;
    public java.lang.String insertcatalog(java.lang.String catname) throws java.rmi.RemoteException;
    public java.lang.String insertproduct(java.lang.String uid, java.lang.String catId, java.lang.String proname, java.lang.String prodesc, java.lang.String proprice, java.lang.String proqty) throws java.rmi.RemoteException;
    public modelclasses.Catalog[] fetchcatlogs() throws java.rmi.RemoteException;
    public modelclasses.Product[] fetchproducts(java.lang.String procatid, java.lang.String uid) throws java.rmi.RemoteException;
    public java.lang.String deleteproduct(java.lang.String proid) throws java.rmi.RemoteException;
    public double gettotalorder(java.lang.String uid) throws java.rmi.RemoteException;
    public java.lang.String generateOrder(java.lang.String uid) throws java.rmi.RemoteException;
    public modelclasses.Cart[] fetchcartdata(java.lang.String uid) throws java.rmi.RemoteException;
    public double gettotalcart(java.lang.String uid) throws java.rmi.RemoteException;
}
