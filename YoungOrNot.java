import java.util.*;

public class YoungOrNot {
    //Find if a person is young or not
    public static void main(String[] args) {

        System.out.print("Type in your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if ( age > 14 && age < 59 ){

            System.out.println("Person is Young");
        }
        else if ( age> 59){

            System.out.println("Person is old");
        }
        else{
            System.out.print("person is boy");
        }
    }

}
