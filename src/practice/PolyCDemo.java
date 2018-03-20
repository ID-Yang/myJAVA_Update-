package practice;
class PolyC{
  public String greet() {
    return "Hello";  }
  
}
public class PolyCDemo {
public void main(String[] args)
{
  Object x = new PolyC();
  if (x instanceof PolyC)
    System.out.println(((PolyC)x).greet()+"World!");
  else 
      System.out.print("Cast not possible!\n");
 
    }
}