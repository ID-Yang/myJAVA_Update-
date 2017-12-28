package practice;
/*
 * 毕姥爷和毕老师的故事*/
class Bilaoye{
  void jiangke() {
    System.out.println("jiangke");
  }
  void diaoyu() {
    System.out.println("diaoyu");
      }
}
class Bilaoshi extends Bilaoye{
  void jiangke() {
    System.out.println("java");
  }
  void kandianying() {
    System.out.println("kandianying");
  }
}
public class DuoTaiDemo2 {
public static void main(String[] args) {
  Bilaoye x=new Bilaoshi();
  x.diaoyu();
  x.jiangke();
  Bilaoshi y=(Bilaoshi)x;
  y.kandianying();
}
}
