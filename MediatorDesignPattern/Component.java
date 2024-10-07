package MediatorDesignPattern;

public interface Component {

    public void setMediator(MediatorInterface mediator);
    public void send(String message);

    public void receive(String message);
}
