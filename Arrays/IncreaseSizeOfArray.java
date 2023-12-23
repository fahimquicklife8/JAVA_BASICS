public class IncreaseSizeOfArray {

    public static void main(String[] args) {
        int[] A  = {8,6,10,9,2};

        int[] B = new int[2*A.length];

        for(int i =0; i< A.length; i++){

            A[i] =  B[i];
        }
        A = B;

        System.out.print(A.length);


        }
    }

