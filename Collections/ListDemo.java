// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class ListDemo{
    public static void main(String[] args) {

        ArrayList <Integer> al1 = new ArrayList<>(20);
        ArrayList <Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

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
