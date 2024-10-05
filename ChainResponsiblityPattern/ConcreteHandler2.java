package ChainResponsibilityPattern;

public class ConcreteHandler2 implements Handler{
    Handler nextHandler ;

    public void setNext(Handler handler)
    {
        nextHandler = handler;
    }

    public void handleRequest(String request)
    {
        if(request.equals("Complex Issue"))
        {
            System.out.println("Level2 has Handled the request");
        }
        else {
            nextHandler.handleRequest(request);
        }
    }
}
