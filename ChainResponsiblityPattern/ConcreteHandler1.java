package ChainResponsibilityPattern;

import ProxyDesignPattern.Connection;

public class ConcreteHandler1  implements Handler{

     Handler nextHandler ;

    public void setNext(Handler handler)
    {
         nextHandler = handler;
    }

    public void handleRequest(String request)
    {
        if(request.equals("Basic Issue"))
        {
            System.out.println("Level1 has Handled the request");
        }
        else {
            nextHandler.handleRequest(request);
        }
    }



}
