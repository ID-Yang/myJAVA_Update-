package practices2;
/*
 * 当成员变量和局部变量重名，可以用关键字this 来区分
 * this 代表对象，代表当前对象。this 就是所在函数所属对象的引用
 * 简单说：哪个对象跳用了this所在函数，this就代表哪个对象。
 * */
public class ThisDemo {
private String name;
private int age;
Person(){
  name="baby";
  age="1";
  System.out.println("person run");
  
}
Person(String name){
  this.name=name;
}

}
