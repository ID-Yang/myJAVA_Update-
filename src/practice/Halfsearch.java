package practice;
import java.util.*;

public class Halfsearch {
  public static int halfSearch(int[] arr, int key) {

    int max, min, mid;
    max = arr.length - 1;
    min = 0;
     while (min <= max) {
       mid = (max + min) / 2; //注意：mid值的定义要放在循环体之中。
      if (key < arr[mid]) {
        max = mid - 1;
      } else if (key > arr[mid]) {
        min = mid + 1;
      } else
        return mid;
    }
     
    return min;
  }

  public static void main(String[] args) {
    int[] arr = {3, 4, 6, 7, 13, 19};
    int key = 3;
    int index = halfSearch(arr, key);
    int index1= Arrays.binarySearch(arr, key);//如果元素不存在，返回的就是元素的插入点。    int index1= Arrays.binarySearch(arr, key);//如果元素不存在，返回的就是元素的插入点。
    System.out.println("the index of the key is:" + index);
    System.out.print("the index of the key is:" + index1);
  }
}
