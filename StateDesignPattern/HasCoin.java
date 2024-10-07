package StateDesignPattern;

public class HasCoin implements State{
    VendingMachine machine;

    public HasCoin(VendingMachine machine)
    {
        this.machine =machine;
    }
    public void insertCoin()
    {
        System.out.println("Already has a coin");
    }

    public void ejectCoin()
    {
        System.out.println("Coin ejected");
        machine.setState(machine.getNoCoinState());

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
