package practices2;
/*
 * 必须对多个程序使用同一配置信息对象时，就需要保证该对象的唯一性
 * 如何保证对象唯一性？
 * 1 不允许其他程序用new创建该类对象
 * 2 在该类创建一个本类实例
 * 3 对外提供一个方法让其他程序可以获取该对象
 * 步骤：
 * 1 私有化该类的构造函数
 * 2 通过new 在本类中创建一个本类的对象
 * 3 定义一个公有的方法，将创建的对象 */
class Single1 {
private static Single1 s=new Single1();
private Single1() {}
public static Single1 getInstance() {
  return s;
  }}
class SingleDemo{
  public static void main(String[] args) {
    Single1 ss= Single1.s;
}
}
}
