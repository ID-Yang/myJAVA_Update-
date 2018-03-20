package practice;

public class ListenDemo {
public Object info;
public ListenDemo next;
public ListenDemo (Object x ,ListenDemo l) {
  info=x;
  next=l;
  
}
public void insert(Object x) {
  next=new ListenDemo(x, next);
  }
public void delete() {
  if (next!=null) next=next.next;
  
}
public String toString() {
  String result="["+ info;
  for(ListenDemo t= next; t!=null; t=t.next)
    result =result+","+t.info;
  return result+"]";
  }

}
Poly x=new Poly();
ListenDemo list=new ListenDemo(x);
x=(Poly)list.info;
System.out.println(x);


