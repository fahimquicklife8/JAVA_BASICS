import java.util.*;
import java.util.Map;


public class TreeMapDemo {
    public static void main(String[] args) {


        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1,"A",0,"B", 2,"C",3,"D" ));

        tm.put(4,"E");
        tm.put(5,"F");
        tm.remove(4);

        System.out.println(tm);




    }
}
