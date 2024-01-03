public class ReverseInt {
    static int reverse(int n){
        int reverse = 0;
        while(n>0){
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int back = 789;
       System.out.println(reverse(back));
    }

}
