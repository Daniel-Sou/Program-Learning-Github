public class CreditCard {

  // 01 - instance variables & Fields
  private String customer; // name of customer
  private String bank; // name of bank
  private String account; // account identifier
  private int limit; // credit limit (measured in dollars)
  protected double balance; // current balance (measured in dollars)

  // 02 - Constructors
  public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
    customer = cust;
    bank = bk;
    account = acnt;
    limit = lim;
    balance = initialBal;
  }

  // 03 - Methods
  public CreditCard(String cust, String bk, String acnt, int lim) {
    this(cust, bk, acnt, lim, 0.0); // Use a balance of zero as default
  }

  // Accessor methods
  public String getCustomer(){return customer;}
  public String getBank(){return bank;}
  public String getAccount(){return account;}
  public int getLimit() {return limit;}
  public double getBalance() {return balance;}

  // Update methods
  public boolean charge(double price) { // make  charge
    if (price + balance > limit) // if charge would surpass limit
      return false; // refuse the charge
    
    balance += price; // Update the balance
    return true; // Announce the good news
  }

  // Make a payment
  public void makePayment(double amount) {
    balance -= amount;
  }

  // Utility method to print a card's information
  public static void printSummary(CreditCard card) {
    System.out.println("Customer = " + card.customer);
    System.out.println("Bank = " + card.bank );
    System.out.println("Account = " + card.account);
    // Implicit cast (Balance & Limit)
    System.out.println("Balance = " + card.balance);
    System.out.println("Limit = " + card.limit);
  }
  
  // Main method shown on below code
  public static void main(String[] args) {
    CreditCard[] wallet = new CreditCard[3]; 
    
    // Set three value under method
    wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
    wallet[1] = new CreditCard("John Bowman", "California Federal", "5391 0399 3395 1954", 3500);
    wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

    for (int val  = 1; val <= 16; val++) {
      wallet[0].charge(3 * val);
      wallet[1].charge(2 * val);
      wallet[2].charge(val);
    }

    for (CreditCard card : wallet) {
      // Calling static method
      CreditCard.printSummary(card);

      while (card.getBalance() > 200.0) {
        card.makePayment(200);
        System.out.println("New Balance = " + card.getBalance() + "\n");
      }
    }
  }
}