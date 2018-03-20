package pgdp02;

public class B2_4LustigeSieben extends MiniJava {
  public static void main(String[] args) {
    int guthaben = 100;
    int sum = 0;
    int first, second;
    while (guthaben > 0) {
      int field = read("Welche Field moechten Sie auswaehlen?");
      if(field==0) {
        write("Spiel END!");
        return;
      }
      
      while (field < 2 || field > 12) {
        field = read("Welche Field moechten Sie auswaehlen?(2|...|12)");
      }
      write("Sie haben field " + field + " ausgewaehlt");

      
      int einsatz = read("Wie viel Einsatz Moechten Sie zahlen?");

      while (einsatz < 0 || einsatz > guthaben) {
        einsatz =
            read("Ihr Aktuellen Guthaben ist "+guthaben+" Euro. Wie viel Einsatz Moechten Sie zahlen?");
      }

      
      if (einsatz == 0) {
        write("Spiel END!");
        return;}
      else {
        write("Sie haben " + einsatz + " Euro auf die "+field+" gezahlt");
        
      

      int start = read("bitte wuefern Sie! 1 ist Yes oder 0 ist No");
      if (start == 1) {
        first = dice();
        second = dice();
        sum = first + second;
        write("Sie haben insgesamt " + sum + " gewuefelt");
      }
      
      //field==7
      if (field == 7) {
        if (sum == 7) {
          guthaben = guthaben - einsatz + 3 * einsatz;
          int Gewinn = 2 * einsatz;
          write("Sie haben " + Gewinn + " Euro gewinnt");
        } else {
          guthaben = guthaben - einsatz;
          int verlust = 1 * einsatz;
          write("Sie haben "+verlust+" Euro verliert");
        }
      }
      //field <7
      else if (field < 7) {
        if (sum < 7 && sum>0) {
          if (field == sum) {
            guthaben = guthaben - einsatz + 2 * einsatz;
            int Gewinn = 1 * einsatz;
            write("Sie haben " + Gewinn + " Euro gewinnt");
          }else{
          guthaben = guthaben - einsatz + einsatz;
          int Gewinn = 0 * einsatz;
          write("Sie haben " + Gewinn + " Euro gewinnt");}
        }else if (sum==0) {
          write("Spiel END!");
        }
        
        else {
        guthaben = guthaben - einsatz;
        int verlust = 1 * einsatz;
        write("Sie haben "+verlust+" Euro verliert");}
      }
     
      //field>7
      else {
        if (sum > 7) {
          if (field == sum) {
            guthaben = guthaben - einsatz + 2 * einsatz;
            int Gewinn = 1 * einsatz;
            write("Sie haben " + Gewinn + " Euro gewinnt");
          }else {
          guthaben = guthaben - einsatz + einsatz;
          int Gewinn = 0 * einsatz;
          write("Sie haben " + Gewinn + " Euro gewinnt");}
        }else {
        guthaben = guthaben - einsatz;
        int verlust = 1 * einsatz;
        write("Sie haben "+verlust+" Euro verliert");}
      }
      
      write("Ihr aktuelles Guthaben ist " + guthaben+" Euro");
      }}
    write("Ihr Guthaben ist leer. Spiel END");
    }
    }


