package fintech.model;

import fintech.driver.NegativeBalanceException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 12S21051 Martha B Napitupulu
 * @author 12S21053 Chesya Ivana j. m Sitorus
 */
public class Account {

    private String username;
    private String nama;

    private double balance;
    private List<Transaction> transactionList;

    public Account() {
    }

    public Account(String username, String nama) {
        this.username = username;
        this.nama = nama;
        this.transactionList = new ArrayList<>(){};
        this.balance = 0.0f;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printDetails(){
        System.out.printf("%s|%s|%.1f\n",this.username,this.nama,this.balance);
        if(this.transactionList.size() > 0){
            for(int i = 0 ; i < this.transactionList.size() ; i++){
                System.out.println(String.format("%d|%s|",this.getTransactionList().get(i).getTransactionNumber(),this.username) + this.transactionList.get(i).toString());
            }
        }
    }

    public void validateBalance(){
        for(Transaction trx : this.getTransactionList()){
            try{
                this.balance += trx.getNominal();
                if(this.balance < 0){
                    throw new NegativeBalanceException();
                }
            }catch (Exception e){
                this.balance = 0.0f;
                this.getTransactionList().remove(trx);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%.1f", this.username, this.nama, this.balance);
    }
}