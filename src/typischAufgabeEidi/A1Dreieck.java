package typischAufgabeEidi;


public class A1Dreieck{ // P-Klasse
 private static int b;
 private static int h;
 private static char[][] matrix;
 public static void main(String[] args) {
    // A1Dreieck.init(4);
    init(4);
     print();

 }
private static void print(){
    System.out.println();
    for(int i=0;i<h;i++){
        for(int j=0;j<b;i++){
            System.out.print(matrix[i][j]);
    }System.out.println();

}}

private static void init(int h){
    this.h=h;
     this.b=4h+3;
     matrix=new char[h][b];

    for(int i=0; i<h;i++){
        for (int j=0; j<b;j++){
            if(j>=2i-1 && j<3i-1){
                matrix[i][j]="*";
                
                
            }else 
            matrix[i][j]="";

            
    }

     }
}}