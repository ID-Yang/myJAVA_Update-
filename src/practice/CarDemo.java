package practice;
//定义类就是在定义类中的成员。
//成员：成员变量－属性；成员函数－－行为。

class Car {
  int num = 5;
  String color;

  void run() {
    System.out.println(num + "..." + color);
  }
  }
  
  class CarDemo {
    
    public static void main(String[] args) {
      Car c1=new Car();
      Car c2=new Car();
      show (c1);
      show (c2);
    }
//    匿名对象。 
//  1 对象对方法仅进行一次调用的时候，就可以简化成匿名对象。 Car c= new car();
//   c.run();
//    new Car().run();
   // new Car().num=5;
     
      public static void show(Car c) {
       c.num=3;
       c.color="black";
       System.out.println(c.num+"...."+c.color);
  
      }
  }
    
     // Car c1 = new Car();
//      c1.color = "red";
//      c1.num = 6;
      
      
      
//      c1.run();// 对象.成员的形式来完成调用
  
    
