import java.util.*;
public class TypeOfWebsite {
    public static void main(String[] args) {
        //Program works to find out type of website using switch case
        System.out.println("Enter website to find its type: ");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine().toLowerCase();
        String input = website.substring(website.lastIndexOf(".")+1);

        switch(input){
            case "com": System.out.println("commercial");
            break;
            case "net": System.out.println("Network");
            case "org": System.out.println("Organization");
            default: System.out.println("Invalid website");

        }

    }
}
