package headfirst._6_command.remote;

/**
 * Created by WERT on 11.02.2017.
 */
public class LivingroomLightOffCommand implements Command {
    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}