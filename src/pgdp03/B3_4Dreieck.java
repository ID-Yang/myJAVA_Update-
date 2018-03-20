package pgdp03;

public class B3_4Dreieck extends MiniJava {

  public static void main(String[] args) {

    int m = read("Wie viele Zaehle Moechten Sie eingeben?");

    while (m < 0) {
      m = read(
          "Keine negative Anzahl Zeilen erlaubt.bitte eine gueltige Anzahl Zeilen eingeben Sie: ");
    }
    int i = 0, j = 0;
    int[][] a = new int[m][m];
    for (i = 0; i < m; i++) {
      for (j = 0; j <= i; j++) {
        a[0][0] = 1;
        if (j == 0) {
          a[i][j] = 1;
        } else if (i == j) {
          a[i][j] = 1;
        } else if (i > 0 && i < m && j > 0 && j < i) {

          a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
        }
      }
    }

    for (i = 0; i < m; i++) {
      for (j = 0; j < i; j++) {
        System.out.print(a[i][j] + "   ");
      }
      System.out.println(a[i][j] + "   ");
    }
  }
}
