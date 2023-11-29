import java.util.Scanner;

public class DisplayNumInWords {
    public static void main(String[] args) {
        System.out.print("Type in the number that you want in words:  ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close(); // Close the scanner right after use

        if (input == 0) {
            System.out.print("Zero ");
            return;
        }

        // Handle negative numbers
        if (input < 0) {
            System.out.print("Negative ");
            input = -input; // Convert negative number to positive for processing
        }

        int reverse = 0;
        int count = 0; // Counter for trailing zeros

        // Find the reverse of the number and count the trailing zeros
        while(input > 0) {
            int r = input % 10;
            if (r == 0 && reverse == 0) { // Check if there are trailing zeros
                count++;
            } else {
                reverse = reverse * 10 + r;
            }
            input = input / 10;
        }

        // Convert the reversed number to words
        while(reverse > 0) {
            int r = reverse % 10;
            reverse = reverse / 10;
            switch (r) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }

        // Handle the trailing zeros
        for (int i = 0; i < count; i++) {
            System.out.print("Zero ");
        }
    }
}
