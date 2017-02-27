package headfirst._13_proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by WERT on 27.02.2017.
 */
public class MyRemoteObj extends UnicastRemoteObject implements MyRemoteInt {

    public MyRemoteObj() throws RemoteException {
        super();
    }

    @Override

    public String Hello() throws RuntimeException {
        return "Привет!!!";
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        try {
            MyRemoteObj mobj = new MyRemoteObj();

            Naming.rebind("127.0.0.1", mobj);

            System.out.println("Добавили!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}