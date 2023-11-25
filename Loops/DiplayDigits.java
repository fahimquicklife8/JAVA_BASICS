import java.util.*;
public class DiplayDigits {

    public static void main(String[] args) {
        // Type in a digit and then you can display the digits
        System.out.print("Type in a number for which you wish to find the digits: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int integer = 0;
        while(number > 0){

          int r = number%10;
          number = number/10;
          System.out.println(r);

        }

    }
    }
