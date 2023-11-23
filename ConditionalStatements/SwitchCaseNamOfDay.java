import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.*;
public class SwitchCaseNamOfDay {

    public static void main(String[] args) {
        System.out.print("Type in a number between 1 and 3: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input){
            case 1: System.out.println("One");
            break;
            case 2: System.out.print("two");
            break;
            case 3: System.out.print("Three");
            break;
            default: System.out.print("Invalid");
        }
    }


}
