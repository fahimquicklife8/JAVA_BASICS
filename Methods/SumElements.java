public class SumElements {
        static int sum(int ...A){
            if(A.length == 0) return Integer.MIN_VALUE;
            int m = 0;
            for(int i = 0; i<A.length; i++){
                m = m + A[i];
                }
            return m;
            }


        public static void main(String[] args) {
            System.out.print(sum(new int[]{10,5,6,7,11,33}));
        }

    }


