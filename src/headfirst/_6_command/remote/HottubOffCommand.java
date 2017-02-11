package headfirst._6_command.remote;

/**
 * Created by WERT on 11.02.2017.
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }
}