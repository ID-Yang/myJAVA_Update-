package pgdp03;


public class B3_7Feld extends MiniJava {

  public static void main(String[] args) {
    int n = 0;
    n = read("Wie viele Zaehle Moechten Sie eingeben?");

    while (n < 2) {
      n = read("Bitte mindesten 2 Elemente eingeben Sie.Wie viele Zaehle Moechten Sie eingeben?");
    }

    int[] a = new int[n];
    int j;
    for (j = 0; j < n; j++) {
     a[j] = read("Bitte geben Sie die Zahl fuer a[" + j + "] ein(ohne Wiederholung von Zahlen): ");
     for(int i=0;i<j;i++) { 
       while(a[j]==a[i]) {
        a[j] = read("Ihre Eingabe ist widerholt! Bitte geben Sie eine andere Zahl fuer a[" + j + "]: ");
        }}}
        
    System.out.print("Ihre Array ist: ");
    for (j = 0; j < n; j++) {
      System.out.print(+a[j] + " ");
       }
  
    
    //Aufgabe 1
    int sum1=0, sum2=0;
  int index=0;
  
  for(index=0; index<a.length;index++) {
    if (index%2==0) {
    sum1+= a[index];
    }else 
    sum2+= a[index];
    }
//    System.out.println(sum1+"....." +sum2);
  int diff=sum1-sum2;
   write("die differenz zwischen der Summe die Elemente an ungerade Indices mit die Elemente an geraden Indices ist: "+diff);
  
   // Aufgabe 2
   
     for(int i=0;i<a.length-1;i++) {
     int temp;
     if (a[i]>a[i+1]) {
       temp=a[i];
       a[i]=a[i+1];
       a[i+1]=temp;
     }
   }
     for(int i=0;i<a.length-2;i++) {
       int temp;
       if (a[i]>a[i+1]) {
         temp=a[i];
         a[i]=a[i+1];
         a[i+1]=temp;
       }
     }write("Das Zweitgroesste Element des Arrays ist: "+a[a.length-2]);
     
//     Aufgabe3
     if(n%2==0) {
     for(int i=0;i<a.length;i++) {
       if(i%2==0) 
       {a[i]+=a[i+1];
     }}
     }
     else {
       for(int i=0;i<a.length-1;i++) {
       if(i%2==0) 
       {a[i]+=a[i+1];
     }}}
     
     System.out.print("Ihre neues Array ist: ");
     for (j = 0; j <a.length; j++) {
       System.out.print(+a[j] + " ");
     }
     
     }
   }
  


