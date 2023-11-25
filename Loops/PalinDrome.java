import java.util.*;

public class PalinDrome {
    //This program checks if input number is Palindrome
    //so if 333 is input then its Palindrome, 123 is not

    public static void main(String[] args) {
        System.out.print("type in number that you want to reverse:  ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int reverse = 0;
        int Palindrome = input;        //store initial value of input
        while(input>0){
            int r = input%10;
            reverse = reverse*10 + r;
            input = input/10;


        }
        if ( Palindrome == reverse){

            System.out.print("Number is a Palindrome");

        }
        else {
            System.out.print("Not a Palindrome");
        }



    }
}
