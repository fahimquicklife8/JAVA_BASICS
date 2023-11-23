import java.util.*;

public class NameOfDay {
//program finds name of the day based on its number
    public static void main(String[] args) {


        System.out.print("Type in a number between 1 and 7 to find day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        try {
            if (day < 1 || day > 7) {

                System.out.println("Please enter a day between 1 and 7: ");

            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter day between 1 and 7");
        }


        if (day == 1) {
            System.out.print("Sunday");
        } else if (day == 2) {
            System.out.print("Monday");
        } else if (day == 3) {
            System.out.print("Tuesday");
        } else if (day == 4) {
            System.out.print("Wednesday");
        } else if (day == 5) {
            System.out.print("Thursday");
        } else if (day == 6) {
            System.out.print("Friday");
        } else if (day == 7) {
            System.out.print("Saturday");
        }


    }}




