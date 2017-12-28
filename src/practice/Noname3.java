package practice;
/*
 笔记本电脑使用
class Mouse{
 为了扩展笔记本的功能，但日后出现什么功能，设备还不知道
 定义一个规则，只要日后出现的设备都符合这个规则就可以了

  */ 

interface USB{ // 暴露的规则
  public void open();
  public void close();
  
}


class BookPC{
  public static void main(String[] args) {
 //使用规则
  useUSB(new UPan());//功能扩展
  }
  
  public static void useUSB(USB u)// 接口类型的引用，用于接收（指向）接口的子类对象。
  
  {
    u.open();
    u.close();
    
  }}
// one year later
//实现规则
// 这些设备的耦合性降低了
class UPan implements USB{
  public void open() {
    System.out.println("upan open");
  }
  public void close() {
  System.out.println("upan close");
  }
}

