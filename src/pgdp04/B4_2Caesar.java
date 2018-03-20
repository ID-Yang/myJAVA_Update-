package pgdp04;
/**
 * @author maoying
 * @since 06.01.18
 * @version  原创 我很开心*/
public class B4_2Caesar extends MiniJava {    
    public static void main(String[] args) {

      String s= readString("bitte geben Sie Ihr Text ein:");
      int n= read("Bitte geben Sie eine postive Zahl(<=26 & >=0) ein:");
      while (n < 0)
        {n=n+26;}
      if (n>26)
      {n=n%26;}
    
      write("Ihr Klartext ist: "+s);
      System.out.println("Die zyklische Shift  ist: "+n);
      write("Ihr Geheimtext ist: ");
      int l=s.length();
      String klein="abcdefghijklmnopqrstuvwxyz";
      String gross="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String y="";
      for(int i=0;i<l;i++) {
       char x= s.charAt(i);
      for(int j=0;j<26;j++) {
         if(x==klein.charAt(j)) {
           y+=klein.charAt((j+n)%26);
          
         }
           else if (x==gross.charAt(j)) {
             y+=gross.charAt((j+n)%26);
         }
      } 
      }
      System.out.println(y);
      write(y);
  }

}
