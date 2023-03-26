package fintech.driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import fintech.model.Account;
import fintech.model.Transaction;
/**
 * @author 12S21051 Martha Britany Napitupulu
 * @author 12S21053 Chesya Ivana J. M Sitorus
 */
public class Driver3 {

    public static void main(String[] _args) {

        // codes
        Scanner s = new Scanner(System.in);
        Queue<String> queueTrx = new LinkedList<>();
        Queue<String> findAccountCommand = new LinkedList<>();
        Queue<String> transactions = new LinkedList<>();
        List<Account> listAccount = new ArrayList<>();

        while (true) {
            String inputString = s.nextLine();
            if (inputString.equalsIgnoreCase("---")) {
                break;
            }
            queueTrx.add(inputString);
        }

        for (String command : queueTrx) {
            String[] arrCommand = command.split("#");
            switch (arrCommand[0]) {
                case "create-account":
                    AddAccount(listAccount, new Account(arrCommand[1], arrCommand[2]));
                    break;

                case "find-account":
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
    
    public static void AddAccount(List<Account> list, Account acc) {
        list.add(acc);
    }

    public static void ProcessFindAccount(Queue<String> commands, List<Account> list) {
        for (String cmd : commands) {
            String[] arrCommand = cmd.split("#");
            for (Account acc : list) {
                if (acc.getAccountName().equalsIgnoreCase(arrCommand[1])) {
                    System.out.println(acc);
                }
            }
        }
    }

    public static void ProcessTransaction(Queue<String> commands, List<Account> list) {
        for (String cmd : commands) {
            String[] arrCommand = cmd.split("#");
            for (Account acc : list) {
                if (acc.getAccountName().equalsIgnoreCase(arrCommand[1])) {
                    acc.addTransaction(new Transaction(
                        Float.parseFloat(arrCommand[2]),
                        arrCommand[3],
                        arrCommand[4]
                    ));
                }
            }
        }
    }
}