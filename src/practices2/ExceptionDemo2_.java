package practices2;

class Demo{
public int method(int[] arr, int index) {
 if(index>=arr.length)
 {
 throw new ArrayIndexOutOfBoundsException("数组角标越界");
 }
 if (index<0)
 {
   throw new ArrayIndexOutOfBoundsException("数组角标不能为负数");
   }
   return arr[index];
 }
}

public class ExceptionDemo2_ {

  public static void main(String[] args) { 
    {
  int[] arr=new int[3];
  Demo d=new Demo();
  int num;
   num=d.method(arr, 30);
  System.out.println("num="+num);
  System.out.println("over");
    }
  }

}
 