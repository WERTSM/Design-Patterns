package headfirst._13_proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * -Djava.security.policy=.java.policy
 * <p>
 * Created by WERT on 27.02.2017.
 */
public class RmiServer {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        MyRemoteInterface myRemoteObject = new MyRemoteObject();

        try {
            MyRemoteInterface stub = (MyRemoteInterface) UnicastRemoteObject.exportObject(myRemoteObject, 0);
            Registry registry = LocateRegistry.createRegistry(1094);
            registry.bind("MyRemoteObject", stub);
            System.out.println("bound MyRemoteObject");

        } catch (Throwable e) {
            System.out.println("ERROR:\n" + e.getMessage());
        }
    }
}

interface MyRemoteInterface extends Remote {
    Integer getIncreasedNumber(Integer number) throws RemoteException;
}

class MyRemoteObject implements MyRemoteInterface {
    @Override
    public Integer getIncreasedNumber(Integer number) throws RemoteException {
        return number + 1;
    }
}


//http://stackoverflow.com/questions/1823305/rmi-connection-refused-with-localhost    -   на всякий