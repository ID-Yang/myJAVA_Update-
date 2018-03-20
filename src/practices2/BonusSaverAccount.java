package practices2;

public class BonusSaverAccount extends SavingsAccount {
private int penalty;
private double bonus;
// konstruktor:
public BonusSaverAccount(int id, double init,double rate) {
  super(id,init,rate);
  penalty=25;
  bonus=0.03;
  }
//Modifizierung der Objekt-Methoden:
public boolean withdraw(double amount) {
  boolean res;
  if (res= super.withdraw(amount+penalty))
    System.out.println("Penalty incurred:\t"+penalty);
  return res;
  
}
public void addInterest() {
  balance =balance *(1+interestRate+bonus);
  System.out.println("Interest added to account:"+account+"\nNew balance:\t"+balance);
}
}
