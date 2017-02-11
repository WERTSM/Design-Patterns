package headfirst._6_command.party;

/**
 * Created by WERT on 11.02.2017.
 */
public interface Command {
    public void execute();

    public void undo();
}