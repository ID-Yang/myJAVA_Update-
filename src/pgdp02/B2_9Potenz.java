package pgdp02;

public class B2_9Potenz extends MiniJava {
  public static void main(String[] args) {
    int n = read("Bitte geben Sie eine positive Zahl ein: ");

    while (n < 0) {
      n = read("Keine gueltige Zahl.Bitte Zahl(>=2) eingeben Sie: ");
    }
    System.out.print("\\begin{tabular}{");
    // writeConsole("\\b begin{tabular}{");
    for (int i = 0; i < n; i++) {
      System.out.print("1");
      // writeConsole("1");
    }
    System.out.println("}");
    // writeConsole("}");
     int b; int i = 1;

    for (i = 1; i <= n; i++) {
      System.out.print("1");
        b=1;
      // writeConsole(" & ")
      for (int j =1 ; j < n; j++) {
        b *= i;
        System.out.print(" & " + b);
      }
      System.out.println("\\\\");
    }
    System.out.println("\\end{tabular}");

  }
}
