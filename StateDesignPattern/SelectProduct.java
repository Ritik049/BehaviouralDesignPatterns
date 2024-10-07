package StateDesignPattern;

public class SelectProduct implements State {

    VendingMachine machine ;

    public SelectProduct(VendingMachine machine)
    {
        this.machine = machine;
    }

    public void insertCoin()
    {
        System.out.println("Already has a coin");
    }

    public void ejectCoin()
    {
        System.out.println("Can't eject a coin");
       // machine.setState(machine.getNoCoinState());

    }

    public void selectProduct()
    {
        System.out.println("Select the product");
        machine.setState(machine.getDispenseState());
    }

    public void dispenseProduct()
    {
        System.out.println("Kindly  select the product first");
    }



}
