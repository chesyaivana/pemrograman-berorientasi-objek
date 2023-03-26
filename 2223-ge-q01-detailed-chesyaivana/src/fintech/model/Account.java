package fintech.model;

/**
 * @author 12S21051 Martha Napitupulu
 * @author 12S21053 Chesya Ivana J. M Sitorus
 */
public class Account {
  private double saldo;
  private String owner;
  private String username;

  public String getOwner() {
    return this.owner;
  }

  public Account(String owner, String username) {
    this.owner = owner;
    this.username = username;
    this.saldo = 0.0;
  }

  public void addSaldo(double jumlah) {
    this.saldo += jumlah;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public String getusername() {
    return this.username;
  }

  @Override
  public String toString() {
    return this.getusername() + "|" + this.getOwner() + "|" + this.getSaldo();
  }
}