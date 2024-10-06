package CommandDesignPattern;

public class Client {

    public static void main(String[]args)
    {
        RemoteControlInvoker remote  = new RemoteControlInvoker();
        Light light = new Light();

        Command c1  = new TurnOnLightCommand(light);
        Command c2 = new TurnOffLightCommand(light);


        remote.setCommand(c1);
        remote.pressButton();

        remote.setCommand(c2);
        remote.pressButton();

        remote.undo();
        remote.undo();
    }
}
