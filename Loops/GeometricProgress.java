
import java.util.*;
public class GeometricProgress {
    public static void main(String[] args) {

        System.out.println("Enter a, r, and n: ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        int r = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        if( n == 1){
            sum = a;
        }
        for(int i =1; i<n; i++){

            a = a*r ;
            sum = a;
        }

        System.out.print(sum);

    }

}
