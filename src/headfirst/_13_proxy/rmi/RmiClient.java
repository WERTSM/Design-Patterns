package headfirst._13_proxy.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * -Djava.security.policy=.java.policy
 * <p>
 * Created by WERT on 27.02.2017.
 */
public class RmiClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("MyRemoteObject");
        System.out.println("Было 1 стало после " + stub.getIncreasedNumber(1));
    }
}