/**
 * Webservicemath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.simplemathsolver.webservices;

public interface Webservicemath extends java.rmi.Remote {
    public java.lang.String checkprime(int n) throws java.rmi.RemoteException;
    public boolean isPrime(int no) throws java.rmi.RemoteException;
    public java.lang.String findprimeseries(int num) throws java.rmi.RemoteException;
}
