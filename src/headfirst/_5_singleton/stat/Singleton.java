package headfirst._5_singleton.stat;
/**
 *
 * Created by WERT on 09.02.2017.
 */
public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {	
		return uniqueInstance;
	}
}
