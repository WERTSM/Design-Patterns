package headfirst._6_my_command_test.simpleremote;

/**
 * Created by WORK_WERT on 11.02.2017.
 */
public class LightOffCommand implements Command{
    public Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}