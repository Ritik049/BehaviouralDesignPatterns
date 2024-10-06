package CommandDesignPattern;

public class TurnOnLightCommand implements Command{


    public Light light;

    public TurnOnLightCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
       // System.out.println("Turning on the light....");
        light.turnOn();
    }

    public void undo()
    {
       // System.out.println("Turning off the light....");
        light.turnOff();
    }
}
