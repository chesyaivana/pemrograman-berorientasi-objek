package fintech.driver;
import java.util.Scanner;
import fintech.model.Account;
import fintech.model.Transaction; 
/**
 * @author 12S21053 Chesya Ivana J. M Sitorus
 * @author 12S21051 Martha Brithany Napitupulu
 */
public class Driver2 {

    public static void main(String[] _args) {

public class Driver2 {

    public static void main(String[] _args) {
         class Transaction {
            private Account account;
            private double amount;
            private String postedAt;
            private String note;
        
            public Transaction(Account account, double amount, String postedAt, String note) {
                this.account = account;
                this.amount = amount;
                this.postedAt = postedAt;
                this.note = note;
            }

            public Account getAccount() {
                return account;
            }
        
            public double getAmount() {
                return amount;
            }
        
            public String getPostedAt() {
                return postedAt;
            }
        
            public String getNote() {
                return note;
            }
        
            @Override
            public String toString() {
                // <id>|<account-name>|<amount>|<posted-at>|<note>|<balance>
                return this.account.getName() + "|" + this.amount + "|" + this.postedAt + "|" + this.note + "|" + this.account.getBalance();
            }
    }
  }
}
    }

}
