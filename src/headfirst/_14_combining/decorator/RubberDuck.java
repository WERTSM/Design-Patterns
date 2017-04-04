package headfirst._14_combining.decorator;

/**
 * Created by WERT on 04.04.2017.
 */
public class RubberDuck implements Quackable {

    public void quack() {
        System.out.println("Squeak");
    }

    public String toString() {
        return "Rubber Duck";
    }
}