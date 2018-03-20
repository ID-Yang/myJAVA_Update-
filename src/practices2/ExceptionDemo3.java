package practices2;
/*
 * 异常的分类：
 * 1 编译时的被检测异常：只钥匙exception 和其子类都是
 * 除了特殊子类RuntimeException体系
 * 这种问题一旦出现，希望在编译时就进行检测，让这样的问题都可以进行针对性的处理。
 * 2 编译时不检测异常：RuntimeException体系。这种问题的发生，无法让功能继续，运算无法进行，更多是因为调用者的原因导致的，或者引发了内部状态的改变，那么这种问题一般不处理，直接编译通过，在运行时强制停止。
 * 
 * 
 * 异常处理的捕捉形式：
 * 还是可以对异常类进行针对性处理的方式
 * 具体格式是：
 * try {// 需要被检测异常的代码
 * } 
 * catch（异常类 变量）
 *
 * finally //通常用于关闭（释放）资源。
 * 
 * */

class FuShuIndexException extends Exception{
  
}
public class ExceptionDemo3  {
    class Demo{
    public int method(int[] arr, int index) throws FuShuIndexException {
     if(index>=arr.length)
     {
     throw new ArrayIndexOutOfBoundsException("数组角标越界");
     }
     if (index<0)
     {
       throw new FuShuIndexException("数组角标不能为负数");
       }
       return arr[index];
     }
    }

    public class ExceptionDemo2_ {

      public static void main(String[] args) throws FuShuIndexException { 
      int[] arr=new int[3];
      Demo d=new Demo();
      int num;
       num=d.method(arr, 30);
      System.out.println("num="+num);
      System.out.println("over");
        }
      }

     
  }

