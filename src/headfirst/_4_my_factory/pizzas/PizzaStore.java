package headfirst._4_my_factory.pizzas;

/**
 * Created by WERT on 08.02.2017.
 */
public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPiza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.end();
        System.out.println(pizza.getName() + " OK");
    }
}