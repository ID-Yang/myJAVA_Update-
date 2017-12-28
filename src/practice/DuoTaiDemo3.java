package practice;
/*
多态时，成员的特点：
1 成员变量
编译时：参考引用型变量所属的类中的是否有调用的成员变量，有，编译通过，没有编译失败
运行时：参考引用型变量所属的类中的是否有调用的成员变量，并运行该所属类中的成员变量
简单说，编译和运行都参考等号左边
2 成员函数
3 静态函数
*/
class Fu4{
  int num =3;
  
}
class Zi4 extends Fu4{
  int num=4;
  
}

class DuoTaiDemo3 {
public static void main(String[] args) {
  Fu4 f=new Zi4();
  System.out.println(f.num);
}
}
