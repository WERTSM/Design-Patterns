package headfirst._6_command.simpleremote;

/**
 * Created by WERT on 11.02.2017.
 */
//
// This is the invoker
//
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}