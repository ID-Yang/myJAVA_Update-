package practice;
/* ？？？？？？？？？？？？？？？？？？？
 内部类可以存放在局部位置上
 
 内部类在局部位置上只能访问局部中被final修饰的局部变量*/

class Outer2 {
  int num = 3;
   Object method() 
  {
   final int x = 9;
   
      class Inner 
      {
      void show()
      {
        System.out.println("show" +x);
      }
      }
    Object in = new Inner();
    return in;
//    in.show();
  }
}
class InnerClassDemo3 {
  public static void main(String[] args) {
//    new Outer2().method();
    
    Outer2 out=new Outer2();
    Object obj=out.method();
    }

}

//class  Zi extends Fu{
//  Fu f=new Zi();/
//  object o=new Fu();

