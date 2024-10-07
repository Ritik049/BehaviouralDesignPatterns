package StateDesignPattern;

public class NoCoin implements State{

    VendingMachine machine ;

    public NoCoin(VendingMachine machine)
    {
        this.machine = machine;
    }

      public void insertCoin()
      {
          System.out.println("Insert the coin");
          machine.setState(machine.getHasCoinState());  //Changing the state.
      }

      public void ejectCoin()
      {
          System.out.println("No coin to eject");
      }

      public void selectProduct()
      {
          System.out.println("Kindly insert the coin");
      }

      public void dispenseProduct()
      {
          System.out.println("Can not dispense ,kindly insert the coin");
      }
}
