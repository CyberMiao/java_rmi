package com.ex3.rmi.mathtest;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * 服务端实现远程接口
 * 必须继承UnicastRemoteObject，以允许JVM创建远程的存根/代理
 */
public class RemoteMath extends UnicastRemoteObject implements IRemoteMath {

    private static int computations;

    protected RemoteMath() throws RemoteException {
    }

    protected RemoteMath(int port) throws RemoteException {
        super(port);
    }

    protected RemoteMath(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        computations++;
        System.out.println("The Number Of The Computations So Far: " + computations);
        return (a + b);
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        computations++;
        System.out.println("The Number Of The Computations So Far: " + computations);
        return (a - b);
    }
}
