package com.wxy.demo.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author wxy
 * @Date 19-8-22 上午9:55
 * @Description TODO
 **/
public class HelloImpl extends UnicastRemoteObject implements IHello {


    public HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        System.out.println("Connected successfully!");
        return "hello world !";
    }
}
