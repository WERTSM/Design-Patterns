package headfirst._6_my_command.simpleremote;

/**
 * Created by WORK_WERT on 11.02.2017.
 */
public class PultTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand onCk = new LightOnCommand(light);
        Control control = new Control();
        control.setCommand(onCk);
        control.buttonWasPressed();
    }
}