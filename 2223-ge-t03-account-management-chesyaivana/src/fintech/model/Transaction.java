package fintech.model;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 12S21051 Martha Britany Napitupulu
 * @author 12S21053 Chesya Ivana J. M Sitorus
 */
public class Transaction {
        private Queue<Account> accountQueue;
        private LinkedList<Account> accountList;
    
        public Transaction() {
            accountQueue = new LinkedList<>();
            accountList = new LinkedList<>();
        }
    
        public void createAccount(String name, String accountName, double balance) {
            boolean isDuplicate = false;
            if (accountList.size() != 0) {
                for (Account account : accountList) {
                    if (account.getAccountName().equals(accountName.toLowerCase())) {
                        isDuplicate = true;
                        break;
                    }
                }
            }
            if (!isDuplicate) {
                Account newAccount = new Account(name, accountName, balance);
                accountQueue.offer(newAccount);
                accountList.add(newAccount);
                System.out.println(newAccount.getAccountName() + "|" + newAccount.getName() + "|" + newAccount.getBalance());
            }
            sortList();
        }

        public void sortList() {
            Collections.sort(accountList, new Comparator<Account>() {
                @Override
                public int compare(Account o1, Account o2) {
                    return o1.getAccountName().compareToIgnoreCase(o2.getAccountName());
                }
            });
        }
    
        public void processQueue() {
            while (!accountQueue.isEmpty()) {
                Account account = accountQueue.poll();
                System.out.println("Account created: " + account.getAccountName());
            }
        }
    
        public void showAccounts() {
            for (Account account : accountList) {
                System.out.println(account.getAccountName() + "|" + account.getName() + "|" + account.getBalance());
            }
        }

        public void removeAccount(String accountName) {
            accountList.removeIf( account -> 
                account.getAccountName().equals(accountName)
            );
        }

    }
