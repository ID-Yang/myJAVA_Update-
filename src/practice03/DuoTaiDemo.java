package practice03;
/*
 *对象的多态性
 *class Animal
 *class Cat extends animal {}
 *class Dog extends animal {}
 *Animal x=new Cat();
 *Cat x= new Cat();
 *猫这类事物，既具备猫的形态，也具备动物的形态。这就是对象的多态性
 *一个对象对应着不同类型。多态在代码中的体现就是父类或者接口指向其子类的对象。
 *
 *多态的好处：
 *提高了代码的拓展性。
 *
 *多态的弊端
 *父类定义的内容不能调用子类特有的功能。
 *
 *多态的前提：
 *1 必须有关系，继承或者实现。
 *2 要有覆盖。overwrite
 *3 
 *
 *
 *
public class DuoTaiDemo {
  public static void method(Animal a) {
    a.eat();
    if(a instanceof Cat) // instanceof 用于判断对象的具体类型，只能用于增强代码的健壮性
      {
      Cat c=(Cat) a;
      c.catchMouse();
     
    }else if(a instanceof Dog) {
      Dog d
    }
  }

}

 *
 *多态时，成员的特点：
 *成员的特点：
 *1 成员变量
 *   编译时：参考引用型变量所属的类中是否有调用的成员变量，有，编译通过；没有编译失败；
 *   运行时：参考引用型变量所属的类中是否有调用的成员变量，并运行该所属类中的成员变量；
 *   简单说：编译和运行都参考等号的左边。
 *2 成员函数：
 *   编译时：参考引用型变量所属的类中是否有调用的函数，有，编译通过，没有编译失败；（从上往下看）
 *   运行时：参考对象中是否有调用的函数（从下往上看）
 *   简单说：编译看左边，运行看右边。
 *3 静态函数
 *    编译和运行都参考所属类中是否有调用的静态方法。
 *    简单说：编译和运行都看左边。
 *    其实对于静态方法，是不需要对象的，直接用类名调用即可。
 *     
 *   
 *
 *
 *
 *
 *
 *
 **/

class Fu{
  int num=3;
  
}class Zi extends Fu{
  int num=4;
  
}
class DuoTaiDemo{
  public static void main(String[] args) {
    Fu f= new Zi();
    System.out.println(f.num);
  }
}































