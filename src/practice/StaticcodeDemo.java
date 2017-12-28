package practice;

/*
 * //静态代码块. 随着类的加载而执行，而且只执行一次。 作用： 用于给类进行初始化。
 * 
 */
class Staticcode {
  static int num;
  static {
    num = 10;
    num *= 3;
    System.out.println("haha");
  }

  static void show() {
    System.out.println(num);
  }
}


class Baby {
  private String name;

  {//构造代码块。可以对所有对象进行初始化的。
    System.out.println("person run");
    cry();
    }

  Baby()//构造函数是给对应的对象进行针对性的初始化。 
  {
    name = "baby";
    cry();
  }

  Baby(String name) {
    this.name = name;
    cry();
  }

  public void cry() {
    System.out.println("wawagong");
  }

  public void speak() {
    System.out.println("name:" + name);

  }
}


class StaticcodeDemo {
  static {
    System.out.println("a");
  }

  public static void main(String[] args) {
    Baby b1 = new Baby();
    b1.speak();

    Baby b2 = new Baby("wangcai");
    b2.speak();

  }



}

