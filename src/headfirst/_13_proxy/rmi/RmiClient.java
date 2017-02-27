package headfirst._13_proxy.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * -Djava.security.policy=.java.policy
 *
 * Created by WERT on 27.02.2017.
 */
public class RmiClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1094);
        MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("MyRemoteObject2");
        System.out.println("Ывммвмвм" + stub.getIncreasedNumber(1));
    }
}
