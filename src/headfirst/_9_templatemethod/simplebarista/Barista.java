package headfirst._9_templatemethod.simplebarista;

/**
 * Created by WORK_WERT on 15.02.2017.
 */
public class Barista {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}