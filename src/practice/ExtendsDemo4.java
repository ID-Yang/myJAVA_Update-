package practice;


/*
子类实例化的时候要访问父类中的构造函数呢？
子类继承父类，获取到了父类中的内容（属性），所以在使用父类内容之前，要先看父类是如何对自己的内容进行初始化的* */
//在子类的构造函数中加入super()语句
//如果父类中没有定义空参数构造函数，子类的构造函数必须用super明确要调用的父类中哪个构造函数。同时，子类构造函数中如果使用this调用了本类的构造函数时。
//那么super就没有了，因为super和this都只能放在第一行。


//注意：super语句必须要定义在子类的构造函数的第一行，因为父类的初始化要最先完成。


class Fu2{
  Fu2(){
  System.out.println("fu2 run");
  }
}
class Zii extends Fu2{
    // TODO Auto-generated constructor stub
  void zi(){
//    super ();// 
  }
 Zii(int x){}
  
}
class ExtendsDemo4 {
public static void main(String[] args) {
  new Zii(6);
  
}
}

/*
 一个对象实例化过程：
 Person p= new Person();
 1 JVM 会读取指定的路径下的person。class文件，并加载进内存，
并会先加载Person的父类（如果有直接的父类的情况下）
2 在堆内存中开辟空间，分配地址。
3 并在对象空间中，对对象中的属性进行默认初始化。
4 调用对应的构造函数进行初始化
5 在构造函数中，第一行会先到调用父类中构造函数进行初始化。
6 父类初始化完毕后，在对子类的属性进行显示初始化
7 在进行子类构造函数进行初始化
8 初始化完毕后，将地址值赋值给引用变量。
  * 
 * 
 * */
