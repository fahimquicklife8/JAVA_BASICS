import java.util.Arrays;

public class ComparatorDemo {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,1,3,5,7};
        int[] b = {2,4,6,8,1,3,5,7};

 int c[] = Arrays.copyOf(a,8);

 Arrays.sort(c);
 for(int x:c)
     System.out.println(x);


     //prints index of key in binary search
     System.out.println(Arrays.binarySearch(c,8));



    }
}
