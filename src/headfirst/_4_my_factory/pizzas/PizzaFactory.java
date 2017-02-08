package headfirst._4_my_factory.pizzas;

/**
 * Created by WERT on 08.02.2017.
 */
public class PizzaFactory {
    Pizza pizza = null;

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("ham")) {
            pizza = new HamPizza();
        }
        return pizza;
    }
}