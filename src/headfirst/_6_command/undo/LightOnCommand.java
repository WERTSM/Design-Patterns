package headfirst._6_command.undo;

/**
 * Created by WERT on 11.02.2017.
 */
public class LightOnCommand implements Command {
    Light light;
    int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.on();
    }

    public void undo() {
        light.dim(level);
    }
}