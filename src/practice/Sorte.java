package practice;

 public class Sorte {
  
public static int getsorte1(int[] arr) {
    int temp;
    int i,j = 0;
    // 从小到大，从左往右， 每次内循环都能确定一个最小值
   for (i=0; i<arr.length-1; i++)
     for(j=arr.length-1;j>i;j--)
     if (arr[j]<arr[j-1]) {
       temp= arr[j];
       arr[j]=arr[j-1];
       arr[j-1]=temp;
       
     }
   return arr[j-1];   
   }
  
 
  public static int getsorte2(int[] arr) {
    int temp;
    int i,j=0;
    
   for (i=0; i<arr.length-1; i++)
     for(j=0; j<arr.length-1;j++)
     if (arr[j]>arr[j+1]) {
       temp= arr[j];
       arr[j]=arr[j+1];
       arr[j+1]=temp;
      
     }
  return arr[i];
}

  public static int getsorte3(int[] arr) {
   // 从左到右，从小到大，每次内循环都确定一个最小值，以外循环为参照。  
    int temp;
    int i,j=0;
     for (i=0; i<arr.length-1; i++)
     for(j=i+1; j<arr.length;j++)
     if (arr[i]>arr[j]) {
       temp= arr[i];
       arr[i]=arr[j]; 
       arr[j]=temp;
      }
  return arr[i];
}
 public static void main(String[] args) {
    int[] a = {2, 3 ,6, 4};
    getsorte3(a); 
   printArray(a);
   
   for (int k=0;k<a.length;k++) {
      System.out.print(a[k]+" ");
      }
   }
 

  
  

  private static void printArray(int[] a) {
    // TODO Auto-generated method stub
    
  }
  
  }

