package pgdp04;

public class B4_3Vokal extends MiniJava {

  public static void main(String[] args) {
    String text = "\"Hat der alte Hexenmeister\\n\" +\n" + "sich doch einmal wegbegeben!\\n\" +\n"
        + "Und nun sollen seine Geister\\n\" +\n" + "auch nach meinem Willen leben.\\n\" +\n"
        + "Seine Wort und Werke\\n\" +\n" + "merkt ich und den Brauch,\\n\" +\n"
        + "und mit Geistesstärke\\n\" +\n" + "tu ich Wunder auch.\\n\" +\n"
        + "Walle! walle\\n\" +\n" + "Manche Strecke,\\n\" +\n" + "daß, zum Zwecke,\\n\" +\n"
        + "Wasser fließe\\n\" +\n" + "und mit reichem, vollem Schwalle\\n\" +\n"
        + "zu dem Bade sich ergieße.";

    String c = readString("Bitte geben Sie einen Vokal(a|e|i|o|u|A|E|I|O|U) ein:");
    String k = "aeiou";
    String g = "AEIOU"; 
    char m = c.charAt(0);
    char g1 = 'A';
    char k1 = 'a';

    while (c.length()!=1||(m != 'a' && m != 'e' && m != 'i' && m != 'o' && m != 'u' && m != 'A' && m != 'E'
        && m != 'I' && m != 'O' && m != 'U')) {
      c = readString(
          "Eingabe ist keinen oder Nicht Einen Vokal.Bitte geben Sie EINEN Vokal(a|e|i|o|u|A|E|I|O|U) ein: ");
      m=c.charAt(0);// 此句非常重要，保证了程序的顺利进行。因为c 变化了，变量m 需要重新赋值。此句必须要写。
    }

   
    for (int i = 0; i < 5; i++) {
      if (m == k.charAt(i) || m == g.charAt(i)) {
        k1 = k.charAt(i);
        g1 = g.charAt(i);
      }
    }

    int l = text.length();
    String y = "";

    for (int i = 0; i < l; i++) {
      char z = text.charAt(i);

      if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u') {
        y += k1;

      } else if (z == 'A' || z == 'E' || z == 'I' || z == 'O' || z == 'U') {
        y += g1;
      } else {
        y += z;
      }
    }
    write("der ersetzt Text ist:" + y);
  }
}

