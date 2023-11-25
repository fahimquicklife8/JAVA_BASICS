import java.util.Scanner;
public class ArmstrongNumber {

    //This program find out if number is Armstrong or not
    //Armstrong number means that 153 = 1^3 + 5^3 + 3^3 = 153 means sum of cubes of
    // digits of numbers must equal to the itself
    public static void main(String[] args) {
        System.out.print("Type in a number to find out if ArmStrong or not: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int value = number;
        int integer = 0;

        while(number > 0) {
            int r = number % 10;
            number = number / 10;
            integer += r * r * r;

        }

        if(value == integer){
            System.out.print( value + " is an Armstrong number");

        }
        else{
            System.out.print( value + " is not an Armstrong number");
        }


    }
}