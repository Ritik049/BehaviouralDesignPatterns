package MediatorDesignPattern;

public class Client {

    public static void main(String[]args)
    {

        Component pilot = new Pilot("Harish Pilot");
        Component staff = new Staff("Harish Staff");

        MediatorInterface mediator = new AirPortHeadOfficeMediator(pilot,staff);


        pilot.send("Kakarot plane is going to crash");


    }
}
