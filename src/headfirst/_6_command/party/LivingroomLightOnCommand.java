package headfirst._6_command.party;

/**
 * Created by WERT on 11.02.2017.
 */
public class LivingroomLightOnCommand implements Command {
    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}