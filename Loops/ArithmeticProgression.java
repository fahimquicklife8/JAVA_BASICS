
import java.util.*;
public class ArithmeticProgression {
    public static void main(String[] args) {

        System.out.println("Find Arithmetic progress. Enter a,r and d: ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        if( n == 1){

            sum = a;
        }

        for (int i = 0; i < n; i++) {

            a = a + d;
            sum = a;

        }


        System.out.print(sum);
    }
}
