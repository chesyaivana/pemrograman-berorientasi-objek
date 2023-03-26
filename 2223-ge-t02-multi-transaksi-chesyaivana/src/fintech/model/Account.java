package fintech.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {

    // class definition
    private String owner;
    private String accountName;
    private Float saldo;
    private List<Transaction> transactions;
    
    public Account() {
    }

    

    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.saldo = 0.0f;
        this.transactions = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }



    public void setOwner(String owner) {
        this.owner = owner;
    }



    public String getAccountName() {
        return accountName;
    }



    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }



    public List<Transaction> getTransaction() {
        return transactions;
    }



    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }



    @Override
    public String toString() {
        if (this.transactions.size() > 0) {
            for (Transaction trx : this.transactions) {
                this.saldo += trx.getNominal();
            }
        }
        return String.format("%s|%s|%.1f",accountName,owner,saldo);
    }

    
}