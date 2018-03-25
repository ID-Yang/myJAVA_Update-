import java.util.*;
public class Parallel implements Runnable{
    private int[] arr;
    public Parallel(int a)
    this.arr=a;

    void perm(int from){
        if(from==arr.length-1){
            System.out.println(Arrays.toString(arr));

        }
else {perm(from+1);
    for (int i=from+1;i<arr.length;i++){
        int t=arr[from];
        arr[from]=arr[i];
        arr[i]=t;
        perm(from+1);
        arr[from]=arr[i];
        arr[i]=t;

    }
    

}}