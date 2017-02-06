package headfirst._3_decorator.starbuzz;

/**
 * Created by WERT on 06.02.2017.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}