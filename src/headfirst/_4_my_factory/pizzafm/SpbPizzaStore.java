package headfirst._4_my_factory.pizzafm;

/**
 * Created by WERT on 08.02.2017.
 */
public class SpbPizzaStore extends PizzaStore{
    Pizza pizza = null;

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new SpbCheesePizza();
        } else if (type.equals("ham")) {
            pizza = new SpbHamPizza();
        }
        return pizza;
    }
}