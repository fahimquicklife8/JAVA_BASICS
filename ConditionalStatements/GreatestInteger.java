// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class GreatestInteger {
    public static void main(String[] args) {
        int a = 3, b = 5, c= 10;

      //this program finds the greatest of three integers and prints it's value
        if( a>b && a>c ){
            System.out.print(a);
        }
        else if ( b>c){
            System.out.print(b);
        }
        else{
            System.out.println(c);
        }

    }


}