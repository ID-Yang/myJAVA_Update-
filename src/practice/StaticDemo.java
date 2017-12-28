package practice;
class Person2
{
  String name;// 成员变量，实例变量
  
  static String country="CN";//静态变量 类变量
  public void show()
  {
    System.out.println(country+":"+name);
    
  }
  }
//1，static 是一个修饰符，用于修饰成员
//2，static 修饰的成员被所有对象共享
//3，static 优先于对象存在，因为static的成员随着类的加载就已经存在了
//4，static 修饰的成员多了一种调用方式，可以直接被类名所调用 类名，静态成员。
//5，static 修饰的数据是共享数据，对象中存储的是特有的数据。
// 
/*成员变量和静态变量的区别
1 两个变量的生命周期不一样
成员变量随着对象的创建而存在，随着对象的被回收而释放。
静态变量随着类的加载而存在，随着类的消失而消失
2 调用方式不同
 成员变量只能被对象调用
 静态变量可以被对象调用，还可以被类名调用
3 别名不同
 成员变量也称为实例变量
 静态变量也称为类变量
4 数据存储位置不同
成员变量存储在堆内存的对象中，所以也叫对象的特有数据
静态变量数据存储在方法区（共享数据区）的静态区，所以也叫对象的共享数据。

静态使用的注意事项
1，静态方法只能访问静态成员。
2，静态方法不可以使用this或者super。
3, 主函数是静态的。

  */

class StaticDemo {
  int num=4;
  public static void main (String[] args)
  {
//      Person2 p=new Person2();
//      p.name="xiaoqiang";
//      p.show();}
   new StaticDemo().show();
   }
  
  public void show() {
      System.out.println(num);
  }
      
}
