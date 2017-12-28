package practice;

class PersonDemo {
  private int age;
  private String name;

  PersonDemo() {

    this.name = "baby";
    age = 1;
    System.out.println("person run");
  }

  PersonDemo(String name) {
    this();
    this.name = name;
  }

  PersonDemo(String name, int age) {
    name = null;
    this.name = name;// this 也可以用于在构造函数中调用其他构造函数。只能定义在构造函数的第一行。因为初始化过程要最先执行。
    this.age = age;
  }

  public void speak() {
    System.out.println(this.name + ":" + this.age);
  }

  /*
   * 判断是否是同龄人
   */
  public boolean compare(PersonDemo p) {
    /*
     * if (this.age==p.age) return true; else return false;
     */
    return this.age == p.age;
  }


  /*
   * public void haha(int key) { if (key>0&&key<130) age =key;
   * 
   * }
   */
  public void setAge(int a) {
    age = a;
  }

  public int getAge() {
    return age;
  }



  /*为什么要写static*/ 
  static class ThisDemo {
    public static void main (String[] args) {
      PersonDemo p = new PersonDemo("aa", 30);
      PersonDemo p2 = new PersonDemo("bb", 23);
      p2.compare(p);
      // p.haha(20);
      p.setAge(20);
      p.getAge();
      p.speak();
      System.out.println("");

    }
  }
}




