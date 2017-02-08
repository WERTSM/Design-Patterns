package headfirst._4_my_factory.pizzafm;

/**
 * Created by WERT on 08.02.2017.
 */
abstract public class Pizza {
    private String name = "Простая пицца";

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Выпекается");
    }

    public void end() {
        System.out.println("Готово");
    }

}