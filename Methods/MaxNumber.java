public class MaxNumber {

    static int max(int ...A){
       if(A.length == 0) return Integer.MIN_VALUE;
       int m = A[0];
       for(int i = 1; i<A.length; i++){
           if(A[i-1] <A[i]){
               m = A[i];
       }

    } return m;

    }

    public static void main(String[] args) {
       System.out.print(max(new int[]{10,5,6,7,11,33}));
    }

}
