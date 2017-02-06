package headfirst._2_observer.weather;

/**
 * Created by WERT on 06.02.2017.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}