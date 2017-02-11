package headfirst._6_command.undo;

/**
 * Created by WERT on 11.02.2017.
 */
public class DimmerLightOnCommand implements Command {
    Light light;
    int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.dim(75);
    }

    public void undo() {
        light.dim(prevLevel);
    }
}