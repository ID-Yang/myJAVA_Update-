package practice;
//1 提高代码的复用性
//2 让类与类之间产生了关系，给多态提供了前提。
//java支持单继承，不直接支持多继承，但对c++中的多继承进行了改良。
//java不直接支持，是因为多个父类中有相同的成员，会产生调用的不确定性
//在java中是通过多实现实现的。

//java支持多层继承。


class Person3{
  String name;
  int age;
}

class Student extends Person3{
//  String name;
//  int age;
  void study() {
    System.out.println("student study"+age);
  }
}
class Worker extends Person3{
//  String name;
//  int age;
  void work() {
    System.out.println("worker works");
  }
}

class ExtendsDemo {
 
}
