package com.tlacaelelsoft.rmiexample;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(1099);
        Calculator calculator = (Calculator) registry.lookup("Calculator");

        System.out.println(calculator.sum(1,3));

    }
}
