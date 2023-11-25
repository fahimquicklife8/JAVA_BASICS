import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.print("Type in a number for which you wish to count the digits: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0 ;
        while(number > 0){

            number = number/10;
           count++;

        }
        System.out.print("The number of digits are: " + count);
}}