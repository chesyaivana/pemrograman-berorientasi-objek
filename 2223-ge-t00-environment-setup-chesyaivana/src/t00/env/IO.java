package t00.env;

import java.util.Scanner;

/**
 * @author 12S21053 Chesya Ivana J. M Sitours
 * 
 */
public class IO {
    public static void main(String[] args) {
        String name, nim;
        Scanner mahasiswa = new Scanner(System.in);
        nim = mahasiswa.nextLine();
        name = mahasiswa.nextLine();
        System.out.printf(nim+"|"+name);
    }
}