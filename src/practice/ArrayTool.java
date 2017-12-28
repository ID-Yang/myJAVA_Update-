package practice;
/**
 * 建立一个用于操作数组的工具类，其中包含着常见的对数组操作的函数如：最值，排序等。
 * @author
 * @version v1.0
 * @r
 * eturn 该数组中最大的元素值
 */
public class ArrayTool {
  private ArrayTool() {} //该类中的方法都是静态的，所以该类是不需要构建对象的，为了保证不让其他程序创建该类对象，可以将该类的构造函数私有化。
  public static int getMax(int[] arr) {
    int maxIndex = 0;
    for (int x = 1; x < arr.length; x++) {
      if (arr[x] > arr[maxIndex])
        maxIndex = x;
    }
    return arr[maxIndex];
  }
/**
 * @param arr
 * */
  public void selectSort(int[] arr) {
    for (int x = 0; x < arr.length - 1; x++) {
      for (int y = x + 1; y < arr.length; y++) {
        if (arr[x] > arr[y])
          swap(arr, x, y);
      }
    }
  }
  /**
   * @param arr
   * @param a
   * @param b
   * */
private void swap(int[]arr,int a,int b)
{
  int temp= arr[a];
  arr[a]=arr[b];
  arr[b]=temp;
}
/**
 * @param arr
 * @param key
 * @return 
 * */

public static int getIndex(int[] arr,int key) {
  for(int x=0;x<arr.length;x++)
  {
    if(arr[x]==key)
      return x;
   
  }return -1;
}

/**
 * @param arr
 * @return 
 * */
public String arrayToString(int[] arr) {
  String str ="[";
  for(int x=0; x<arr.length; x++)
  {
    if(x!=arr.length-1)
      str=str+arr[x]+",";
    else
      str=str+arr[x]+"]";
    
  }
  return str;
  
}}