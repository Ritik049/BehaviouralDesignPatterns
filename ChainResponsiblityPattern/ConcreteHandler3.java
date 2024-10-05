package ChainResponsibilityPattern;

public class ConcreteHandler3 implements  Handler{

    Handler nextHandler;

    public void setNext(Handler nextHandler)
    {
    //
    }

    public void handleRequest(String request)
    {
        System.out.println("Level3 has handling the request");
    }
}
