
/*
**Author: Fahim Imtiaz
**This program converts grades to letter
 */

import java.util.*;

public class GradesToLetter {
    public static void main(String[] args) {
        System.out.print("Type in your grade to get Letter: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade < 70) {
            System.out.println("F");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}