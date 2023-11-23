//This program gives sum until n for given input

import java.util.*;
public class SumOfN {
    public static void main(String[] args) {
        System.out.print("Type in a number for which you wish to find the sum: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
      int sum = 0;
        for(int i = 1; i<= number; i++){
            sum  = sum + i;


        }
        System.out.println("Sum is: " + sum);
    }
}
