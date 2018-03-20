package ws1415PGdP;

public class SubstringRec {
  static boolean containsRec(String a, String b) {
    if (b.isEmpty())
      return true;
    else if (a.isEmpty())
      return false;
    else if (a.charAt(0) == b.charAt(0))
      return containsRec(a.substring(1), b.substring(1));
    else {
      return containsRec(a.substring(1), b);
      return false;// warum noch eine rerturn?????
    }
  }
}
