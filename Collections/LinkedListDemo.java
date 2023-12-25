import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList <Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90));

        al1.add(19);
        al2.add(10);
        al2.add(0,5);
        al1.set(0,36);
        al1.addAll(0,al2);

        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al2.contains(90));


        for(Integer x:al1)
            System.out.println(x);


        Iterator<Integer> it = al1.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}
