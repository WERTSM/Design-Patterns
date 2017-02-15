package headfirst._9_templatemethod.barista;

/**
 * Created by WORK_WERT on 15.02.2017.
 */
public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}