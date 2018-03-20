package practice;

public class ListT {
 class List<T>{
  public T info;
  public List<T> next;
  public List (T x, List<T> l) {
    info=x;
    next=l;
   
  }}
public void insert(T x) {
  next=new List<T>(x,next);
  
}
public void delete() {
  if (next!=null) next=next.next;
  
}
public static void main(String[] args) {
  List<Poly>list=new List<Poly>(new Poly(),null);
  System.out.println(list.info.greet());
  
}}
