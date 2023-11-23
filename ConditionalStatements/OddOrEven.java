import java.util.*;
public class OddOrEven {
//find if number is odd or even
    public static void main(String[] args) {

        System.out.print("Type in a number: ");
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        if ( number % 2  == 0 ){
            System.out.print("number is Even");
        }
        else{

            System.out.print(" number is Odd");
        }
    }
}
