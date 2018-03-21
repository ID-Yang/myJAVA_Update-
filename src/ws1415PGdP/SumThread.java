class SumTread extends Thread{
    int result;
    tree t;
  sumThread(Tree t){
      this.t=t;
    
  }
 public void run(){
      SumTread[]teilSumme=new SumThread[t.children.length];
      //Erstelle und starte Teil-Threads zur Berechnung der 
    //   Summe der einzelner Kindbaeume
    for (int i=0;i< teilSumme.length;i++){
        teilSumme[i]=new SumThread(t.children[i];
        teilSumme[i].start();
    }

      }
  }
} 