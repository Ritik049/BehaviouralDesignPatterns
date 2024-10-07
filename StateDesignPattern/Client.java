package StateDesignPattern;

public class Client {

    public static void main(String[]args)
    {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin();
        machine.selectProduct();
        machine.dispense();
        machine.ejectCoin();
    }
}
