package headfirst._6_command.simpleremote;

/**
 * Created by WERT on 11.02.2017.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}