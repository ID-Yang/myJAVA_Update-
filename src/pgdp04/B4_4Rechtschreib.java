package pgdp04;

public class B4_4Rechtschreib extends MiniJava {
  public static void main(String[] args) {

    String s= readString("Bitte geben Sie Ihr Text ein:");
    int l=s.length();
    String x="";
    for(int i=0;i<l;i++) {
      char y=s.charAt(i);
      if('A'<=y && y<='Z') {
        x+=(char)(y+'a'-'A'); 
      }else if('a'<=y && y<='z') {
        x+=(char)(y-'a'+'A');   
      } else {
        x+=y;
      };
    }write(x);
    
    
}
  }
