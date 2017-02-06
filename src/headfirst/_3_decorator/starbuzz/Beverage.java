package headfirst._3_decorator.starbuzz;

/**
 * Created by WERT on 06.02.2017.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}