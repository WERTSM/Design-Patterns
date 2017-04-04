package headfirst._14_combining.adapter;

/**
 * Created by WERT on 04.04.2017.
 */
public class DecoyDuck implements Quackable {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}