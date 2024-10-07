package MediatorDesignPattern;

public class Staff implements Component{

    String name;
    MediatorInterface mediator;

    public Staff(String name)
    {
        this.name = name;
      //  this.mediator = mediator;
    }

    public void setMediator(MediatorInterface mediator)
    {
        this.mediator = mediator;
    }
    public void send(String message)
    {
        mediator.notify(message);
    }

    public void receive(String message)
    {
        System.out.println(message + "recieved by "+name);
    }
}
