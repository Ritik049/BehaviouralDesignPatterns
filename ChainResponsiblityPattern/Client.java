package ChainResponsibilityPattern;

public class Client {
public static void main(String[]args) {
        Handler l1 = new ConcreteHandler1();
        Handler l2 = new ConcreteHandler2();
        Handler l3 = new ConcreteHandler3();

        l1.setNext(l2);
        l2.setNext(l3);

        l1.handleRequest("Basic Issue");
        l1.handleRequest("Complex Issue");
        l1.handleRequest("Very complex Issue");

    }
}
