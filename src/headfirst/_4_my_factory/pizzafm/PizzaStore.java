package headfirst._4_my_factory.pizzafm;

/**
 * Created by WERT on 08.02.2017.
 */
abstract public class PizzaStore {


    abstract Pizza createPizza(String type);

    public void orderPiza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.end();
        System.out.println(pizza.getName() + " OK");
    }
}