package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;

import javax.sound.sampled.Line;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 12S21051 Martha B Napitupulu
 * @author 12S21053 Chesya Ivana j. m Sitorus
 */
public class Driver1 {

    List<Account> listAccount = new ArrayList<>();

    public static void main(String[] _args) {

        // codes
        Scanner s = new Scanner(System.in);
        Queue<String> queueTrx = new LinkedList<>();
        Queue<String> findAccountCommand = new LinkedList<>();
        Queue<String> transactions = new LinkedList<>();

        while (true) {
            String inputString = s.nextLine();
            if (inputString.equalsIgnoreCase("---")) {
                break;
            }
            // queueTrx.add(inputString);
        }

        for (String command : queueTrx) {
            String[] arrCommand = command.split("#");
            switch (arrCommand[0]) {
                case "create-account":
                    AddAccount(listAccount, new Account(arrCommand[2], arrCommand[1]));
                    break;
                case "show-account":
                    findAccountCommand.add(command);
                    break;
                case "create-transaction":
                    transactions.add(command);
                    break;
            }
        }

        // Output pertama
        for (Account acc : listAccount) {
            System.out.println(acc);
        }

        // Process transaction
        ProcessTransaction(transactions, listAccount);

        // Output find account
        ProcessFindAccount(findAccountCommand, listAccount);
        s.close();

    }

    public static String checkUsername(String username) {
        boolean foundDuplicate = false;
        for(Account a : listAcc){
            if(a.getUsername().equals(acc.getUsername())){
                foundDuplicate = true;
                break;
            }
        }

        if(!foundDuplicate){
            list.add(acc);
            System.out.println(acc);
        }
    }

    public static void ProcessFindAccount(Queue<String> commands, List<Account> list) {
        for (String cmd : commands) {
            String[] arrCommand = cmd.split("#");
            for (Account acc : list) {
                if (acc.getUsername().equalsIgnoreCase(arrCommand[1])) {
                    acc.printDetails();
                }
            }
        }
    }

    public static void ProcessTransaction(Queue<String> commands, List<Account> list) {
        for (String cmd : commands) {
            String[] arrCommand = cmd.split("#");
            for (Account acc : list) {
                if (acc.getUsername().equalsIgnoreCase(arrCommand[1])) {
                    try {
                        Transaction trx = new Transaction(
                                Double.parseDouble(arrCommand[2]),
                                arrCommand[3],
                                arrCommand[4],
                                acc.getTransactionList().size() + 1);
                        acc.getTransactionList().add(trx); // set new balance
                        acc.getTransactionList().sort((t1, t2) -> {
                            try {
                                SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                Date d1 = formatter.parse(t1.getPostedAt());
                                Date d2 = formatter.parse(t2.getPostedAt());
                                return d1.compareTo(d2);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            return 0;
                        });
                    } catch (Exception ignored) {

                    }
                }
            }
        }

        for (Account acc : list) {
            try {
                acc.validateBalance();
            } catch (Exception ignored) {

            }
        }
    }

}