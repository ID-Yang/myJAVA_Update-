package practice;

public class Getmax {
  public static int getMax(int[] arr) {
    int temp1 = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= temp1) {
        temp1 = arr[i];
      }
    }
    return temp1;
  }
  

    public static int getMax2(int[] arr) {
      int temp1 = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= arr[temp1]) {
          temp1 = i;
        }
      }
      return temp1;
    }

  public static void main(String[] args) {
    int[] arr = {-89, -34, -270, -17};
    int max = getMax(arr);
    int max2 = getMax2(arr);

    System.out.println("max=" +max); 
    System.out.println("max2=" + max2);
    System.out.println("arr[max2]=" + arr[max2]);
  }
}

