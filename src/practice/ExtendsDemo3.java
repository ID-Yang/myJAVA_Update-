package practice;
// 当子父类中出现成员函数一模一样的情况，会运行子类的函数。
// 这种现象，称为覆盖操作，这是函数在子父类中的特性。
// 函数两个特性：
// 1 重载。同一个类中。overlaod
// 2 覆盖。子类中，覆盖也称为重写，覆写。
// 覆盖的注意事项：
// 1 子类方法覆盖父类时，子类权限必须要大于等于父类的权限。


class Fu {
  void show1() {
    System.out.println("fu show run");
  }
}


class Zi1 extends Fu {
  void show2() {
    System.out.println("Zi show run");
  }
}


class ExtendsDemo3 {
  public static void main(String[] args) {
    Zi1 z = new Zi1();
    z.show1();
    z.show2();

  }
}


class Phone {
  void call() {}

  void show() {
    System.out.println("number");
  }
}


class Newphone extends Phone {
  void Show() {
    super.show();
    System.out.println("name");
    System.out.println("pic");
  }
}
