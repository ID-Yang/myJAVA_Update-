package practice;
/*
 在子父类*/
/*
 当本类的成员和局部变量同名用this区分
 当子父类中的成员变量同名用super区分父类
 this和super很相似, 
 this: 代表一个本类对象的引用。
 super：代表一个父类的空间。
 当类与类之间存在着所属关系的时候，就定义继承。x是y的一种，x extends y.
 所属关系：is a 关系
 
 在子父类中，成员的特点体现。
 1 成员变量
 2 成员函数
 3 构造函数
 
 *
 */

class Fu1 {
int num=4;}

class Zi extends Fu1{
  int num=5;
  void show() {
    System.out.println(this.num+"....."+super.num);
  }
 static class Fu{
  public static void main(String[] args) {
    // TODO Auto-generated method stub
Zi z= new Zi();
    z.show();
  }
 }}
