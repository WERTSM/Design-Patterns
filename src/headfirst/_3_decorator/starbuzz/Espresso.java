package headfirst._3_decorator.starbuzz;

/**
 * Created by WERT on 06.02.2017.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}