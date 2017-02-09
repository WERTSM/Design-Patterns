package headfirst._5_singleton.classic;

/**
 * Created by WERT on 09.02.2017.
 */

// NOTE: This is not thread safe!

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
}