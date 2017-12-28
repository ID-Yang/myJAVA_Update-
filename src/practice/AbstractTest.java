package practice;
 /*
  程序员：属性：姓名，工号，薪水； 行为：工作
  经理：属性：姓名，工号，薪水，奖金； 行为：工作
程序员和经理不存在直接继承关系
但是程序员和经理却有着共性内容
可以进行抽取 得到雇员类  */

abstract class Employee
{
  private String name;
  private String id;
  private double pay;
  Employee(String name,String id, double pay){
    this.name=name;
    this.id= id;
    this.pay= pay;
   
  }public abstract void work();
  
  }
class Programmer extends Employee{
  Programmer(String name, String id, double pay) {
    super(name, id, pay);
  }public void work()
  {
    System.out.println("code...");
  }
   
 class Manager extends Employee{
      private int bonus;
      Manager (String name, String id, double pay,int bonus) {
        super(name, id, pay);
        this.bonus=bonus;
      }public void work()
      {
        System.out.println("manage...");
      }  
}
}

class AbstractTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
class Person{
  private String name;
  private int age;
  Person(String name, int age)
{this.name=name;
this.age=age;
    }
  public String getName() {
    return name;
    
  }
  
  public void setName(String name) {
 this.name=name;
 }}
