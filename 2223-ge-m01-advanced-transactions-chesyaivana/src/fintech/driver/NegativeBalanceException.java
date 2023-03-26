package fintech.driver;

public class NegativeBalanceException extends Exception{
    public NegativeBalanceException() {
        super("The new transaction caused negative balance!");
    }
}
