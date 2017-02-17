package headfirst._12_state.gumballstatewinner;

/**
 * Created by WERT on 17.02.2017.
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}