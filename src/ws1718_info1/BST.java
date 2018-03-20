package ws1718_info1;

import java.Iterator;

public class BST {
public class TreeTerator implements java.Iterator<Integer>{
  private BST current;// Aktuelle Position des Iterators
  public TreeTerator(BST bst) {
    current=bst;
    while(current.left!=null) {
      current=current.left;
    }
  }
  public boolean hasNext() {
    return current!=null;
  }
  public Integer next() {
    if (current==null) { 
    throw new java.util.NoSuchElementException();
    }
    Integer x=current.content;
    if(current.right!=null) {
      current=current.right;// Weiter im rechten Teilbaum
      while (current.left!=null) {// Linkesten Knoten aufsuchen 
        current=current.left;
      }
        } else {// Kein rechtes Kind vorhanden
          BST whereFrom=null;
          // Gehe so lange zum Elternknoten, bis der letzte solche
          // Schritt von links aus erfolgt/ die Wurzel erreicht ist.
         while (null!= current && current.right== whereFrom) {
           whereFrom=current;
           current=current.parent;
         }  
        }
    return x;
}
  }

public TreeTerator getIterator() {
  return new TreeTerator(this);
}
//Attribute
private Integer content;// Inhalt
private BST right; // rechtes Kind
private BST left; // linkes Kind
private BST parent; // Elternknoten 
// Konstruktor
public BST(Integer content, BST left, BST right, BST parent) {
  this.content=content;
  this.left=left;
  this.right=right;
  this.parent=parent;
}
//Einfuegen einer Zahl
public void insert(Integer x)
{
  ... (Gegeben)}

}
