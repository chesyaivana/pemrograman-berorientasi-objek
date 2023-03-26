package fintech.model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 12S21051 Martha Napitupulu
 * @author 12S21053 Chesya Ivana J. M Sitorus
 */

public class Transaction {
  private Date tanggal;
  private String username;
  private int transaksiID;
  private String keterangan;
  private double jumlah;

  public Transaction(int transaksiID, String username, double jumlah, Date tanggal, String keterangan) {
    this.transaksiID = transaksiID;
    this.username = username;
    this.jumlah = jumlah;
    this.tanggal = tanggal;
    this.keterangan = keterangan;
  }

  public String getusername() {
    return this.username;
  }

  public int gettransaksiID() {
    return this.transaksiID;
  }

  public String gettanggal() {
    DateFormat formattanggal = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String outputDate = formattanggal.format(this.tanggal);
    return outputDate;
  }

  public String getketerangan() {
    return this.keterangan;
  }

  public double getjumlah() {
    return this.jumlah;
  }

  @Override
  public String toString() {
    return this.gettransaksiID() + "|" + this.getusername() + "|" + this.getjumlah() + "|" + this.gettanggal() + "|" + this.getketerangan();
  }
}