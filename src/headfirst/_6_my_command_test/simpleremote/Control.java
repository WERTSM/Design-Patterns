package headfirst._6_my_command_test.simpleremote;

/**
 * Created by WORK_WERT on 11.02.2017.
 */
public class Control {
    Command slotik;

    public Control(){}

    public void setCommand(Command slotik) {
        this.slotik = slotik;
    }

    public void buttonWasPressed() {
        slotik.execute();
    }
}