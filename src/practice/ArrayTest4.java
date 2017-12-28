package practice;

public class ArrayTest4 {

  
public static String getWeek(int num) {

  String[] weeks = {"","1","2","3","4","5","6","7"};
 if (num>7||num<1)
 {
   return "wrong number";}
  
{
  return weeks[num];
  }
  
// System.out.println(weeks[num]);

}

public static void main(String[] args) {

  String week = getWeek(4);
System.out.println(week);
}
} 













