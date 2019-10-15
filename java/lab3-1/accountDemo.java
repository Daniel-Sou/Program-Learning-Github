public class accountDemo {
  private double balance;

  public accountDemo() {
    balance = 0.0;
  }

  public void deposit (double amount) {
    balance += amount;
  }

  public void withdraw (double amount) {
    balance -= amount;
  }

  public double getBalance() {
    return balance;
  }
}