package practice;
/*
多态时，成员的特点：
1 成员变量
编译时：参考引用型变量所属的类中的是否有调用的成员变量，有，编译通过，没有编译失败
运行时：参考引用型变量所属的类中的是否有调用的成员变量，并运行该所属类中的成员变量
简单说，编译和运行都参考等号左边
2 成员函数（非静态）
编译时：参考引用型变量所属的类中的是否有调用的函数，有，编译通过，没有，编译失败
运行时：参考的是对象所属的类中是否有调用函数
简单说：编译看左边，运行看右边

3 静态函数
编译时：参考引用型变量所属的类中的是否有调用的静态方法。
运行时：参考引用型变量所属的类中的是否有调用的静态方法。
简单说：编译和运行都看左边。 
对于静态方法，不需要对象，直接用类名调用即可。
*/
class Fu4{
  int num =3;
  void show() {
    System.out.println("fu show");
  }
  static void method() {
    System.out.println("Fu4 static method");  
    
  }
}

class Zi4 extends Fu4{
  int num=4;
   void show() {
    System.out.println("zi show");
  }
  
  static void method() {
System.out.println("zi static method");  
}

static class DuoTaiDemo3 {
public static void main(String[] args) {
//  Fu4 f=new Zi4();
//  f.show();
  Fu4.method();
//  System.out.println(f.num);
}}}
