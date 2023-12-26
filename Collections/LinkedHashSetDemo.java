import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        //Linked HashSet below shows that it prints everything in the same order its inserted
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("K");
        lhs.add("G");
        lhs.add("F");
        lhs.add("2");

        Iterator<String> itr = lhs.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }
           //vs below is a demonstration of hashset that sorts everything while it prints but LinkedHashset keeps the same order

        HashSet<String> hs = new HashSet<>();

        hs.add("G");
        hs.add("E");
        hs.add("H");
        hs.add("C");
        hs.add("A");
        hs.add("B");
        hs.add("F");
        hs.add("D");

    hs.forEach(x->System.out.print(x+" "));


    }
}
