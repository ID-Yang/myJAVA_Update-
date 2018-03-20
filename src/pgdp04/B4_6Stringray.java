package pgdp04;

public class B4_6Stringray extends MiniJava {
  public static void main(String[] args) {

    String s = readString("Bitte geben Sie Ihr Text ein:");
    int l = s.length();
    // case 1:
      int count = 0; 
      String a = ""; 
      for (int i = 0; i < 26; i++) { 
        char y = (char) ('A' + i); 
        count=0;
      for (int j = 0; j < l; j++) { 
      char x = s.charAt(j); 
      if ((x == (char) ('A' + i)) || x ==(char) ('a' + i)) { 
        count = count + 1; 
        } 
      } 
      if (count != 0) {
       a += (y + ": " + count + " ");
       }
      }// 此处很重要，可以累计输出循环体的结果。此处为字符串。 } } 
      write(a);
     


    // case 2:
      String t = readString("Bitte geben Sie nacheinander Zwei einzelnen Buchstaben ein: "); 
      char m= t.charAt(0); 
      char n = t.charAt(1); 
      while (t.length() != 2 || m < 'Z' || m > 'z' || (m < 'a'&& m > 'A' || n < 'Z' || n > 'z' || (n < 'a' && n > 'A'))) {
        t = readString("Eingabe geht wohl nix.Bitte geben Sie nacheinander Zwei einzelnen Buchstaben ein: "); 
        m =t.charAt(0); n = t.charAt(1);// 句非常重要，保证了程序的顺利进行。因为c 变化了，变量m 需要重新赋值。此句必须要写。
        }
      char k = 'a'; 
      char g = 'A'; 
      for (int i = 0; i < 26; i++) {
      if (n == (char) ('A' + i) || n ==(char) ('a' + i)) { 
      k = (char) ('a' + i); 
      g = (char) ('A' + i); } }
      
      char k1 = 'a'; 
      char g1 ='A';
     for (int i = 0; i < 26; i++) { 
       if (m == (char) ('A' + i) || m == (char) ('a' + i)) {
         k1= (char) ('a' + i); 
         g1 = (char) ('A' + i); } }
      
     
      String y = "";
      
      for (int i = 0; i < l; i++) { 
        char z = s.charAt(i);
      
      if (z == k1) { 
        y += k;
        } else if (z == g1) {
          y += g; } 
        else { y += z; 
        } 
      } write("Der ersetzt Text ist:" + y);
       
     


// case3:
    int count1 = 0;
    for (int i = 0; i < l; i++) {

      if (s.charAt(i) == ' ') {
        count1 += 1;
      }
    }
    System.out.println(count1);


    int[] arr = new int[count1];
    int i1 = 0;
    for (int j = 0; j < l; j++) {
      if (s.charAt(j) == ' ') {
        // System.out.println(j);
        arr[i1] = j;
        if (i1 < count1 - 1) {
          i1++;
        }
        // System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);// 如何构造数组
      }
    }
    for (int i = 0; i < count1; i++) {
      System.out.println(arr[i]);
    }


    String R = "\"";
    String word = "";
    String satz = "";
    String satz1 = "";
    String satz2 = "";
    String satz3 = "";
    int j1 = arr[0] - 1;
    while (j1 >= 0) {
      word += (s.charAt(j1));
      satz1 = word + ' ';
      if (j1 > 0) {
        j1--;
      } else {
        break;
      }
    }

    for (int i = 0; i < count1 - 1; i++) {
      word = "";
      for (int j = arr[i + 1] - 1; j > arr[i]; j--) {
        word += (s.charAt(j));
      }
      satz += word + ' ';
    }
    satz2 = satz;

    
    word = "";
    for(int j = l - 1;j > arr[count1 - 1];j--)
   {
      word += (s.charAt(j));
    
    }
    satz3=word;



    R = R+satz1 + satz2 + satz3;
    write(R + "\"");
  }
      }


      

