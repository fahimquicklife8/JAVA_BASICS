import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0,"A",1,"B", 2,"C",3,"D" ));

        hm.put(4,"E");
        hm.put(5,"F");
        hm.remove(4);

        System.out.println(hm);
    }
}
