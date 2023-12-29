public class GCD {

   static int greatest(int a, int b) {
        int GCD = 0;
        for (int i = 1; i < a; i++) {
          for (int j = 1; j < b; j++) {

              if (a % i == 0 && b % j == 0 && i == j) {
                  GCD = i;
              }

          }
        }

        return GCD;
    }

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        System.out.println(greatest(num1,num2));


    }
}
