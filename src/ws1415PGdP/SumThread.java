package ws1415PGdP;

   import java.util.*;
  public class SumThread{
   public static void main(String[] args) {
       String[] stuff={"a","b","c","d"};
       List<String> l1=Arrays.asList(stuff);
       Collections.sort(l1);
       System.out.printf("%s",l1);
       Collections.reverse(l1);
       System.out.printf("%s",l1);

   }
}
     