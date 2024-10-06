package CommandDesignPattern;

public class TurnOffLightCommand implements Command{
    public Light light;

    public TurnOffLightCommand(Light light)
    {
        this.light =light;
    }
    public void execute()
    {
        //System.out.println("Turning off the light");
        light.turnOff();
    }

    public void undo()
    {
       // System.out.println("Turning on the light");
        light.turnOn();
    }
}
