package pgdp02;

public class B2_7ThreeAndSeven extends MiniJava {
  public static void main(String[] args) {
    int n = read("Bitte geben Sie eine positive Zahl ein: "); 
    
  while (n < 0) {
    n = read(
        "Keine negative Anzahl Zeilen erlaubt.Bitte eine gueltige Zahl eingeben Sie: ");
  }
  int sum=0;
  for(int i=0; i<n;i++) {
    if(i%3==0||i%7==0) {
      sum+=i;
    }
  } 
  write("die Summe aller Positiven Zahlen kleiner "+n+" bildet,die durch 3 oder 7 teilbar sind ist: "+sum+".");
  

}}
