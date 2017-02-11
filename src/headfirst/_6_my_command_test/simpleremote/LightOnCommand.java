package headfirst._6_my_command_test.simpleremote;

/**
 * Created by WORK_WERT on 11.02.2017.
 */
public class LightOnCommand implements Command {
    public Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}