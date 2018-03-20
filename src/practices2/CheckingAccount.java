package practices2;

public class CheckingAccount extends BankAccount {
  private SavingsAccount overdraft;
  //konstruktor:
  public CheckingAccount(int id,double initial,SavingsAccount savings) 
  {
    super(id,initial);
    overdraft=savings;
    }
  
  //modifiziertes withdraw():
  public boolean withdraw(double amount) {
    if (!super.withdraw(amount)) {
      System.out.print("Using overdraft...");
      if(!overdraft.withdraw(amount-balance)) {
        System.out.println("Overdraft source insufficient.");
        return false;
        
      }
      else {
        balance=0;
        System.out.println("New balance on account"+ account+ ":0");
        
      }
    }
    return true;
    }
  } 