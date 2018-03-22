package ws1516PGdP;

/* A4 
a) Wir müssen für jeden knoten speichern, 
ob wir diesen schon geshen haben, um Kreise bei der  
Suche auszuschliessen. Zur Speicherung der bekannten, 
aber noch nicht bearbeiteten Knoten nutzen wir eine 
Warteschlange, da auf diese Weise sichergestellt ist,  
dass zuerst entdeckte Knoten auch zuerst besucht werden.
Am Anfang enthält die Warteschlange nur unseren 
Startknoten.Wir nehmen dann sukzessive
knoten aus der schlange und durchlaufen ihre Nachfolger.
Finden wir dabei einen unbekannten Nachfolger, so geben 
wir ihn aus und fügen ihn wiederum in die schlange ein.

bfs algorithmus


*/
import java.util.LinkedList;
import java.util.Queue;

class Graph{
    private GraphNode[] nodes;
    
    public class GraphNode{
        private int[] nachbarIndex;// index der NachbarNote
        public int[] getNachbarIndex(){
            return nachbarIndex;
        }
        public GraphNode(int[] nachbarIndex){
            this.nachbarIndex=nachbarIndex;
        }

    }// Ende der klasse GraphNode
    
    void bfs(int fromNodeIndex){
        Queue<Integer> bfsQueue=new LinkedList<>();
        boolean[] visited=new boolean[nodes.length];
        bfsQueue.add(fromNodeIndex);
        visited[fromNodeIndex]=true;
        
        while(!bfsQueue.isEmpty()){
            int nextNode=bfsQueue.remove();
            System.out.println("Discovering node"+ nextNode+".");
            for(int node:nodes[nextNode].getNachbarIndex())
            if(!visited[node]){
                 bfsQueue.add(node);
                 visited[node]=true;// bfs 函数我写的和标准答案不一样，我觉得我写的对。
             }   
            
        }
        
    }
    
    
    public static void main(String[] args) {
       int[] nachbarIndex={2,4,5};
        GraphNode a=new GraphNode(nachbarIndex) {
       Graph().GraphNode[0]=a;
       }
    }
}//Ende der Klasse Graph
    



