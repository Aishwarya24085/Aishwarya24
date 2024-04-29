import java.util.HashMap;
import java.util.Map;
public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("Apple", 1);
        obj.put("Mango", 2);
        obj.put("Grapes", 3);
        obj.put("Guva", 4);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
        System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
