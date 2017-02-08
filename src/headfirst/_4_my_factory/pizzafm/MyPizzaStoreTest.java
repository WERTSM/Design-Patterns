package headfirst._4_my_factory.pizzafm;

/**
 * Created by WERT on 08.02.2017.
 */


                                        /*ИДИОМА ПРОГРАММИРОВАНИЯ ПРОСТАЯ ФАБРИКА*/



public class MyPizzaStoreTest {
    public static void main(String[] args) {

        PizzaStore pm = new MoscowPizzaStore();
        pm.orderPiza("cheese");
        pm.orderPiza("ham");
        PizzaStore pp = new SpbPizzaStore();
        pp.orderPiza("cheese");
        pp.orderPiza("ham");

    }
}