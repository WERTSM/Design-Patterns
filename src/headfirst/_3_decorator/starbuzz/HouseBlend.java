package headfirst._3_decorator.starbuzz;

/**
 * Created by WERT on 06.02.2017.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}