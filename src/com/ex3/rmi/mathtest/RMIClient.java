package com.ex3.rmi.mathtest;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // 如果RMI Registry就在本地机器上，URL就是:rmi://Localhost:1099/hello
            // 否则，URL就是: rmi://RMIService IP:1099/hello
            // MRegistry中检索远程对象的存根/代理
            Registry registry = LocateRegistry.getRegistry("localhost");
            IRemoteMath remoteMath = (IRemoteMath) registry.lookup("Compute");
            // 调用远程对象的方法
            int addResult = remoteMath.add(5, 3);
            int subResult = remoteMath.sub(5, 3);
            System.out.println("5 + 3 = " + addResult);
            System.out.println("5 - 3 = " + subResult);
        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
