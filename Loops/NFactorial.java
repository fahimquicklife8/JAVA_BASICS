import java.util.Scanner;

public class NFactorial {
    //This program gives n factorial for given input
        public static void main(String[] args) {
            System.out.print("Type in a number for which you wish to find the factorial: ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int sum = 1;
            for(int i = 1; i<= number; i++){
                sum  = sum * i;

            }
            System.out.println("Factorial is: " + sum);
        }
    }


