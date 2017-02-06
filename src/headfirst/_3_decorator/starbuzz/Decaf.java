package headfirst._3_decorator.starbuzz;

/**
 * Created by WERT on 06.02.2017.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}