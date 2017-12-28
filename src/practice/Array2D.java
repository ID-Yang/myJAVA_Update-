package practice;

public class Array2D {
  public static void main(String[] args) {
    // int[][] arr= new int[3][];

    // System.out.println(arr);
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(arr[2]);
    // System.out.println(arr[0][0]);
    // System.out.println(arr[0][3]);


    int[][] arr = {{3, 1, 7}, {5, 8, 2, 9}, {4, 1}};
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(arr);
    System.out.print("{");
    
    int i, j;
    for (i = 0; i < arr.length-1; i++) {
      System.out.print("{");
      for (j = 0; j < arr[i].length - 1; j++) {
        System.out.print(arr[i][j] + ",");
      }
      System.out.print(arr[i][arr[i].length - 1]+"},");

 }
    
    System.out.print("{");
    for (j = 0; j < arr[i].length - 1; j++) {
      System.out.print(arr[ arr.length-1][j] + ",");
    }
    System.out.print(arr[arr.length-1][arr[i].length - 1]+"}");

    System.out.print("}");
  }
  
  //甲：30 59 28 17 
//  乙：37 60 22 19 
  int[][] arr = {{30, 59,28,17},{37,60,22,19}};
  
  
  
  
  
  
  
}
