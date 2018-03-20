package pgdp02;

public class B2_3Meiern extends MiniJava {
  public static int method(int a, int b) {
    /*
     * int c = 0; if (a != b) { if (a > b) { c = 10 * a + b; } else { c = 10 * b + a; } } else { c =
     * 100 * a + b; } return c;
     */ 
    int c = 0;
    if (a > b) {
      c = 10 * a + b;
    } else if (a < b) {
      c = 10 * b + a;
    } else {
      c = 100 * a + b;
    }
    return c;


  }

  public static void main(String[] args) {
    int a1 = dice();
    int b1 = dice();
    int c1 = method(a1, b1);
    // System.out.println(a1);
    // System.out.println(b1);
    // System.out.println("Du hast " + c1 + " gewürfet.");
    write("Du hast " + c1 + " gewürfet.");
    int a2 = dice();
    int b2 = dice();
    int c2 = method(a2, b2);
    // System.out.println(a2);
    // System.out.println(b2);
    // System.out.println
    write("Computer hat " + c2 + " gewürfet.");
    if (c1 == 21) {
      // System.out.println
      write("Gelückwünsch!du hast gewinnt!");
    } else if (c2 == 21) {
      // System.out.println
      write("Schade!computer hat gewinnt");
    }

    if (c1 != 21 && c2 != 21) {
      if (c1 != c2) {
        if (c1 > c2) {
          // System.out.println
          write("Gelückwünsch!du hast gewinnt!");

        } else {
          // System.out.println
          write("Schade!computer hat gewinnt!");
        }
      } else {

        // System.out.println
        write("Gleich");

      }
    }
  }

}
