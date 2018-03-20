package practice;

/*
 * 匿名内部类 就是内部类的简写格式 必须有前提： 内部类必须继承或者实现一个外部类或者接口。 
 * 匿名内部类：其实就是一个匿名子类对象。
 * 格式：new 父类
 */
abstract class Demo4 {
  abstract void show();
}


class Outer4 {
  int num = 4;

  /*
   * class Inner extends Demo4{ void show() { System.out.println("show..."+num); } }
   */
  public void method() {
    new Demo4() {
      void show() {
        System.out.println("show...." + num);
      }
    }.show();
  }
}


class InnerClassDemo4 {
  public static void main(String[] args) {
    new Outer4().method();
  }
}

