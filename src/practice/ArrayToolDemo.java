package practice;
class ArrayToolDemo {
 public static void main(String[] args) { 
int[] arr = {4,8,2,3,1,6};
//ArrayTool tool =new ArrayTool();
int max= ArrayTool.getMax(arr);
int index= ArrayTool.getIndex(arr, 8);

int max1=getMax(arr);
System.out.println("max1="+getMax(arr));
System.out.println("max="+max);
System.out.println("index="+index);
}
 
public static int getMax(int[] arr)
 {
   int maxIndex =0;
   for(int x=1; x<arr.length;x++) {
     if (arr[x]> arr[maxIndex])
    maxIndex =x;
     }
 return arr[maxIndex];
 }
}

