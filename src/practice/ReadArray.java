package practice;

public class ReadArray extends MiniJava{ 
  public static int[] readArray(int number) {
    int [] a= new int[4];
    for (int i=0;i<a.length; ++i) {
      a[i]=read();
      
    }
    return a;
  }
 }
