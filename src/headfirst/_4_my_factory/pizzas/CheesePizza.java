package headfirst._4_my_factory.pizzas;

/**
 * Created by WERT on 08.02.2017.
 */
public class CheesePizza extends Pizza {

    String name = "Сырная пицца";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void prepare() {
        System.out.println("ГОТОВИТСЯ");
    }
}