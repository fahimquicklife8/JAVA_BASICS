public class RotatingArray {

    public static void main(String[] args) {

        int[] A = {5,9,6,10,12,7,3,5,4,2};
        int temp = A[0];
        //just print simple array
        for(int x:A){

            System.out.print(x + ",");
        }
        System.out.println("");

        //left rotation
        for(int i=1; i<A.length; i++){
            A[i-1] = A[i];

        }
        A[A.length-1] = temp;
        //print left rotation array
        for(int x:A){

            System.out.print(x + ",");

        }
        System.out.println("");

        int[] B = {5,9,6,10,12,7,3,5,4,2};

        int pimp = B[B.length -1];
        System.out.print(pimp + ",");
        for (int i = 0; i < B.length -1; i++) {
            B[i] = B[i + 1];
        }


       //print right rotation array
        for(int x:B){

            System.out.print(x + ",");

        }
        System.out.println("");



    }
}
