package StateDesignPattern;

public class VendingMachine {

    State noCoinstate;
    State HasCoinState;
    State SelectProductState;
    State DispenseState;
    State currentState;

    public VendingMachine(){
        noCoinstate = new NoCoin(this);
        HasCoinState = new HasCoin(this);
        SelectProductState = new SelectProduct(this);
        DispenseState  = new Dispense(this);
        currentState = noCoinstate;
    }

    public void insertCoin()
    {
        currentState.insertCoin();
    }

    public void ejectCoin()
    {
        currentState.ejectCoin();
    }

    public void selectProduct()
    {
        currentState.selectProduct();
    }

    public void dispense()
    {
        currentState.dispenseProduct();
    }

    public void setState(State state)
    {
        currentState = state;
    }

    public State getNoCoinState()
    {
        return  noCoinstate;
    }

    public State getHasCoinState()
    {
        return HasCoinState;
    }

    public State getSelectProductState()
    {
        return SelectProductState;
    }

    public State getDispenseState()
    {
        return DispenseState;
    }

}
