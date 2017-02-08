package headfirst._4_my_factory.pizzas;

/**
 * Created by WERT on 08.02.2017.
 */


                                        /*ИДИОМА ПРОГРАММИРОВАНИЯ ПРОСТАЯ ФАБРИКА*/



public class MyPizzaStoreTest {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore ps = new PizzaStore(pizzaFactory);

        ps.orderPiza("cheese");
        ps.orderPiza("ham");
    }
}