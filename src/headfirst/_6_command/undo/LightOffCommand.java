package headfirst._6_command.undo;

/**
 * Created by WERT on 11.02.2017.
 */
public class LightOffCommand implements Command {
    Light light;
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(level);
    }
}