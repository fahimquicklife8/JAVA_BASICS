//This program gives multiplication table of upto 20 for any number

import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
      System.out.print("Type in a number for which you wish to find the table: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1; i<= 20; i++){

            System.out.println(number + "x" + i + "=" + (number*i));

        }

        }
    }
