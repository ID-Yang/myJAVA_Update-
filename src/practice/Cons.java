package practice;
class Person1 {
  private String name;
  private int age;
  Person1() // 构造函数，而且是空参数。
  {
    name = "baby";
    age = 1;
    System.out.println("person run");
  }

  Person1(String name) {
    this.name = name;// 哪个对象调用了this所在的函数，this 就代表哪个对象。
    System.out.println(name);
  }
  public void setName(String n) {
    name = n;
  }
  public void speak() {
    System.out.println(name + ":" + age);
  }
}
/*
 * 一个类中如果没有定义构造函数，那么该类中会有一个默认的构造函数。 一般函数和构造函数什么区别？ 构造函数：对象创建时，就调用与之对应的构造函数，对对象进行初始化。
 * 一般函数：对象创建后，需要函数功能时才调用。 构造函数：对象创建时，调用函数且只调用一次。 一般函数：对象创建后，可以被多次调用。
 * 
 * 在描述事物时，该事物已存在就具备一些内容，这些内容就定义在构造函数中* 
 */
class ConsDemo {
  public static void main(String[] args) {
    Person1 p = new Person1();
    Person1 p1 = new Person1("wangwang");
  }
}


