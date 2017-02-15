package headfirst._9_templatemethod.barista;

/**
 * Created by WORK_WERT on 15.02.2017.
 */
public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}