public class DeletingElement {

    public static void main(String[] args) {

        //Delete an element in index 1
        int[] A = new int[10];

        A[0] = 3; A[1] = 9; A[2] = 7; A[3] = 8; A[4] = 12; A[5] =6;
        int n = 6;


        for(int i = 0; i< n; i++)
            System.out.print( A[i] + ",");
            System.out.println("");


        int index = 1;

        // Shift elements to the left to delete the element at index 1
        for (int i = index; i < n ; i++) {
            A[i] = A[i + 1];
        }





            for(int i=0; i< n-1; i++)
                System.out.print( A[i] + ",");
        System.out.println("");


    }



}
