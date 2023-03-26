package fintech.driver;

import java.util.ArrayList;
import java.util.Scanner;

import fintech.model.Transaction;

/**
 * @author 12S21051 Martha Britany Napitupulu
 * @author 12S21053 Chesya Ivana J. M Sitorus
 */
public class Driver2 {

    public static void main(String[] _args) {

        Scanner scn = new Scanner(System.in);

        Transaction trData = new Transaction();
        ArrayList<String> allInputan = new ArrayList<>();
        
        Boolean cek = true;

        while (cek) {
            String input = scn.nextLine();

            if (input.equals("---")) {
                cek = false;
            }

            allInputan.add(input);
        }

        for (String perBarisInput : allInputan) {
            try {
                String[] arrInput = perBarisInput.split("#");
                
                String command = arrInput[0];

                switch (command) {
                    case "create-account":
                        String name = arrInput[1];
                        String accountName = arrInput[2];

                        trData.createAccount(name, accountName, 0);
                        break;
                    case "show-accounts":
                        trData.showAccounts();
                        break; 
                    case "remove-account":
                        String accountNameToRemoved = arrInput[1];
                        trData.removeAccount(accountNameToRemoved);
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error Disini");
            }
        }
        
        scn.close();
    }

}