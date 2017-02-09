package headfirst._5_singleton.chocolate;

/**
 * Created by WERT on 09.02.2017.
 */
public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}