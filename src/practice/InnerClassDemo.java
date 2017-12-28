package practice;
/*
 *内部访问的特点：
 1 内部类可以直接访问外部类中的成员
 2 外部类要访问内部类，必须建立内部类的对象
 
 *
 *
 */

class Outer{
  
private static int num=31;

static class Inner// inner class
  {
   void show() {
      System.out.println("show run"+num);
    }
    
  static void show1() {
     System.out.println("show1 run"+num);
   }
   
  }
public void method() {
Inner in= new Inner();
  in.show();
  
}
}

class InnerClassDemo {
public static void main(String[] args) {
//Outer out = new Outer();
//out.method();// 直接访问外部类中的内部类中的成员
//Outer.Inner in = new Outer().new Inner();
//in.show();
//Outer.Inner in= new Outer.Inner();
Outer.Inner.show1();

}
}
