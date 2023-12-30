import java.util.Scanner;
public class ReverseStringExample {
    public static void main(String[] args) {
        System.out.println("Type String you wish to reverse: ");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine() ;
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);
    }

    public static String reverseString(String input) {
        // Convert the string to an array of characters
        char[] charArray = input.toCharArray();

        // Reverse the array
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Convert the reversed array back to a string
        String reversedString = new String(charArray);

        // Return the reversed string
        return reversedString;
    }
}
