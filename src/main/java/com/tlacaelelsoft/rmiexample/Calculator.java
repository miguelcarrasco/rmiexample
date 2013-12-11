package com.tlacaelelsoft.rmiexample;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    public int sum(int i, int j) throws RemoteException;
}
