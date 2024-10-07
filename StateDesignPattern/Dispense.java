package StateDesignPattern;

public class Dispense implements State{

    VendingMachine machine;
    public Dispense(VendingMachine machine)
    {
        this.machine = machine;
    }
    public void insertCoin()
    {
        System.out.println("Already has a coin");
    }

    public void ejectCoin()
    {
        if(machine.currentState.equals(machine.getDispenseState())) {
            System.out.println("Coin ejected after subtracting money.");
            machine.setState(machine.getNoCoinState());
        }
        else {
            System.out.println("Kindly insert the coin");
        }

    }

    public void selectProduct()
    {
        System.out.println("Select the product");
        machine.setState(machine.getDispenseState());
    }

    public void dispenseProduct()
    {
        System.out.println("Dispensing the product ....");
    }

}
