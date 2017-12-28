package practice;
/*
 final 关键字：
 1 final 是一个修饰符，可以修饰类，方法，变量
 2 final 修饰的类不可以被继承
 3 final 修饰的方法不能被覆盖
 4 final 修饰的变量是一个常量，只能赋值一次 */
class Fu3{
  final void mehtod() {
    //调用了底层系统的资源
  }
}
class Zi3 extends Fu3{
  void methed() 
  {
    int x= 9;
    
    System.out.println(x);
  } 
  
}
 class FinalDemo {

}
