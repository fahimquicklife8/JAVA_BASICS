import java.util.Scanner;

public class FindDomain {
        //This program works to find domain of given website such as org, com, net
        public static void main(String[] args) {
            System.out.print("Type in a website: ");
            Scanner sc = new Scanner(System.in);
            String in = sc.nextLine().toLowerCase();

            String input = in.substring(in.lastIndexOf(".") + 1);
            //Bug fixed +1 because . is 0 then c,n or o is 0 + 1


            if (input.equals("com")) {
                System.out.println("Commercial");
            }
            else if(input.equals("org")){
                System.out.println("Organization");
            }
            else if(input.equals("net")){
                System.out.println("Network");
            }
            else {
                System.out.println("Not a website of any popular domain");
            }
        }
    }

