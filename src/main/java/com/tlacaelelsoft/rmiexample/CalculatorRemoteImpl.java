package com.tlacaelelsoft.rmiexample;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorRemoteImpl extends UnicastRemoteObject implements Calculator{

    protected CalculatorRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public int sum(int i, int j) throws RemoteException {
        return i+j;
    }
}
