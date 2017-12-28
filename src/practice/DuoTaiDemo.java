package practice;
/*
 * 对象的多态性
 * class 动物{
 * }
 
 多态的好处：
 提高代码的扩展性，前期定义的代码可以使用后期的内容。
 多态的弊端：
 前期定义的内容不能使用（调用）后期子类的特有内容。
 多态的前提：
 1 必须有关系，要么继承，要么实现。
 2 要有覆盖
 
 * 
 * 
 * */

abstract class Animal{
  abstract void eat(); 
}
class Dog1  extends Animal{
  void eat() {
    System.out.println("kengutou");
  }
  void lookHome() {
    System.out.println("kanjia");
    
  }
}
class Cat extends Animal{
  void eat() {
    System.out.println("chiyu");
  }
  void catchMouse() {
      System.out.println("zhuolaoshu");
      
    }
  }

public class DuoTaiDemo {
public static void main(String[] args) {
Animal a =new Cat();// 自动类型提升，猫对象提升了动物类型，但是特有功能无法访问。但是限制对特有功能的访问。专业讲：向上转型。
a.eat();
  //如果还想用具体动物猫的特有功能，还可以将该对象向下转型。
Cat c =(Cat) a;//向下转型的目的是为了使用子类中的特有方法。
c.eat();
c.catchMouse();
//注意：对于转型，自始自终都是子类对象在做着类型的变化。
//Animal b= new Dog1();
//Cat c1=(Cat)b;// ClassCastException


  /*Cat c= new Cat();
Dog1 d= new Dog1();
method(c);
method(d);
*/

}
public static void method(Animal a) {
  a.eat();
  if(a instanceof Cat) {// instanceof:用于判断对象的具体类型。通常在向下转型前，用于健壮性的判断。
  Cat c =(Cat)a;
  c.catchMouse();
  }
  else if (a instanceof Dog1) {
    Dog1 d=(Dog1)a;
    d.lookHome();
  }
  }
//public static void method(Cat c) {
//  c.eat();}
  public static void method(Dog1 d) {
    d.eat();
}
}
