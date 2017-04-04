package headfirst._14_combining.factory;

/**
 * Created by WERT on 04.04.2017.
 */
public class MallardDuck implements Quackable {

    public void quack() {
        System.out.println("Quack");
    }

    public String toString() {
        return "Mallard Duck";
    }
}