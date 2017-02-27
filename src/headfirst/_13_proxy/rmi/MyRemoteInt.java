package headfirst._13_proxy.rmi;

/**
 * Created by WERT on 27.02.2017.
 */
import java.rmi.Remote;
public interface MyRemoteInt extends Remote{

    String Hello() throws RuntimeException;

}
