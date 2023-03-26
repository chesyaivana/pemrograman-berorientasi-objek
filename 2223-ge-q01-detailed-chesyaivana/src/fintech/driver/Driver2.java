package fintech.driver;
import java.util.Collections;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;
import fintech.model.*;

/**
 * @author 12S21051 Martha Napitupulu
 * @author 12S21053 Chesya Ivana J. M Sitorus
 */

public class Driver2 {
  public static void main(String[] args) {
    ArrayList<Transaction> transactions = new ArrayList<>();
    HashMap<String, Account> MapAccount = new HashMap<>();
    Scanner entri = new Scanner(System.in);
    TransactionComparator comparator = new TransactionComparator();
    DateFormat formattanggal = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    int transaksiID = 0;

    while (true) {
      String input = entri.nextLine();
      if (input.equals("---")) {
        break;
      }

      String[] part = input.split("#");
      String perintah = part[0];

      if (perintah.equals("create-transaction")) {
        double jumlah = Double.parseDouble(part[2]);
        String username = part[1];
        String keterangan = part[4];
        Date tanggal = null;
        try {
          tanggal = formattanggal.parse(part[3]);
        } catch (ParseException e) {
          e.printStackTrace();
        }
        String katakunci = username.toLowerCase();
        Account account = MapAccount.get(katakunci);
        account.addSaldo(jumlah);
        transaksiID++;
        Transaction transaction = new Transaction(transaksiID, username, jumlah, tanggal, keterangan);
        transactions.add(transaction);
      } else if (perintah.equals("create-account")) {
        String username = part[2];
        String owner = part[1];
        Account account = new Account(owner, username);
        MapAccount.put(username.toLowerCase(), account);
        System.out.println(account.getusername() + "|" + account.getOwner() + "|" + account.getSaldo());
      } else if (perintah.equals("show-account")) {
        String username = part[1];
        String katakunci = username.toLowerCase();
        Account account = MapAccount.get(katakunci);
        System.out.println(account.getusername() + "|" + account.getOwner() + "|" + account.getSaldo());
        Collections.sort(transactions, comparator);
        for (Transaction transaction : transactions) {
          if (transaction.getusername().toLowerCase().equals(katakunci)) {
            System.out.println(transaction.gettransaksiID() + "|" + transaction.getusername() + "|"
                + transaction.getjumlah() + "|" + transaction.gettanggal() + "|" + transaction.getketerangan());
          }
        }
      }
    }
    entri.close();
  }
  
  static class TransactionComparator implements Comparator<Transaction> {
    public int compare(Transaction T1, Transaction T2) {
      return T1.gettanggal().compareTo(T2.gettanggal());
    }
  }
}