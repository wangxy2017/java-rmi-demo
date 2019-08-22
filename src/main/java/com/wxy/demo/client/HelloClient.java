package com.wxy.demo.client;

import com.wxy.demo.server.IHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author wxy
 * @Date 19-8-22 上午10:02
 * @Description TODO
 **/
public class HelloClient {
    public static void main(String[] args) {
        try {
            IHello hello = (IHello) Naming.lookup("rmi://127.0.0.1:8888/hello");
            System.out.println(hello.sayHello());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
