package headfirst._6_command.remote;

/**
 * Created by WERT on 11.02.2017.
 */
public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}