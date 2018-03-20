package practices2;

public class Bank {
  public static void main(String[] args) {
    SavingAccount savings = new SavingAccount(4321, 5028.45, 0.02);
    BonusSaverAccount bigSavings = new BonusSaverAccount(6543, 1475.85, 0.02);
    checkingAccount checking = new CheckingAccount(9876, 269.93, savings);
    savings.deposit(148.04);
    System.out.println();
    bigSavings.deposit(414.52);
    System.out.println();
    savings.withdraw(120.38);
    System.out.println();
    checking.withdraw(320.18);
    System.out.println();

    
  }
}


