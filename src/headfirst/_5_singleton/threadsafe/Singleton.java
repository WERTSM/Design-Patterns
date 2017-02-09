package headfirst._5_singleton.threadsafe;

/**
 * Created by WERT on 09.02.2017.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
}