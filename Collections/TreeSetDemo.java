import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();


        t.add(990);
        t.add(10);
        t.add(20);
        t.add(20);

        t.add(30);
        t.add(10);
        t.add(550);

        System.out.println(t);

    }
}
