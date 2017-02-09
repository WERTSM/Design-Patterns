package headfirst._5_singleton.subclass;

/**
 * Created by WERT on 09.02.2017.
 */
public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton st = Singleton.getInstance();
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(st);
        System.out.println(foo);
        System.out.println(bar);
    }
}