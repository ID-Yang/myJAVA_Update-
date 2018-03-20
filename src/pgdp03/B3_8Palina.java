package pgdp03;

public class B3_8Palina extends MiniJava {

  public static void main(String[] args) {

    int n = read("Wie viele Zaehle Moechten Sie eingeben?");

    while (n < 0) {
      n = read(
          "Keine negative Anzahl Zeilen erlaubt.bitte eine gueltige Anzahl Zeilen eingeben Sie: ");
    }

    int k = 0;
    for (int t = n; t > 0; k++) {
      t = t / 10;
    }//计算k，可以确定数组的index，确保空间充分利用。


    int a = 0;
    int b = 1;
    int sum = 0;
    int m = n;
    int[] arr = new int[k];
    for (int i = 0; i < k; i++) {  //oder for (int i = 0; m > 0; i++)
      arr[i] = m % 10;
      m=m/10;
      a =arr[i];
      b = a;
      for (int j=0; j<k-1-i; j++) {
        b = b * 10;
      }
      sum += b;
    }

    System.out.println(sum);
    if (sum == n) {
      write(n + " ist Palindrom");

    } else {
      write(n + " ist kein Palindrom");
    }

  }
}
