package ws1415PGdP;
// A2) Loesung Iterator
public class ContainsIter {
static boolean containsIter(String a, String b) {
  if(b.isEmpty()) 
    return true;
    for (int pos=0; pos<=a.length-b.length;pos++) {
      boolean found=true;
      for(int subPos=0; subPos<b.length;subPos++)
      {
       if(a.charAt(pos+subPos)) {
         found=true;
         break;
       }
      }
      if (found)
        return true;
      }
    return false;
      }
   


/*  String a1=a;
  String b1=b;
  
  if(b1.isEmpty()) return true;
  if(a1!=null&&b1!=null) {
    for (int i=0; i<b1.length();i++) {
    for (int j=0; j<a1.length();) {
      if(b1.charAt(i)==a1.charAt(j)) 
        return true;
        break;   
    }
   return false;
  }
    } // 此处要想明白，反复强化
  return false;
  }
*/
 
  




  public static void main(String[] args) {
    // TODO Auto-generated method stub
      boolean x= containsIter("abc","d");
      System.out.println(x);
  }

}
