package practices2;

public class BankAccount {
  protected int account;
  protected double balance;

public BankAccount(int id,double initial) {
  account=id;
  balance=initial;
  
  public void deposit (double amount) {
    balance =balance+amount;
    System.out.println(
        "Deposit into account"   +account +"\n"
                +"Amount:\t\t"   +amount  +"\n" 
                +"New balance:\t"+balance);
    
  }
  }
  public boolean withdraw(double amount) {
    System.out.println(
        "Withdrawal from account"+ account+"\n"
        +"Account:\t\t"+amount);
    if(amount > balance) {
      System.out.println("Sorry,insufficient funds....");
      return false;
      
    }
    balance =balance-amount;
    System.out.println("New balance:\t" + balance);
    return true;
    
  }

}


