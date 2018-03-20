package pgdp02;

public class B2_8Prim extends MiniJava {
  public static void main(String[] args) {
    int n = read("Bitte geben Sie eine positive Zahl ein: ");

    while (n <= 1) {
      n = read("Keine gueltige Zahl.Bitte Zahl(>=2) eingeben Sie: ");
    }
    int count = 0;
    for (int i = 2; i < n; i += 1) {
      if (n % i == 0) {
        count = count + 1;
      }
    }
    if (count == 0) {
      write(n + "ist eine prime Zahl.");
    }else {
    write(n + "ist keine prime Zahl.");}
  }
}
