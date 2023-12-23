public class CopyArray {
    public static void main(String[] args) {
    //copy elements of Array A into B
    int[] A = {8,6,10,9,2,15,7,13,14,11};

    int[] B = new int[10];

    for(int i = 0; i< A.length; i++){

        B[i] = A[i];
        System.out.println(B[i]);

    }


    }
}
