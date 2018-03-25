package ws1516PGdP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//b) a ist die gesamt Anzahl der ganzen Zahlen ohne widerholung.
// / Duplikate werden entfernt, da Menge(HashSet)jedes Element nur Einmal enthalten.

public class Collections{
public static Map< Integer, Integer> select(Map<Integer,Integer> A){
    Map<Integer, Integer> result = new HashMap<Integer,Integer>();
    result.putAll(A);
    Set<Integer> allKey =result.keySet();
    for(Integer key:allKey){
        Integer value=result.get(key);
        if(key>=value){
            result.remove(key);
        }
    }
    return result;
}
}


