package fintech.model;

/**
 12S21051 Martha Napitupulu
 12S21052 Chesya Sitorus
 */
public class Account {
private final String owner;
private final String name;
private double balance = 0.0;

public Account(String _owner, String _name){
    this.owner = _owner;
    this.name = _name;
}
public String getOwner(){
    return owner;
}

public String getName(){
    return name;
}    

public double getBalance(){
    return balance;
}

@Override
public String toString(){
    // <account-name>|<owner>|<balance>
    return this.name + "|" + this.owner + "|" + this.balance;
}
}