package headfirst._13_proxy.gumball;
/**
 * Created by WERT on 23.02.2017.
 */
import java.rmi.*;
 
public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}