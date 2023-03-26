package fintech.model;
    
/**
 * @author 12S21051 Martha Britany Napitupulu
 * @author 12S21053 Chesya Ivana J. M Sitorus
 */
public class Account {
    private String name;
    private String accountName;
    private double balance;

    public Account(String name, String accountName, double balance) {
        this.name = name;
        this.accountName = accountName.toLowerCase();
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transfer(Account target, double amount) {
        withdraw(amount);
        target.deposit(amount);
    }
}