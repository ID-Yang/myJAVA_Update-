package practices2;

public class SavingsAccount extends BankAccount{
protected double interestRate;
//Konstruktor:
public SavingsAccount(int id, double init, double rate) { 
  super(id,init);
  interestRate=rate;
}
// zusaetzliche Objekt-Methode:
public void addInterest() {
  balance =balance *(1+interestRate);
  System.out.println(
      "Interest added to account:"+account+"\nNew balance:\t"+balance);
}

  
}

