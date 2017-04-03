package headfirst._13_proxy.gumballmonitor;
/**
 * Created by WERT on 03.04.2017.
 */

import java.io.Serializable;

public interface State extends Serializable {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}