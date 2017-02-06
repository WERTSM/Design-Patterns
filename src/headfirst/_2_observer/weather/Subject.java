package headfirst._2_observer.weather;

/**
 * Created by WERT on 06.02.2017.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}