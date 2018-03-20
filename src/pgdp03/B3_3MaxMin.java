package pgdp03;

public class B3_3MaxMin extends MiniJava {

  public static void main(String[] args) {
    int n = read("Wie viele Zaehle Moechten Sie eingeben?");
    int[] arr = new int[n];
    int j;
    for (j=0;j<n;j++) {
  arr[j] = read("Bitte geben Sie die Zaehle fuer arr["+j+"] ein:");}
  
   /* private static final void writeAr() {
    write();}*/
    System.out.print("Ihre Array ist: " );
    for (j=0;j<n;j++) {
      System.out.print(+arr[j]+" ");
    }
   
 
    int min = arr[0];
    int max = arr[0];
    int temp1, temp2, i;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        temp1 = arr[i];
        arr[i] = min;
        min = temp1;
      }
    }
    write("die kleinste Zahl ist "+min);

    for (i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        temp2 = arr[i];
        arr[i] = max;
        max = temp2;
      }
    }
    write("die groesste Zahl ist "+max);
  }


  }
