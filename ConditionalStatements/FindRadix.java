
import java.util.*;
public class FindRadix {
    //This program works to find possible radix of given number
    public static void main(String[] args) {
        System.out.print("Type in a number: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.matches("[01]+")) {
            System.out.println("String is Binary, Radix = 2");
        }
        else if(input.matches("[0-7]+")){
            System.out.println("String is Octal, Radix = 8");
        }
        else if(input.matches("[0-9]+")){
            System.out.println("String is decimal, Radix = 10");
        }
        else if(input.matches("[0-9A-F]+")){
            System.out.println("String is Hexadecimal, Radix = 16");
        }
        else {
            System.out.println("Not a number");
        }
    }
}