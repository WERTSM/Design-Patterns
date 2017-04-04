package headfirst._14_combining.factory;

/**
 * Created by WERT on 04.04.2017.
 */
public class DuckCall implements Quackable {

    public void quack() {
        System.out.println("Kwak");
    }

    public String toString() {
        return "Duck Call";
    }
}