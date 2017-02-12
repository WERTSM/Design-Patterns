package headfirst._7_adapter.ducks;

/**
 * Created by WORK_WERT on 12.02.2017.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}