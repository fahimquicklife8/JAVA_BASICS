import java.util.*;
//find if year is leap year or not
public class LeapYear {


    public static void main(String[] args) {

        System.out.print( "Type in a year to find out if it is leap year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //Adding exception for negative and other inputs for edge cases
        try {
            if (year <= 0) {
                System.out.println("Please enter a positive year.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid positive year.");
            return;
        }

        if(year % 100 == 0){
            if (year % 400 == 0){
                System.out.print("year is leap year");
            }
            else{   System.out.print("NOT leap year");}
        } else if(year % 4 ==0){
            System.out.print("year is leap year");
        } else{
            System.out.print("NOT leap year");
        }


    }
}
