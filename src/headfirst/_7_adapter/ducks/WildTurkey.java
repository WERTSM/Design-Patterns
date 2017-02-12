package headfirst._7_adapter.ducks;

/**
 * Created by WORK_WERT on 12.02.2017.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}