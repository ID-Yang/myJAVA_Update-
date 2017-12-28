package practice;

public class Jinzhi {


  /**
   * @param num
   */
  static void toHex(int num) {
    char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    int temp = 0;
    for (int x = 0; x < 8; x++) {

      temp = num & 15;
      System.out.print(arr[temp]);
      num = num >>> 4;}
  }
  public static void toHex2(int num) {
    char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    int index = 0;
    char[] a = new char[8];
    while (num != 0) {
      int temp = num & 15;
      a[index++] = arr[temp];
      num = num >>> 4;
    }
    // System.out.println(index);    
    for (int i = index; i >= 0; i--) {
      System.out.println(a[i]);
    }
  }

  public static void toHex3(int num) {
    if (num == 0) {
      System.out.println("0");
      return;
    }

    char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    int index = 7;
    char[] a = new char[8];
    while (num != 0) {
      int temp = num & 15;
      a[index--] = arr[temp];
      num = num >>> 4;
    }
    // System.out.print(index);

    for (int i = index + 1; i <= 7; i++) {
      System.out.print(a[i]);
    }
  }
  
  // 十进制－－>十六进制
  public static void toHex0(int num) {
    trans(num, 15, 4);
  }

  // 十进制－－>二进制
  public static void toBinary(int num) {
    trans(num, 1, 1);

  }

  // 十进制－－>八进制
  public static void toOctal(int num) {
    trans(num, 7, 3);

  }

  public static void trans(int num, int base, int offset) {
    if (num == 0) {
      System.out.println("0");
      return;
    }
    char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    char[] a = new char[32];
    int index = a.length-1;
    while (num != 0) {
      int temp = num & base;
      a[index--] = arr[temp];
      num = num >>> offset;
    }
    System.out.println(index);

    for (int i = index+1; i < a.length; i++) 
    {
      System.out.print(a[i]);
 
    }
   System.out.println();
  }
  
  public static void main(String[] args) {
   
    // toHex(60);
    // toHex2(60);     
    //toHex3(60);
//    toHex0(60);
toBinary(-6);
//    toOctal(60);
System.out.println(Integer.toBinaryString(-6));
System.out.println(Integer.toOctalString(60));
System.out.println(Integer.toHexString(60));
  }
  

} 


