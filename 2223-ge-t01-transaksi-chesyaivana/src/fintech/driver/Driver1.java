package fintech.driver;

import java.util.Scanner;

import fintech.model.Account;

/**
 * @author 12S21053 Chesya Ivana J. M Sitorus
 * @author 12S21051 Martha Britany Napitupulu
 */

public class Driver1 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //command
        String command = scanner.nextLine();
        //owner
        String owner = scanner.nextLine();
        //account-name
        String name = scanner.nextLine();

        Account account = new Account(owner, name);

        System.out.println(account);

        scanner.close();
        
    }
}

