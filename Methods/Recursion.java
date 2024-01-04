public class Recursion {
    //Recursion is when method calls itself
    void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
    public static void main(String[] args) {
        Recursion fun = new Recursion();
        int number = 10;
        fun.fun(number);
    }
}


