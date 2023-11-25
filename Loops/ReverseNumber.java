import java.util.*;

public class ReverseNumber {
    //This program reverses input number and prints it
   //so if input is 356 output is 653

    public static void main(String[] args) {
        System.out.print("type in number that you want to reverse:  ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int reverse = 0;

        while(input>0){
        int r = input%10;
        reverse = reverse*10 + r;
        input = input/10;


        }

        System.out.print("Reverse of number is: " + reverse);



    }
}
