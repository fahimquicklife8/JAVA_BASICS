import java.util.*;
public class MenuDrivenProgram {

    public static void main(String[] args) {

        System.out.print(" ADD\n SUBTRACT\n MULTIPLY\n DIVIDE\n") ;
        System.out.print(" Enter first number: ") ;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print(" Enter second number: ") ;
        int num2 = sc.nextInt();
        System.out.print(" Type in the operation: ") ;
        Scanner buzzer = new Scanner(System.in);
        String option = buzzer.nextLine().toLowerCase();

        switch(option){
            case "add": System.out.print("The sum of two numbers are: " + (num1 + num2)) ;
                 break;
            case "subtract": System.out.print("After subtracting second number from first: " + (num1 - num2)) ;
                break;
            case "multiply": System.out.print("The first number multiplied with second is: " + (num1*num2)) ;
                break;
            case "divide": System.out.print("The first number divided by second: " + (num1/num2)) ;
                break;
             default:  System.out.print("Invalid operation request") ;


        }



    }
}

