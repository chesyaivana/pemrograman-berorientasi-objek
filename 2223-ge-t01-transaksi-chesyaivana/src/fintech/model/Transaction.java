package fintech.model;

/**
 * @author 12S21053 Chesya Ivana J. M Sitorus
 * @author 12S21051 Martha Brithany Napitupulu
 */
public class Transaction {

    class transaction{
        private int id;
        private Account account;
        private double amount;
        private String postedAt;
        private String note;
    
        public transaction(int id, Account account, double amount, String postedAt, String note) {
            this.id = id;
            this.account = account;
            this.amount = amount;
            this.postedAt = postedAt;
            this.note = note;
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public Account getAccount() {
            return account;
        }
    
        public void setAccount(Account account) {
            this.account = account;
        }
    
        public double getAmount() {
            return amount;
        }
    
        public void setAmount(double amount) {
            this.amount = amount;
        }
    
        public String getPostedAt() {
            return postedAt;
        }
    
        public void setPostedAt(String postedAt) {
            this.postedAt = postedAt;
        }
    
        public String getNote() {
            return note;
        }
    
        public void setNote(String note) {
            this.note = note;
        }
    }

}