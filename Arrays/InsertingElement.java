public class InsertingElement {
    public static void main(String[] args) {
        int[] A = new int[10];

        A[0] = 3; A[1] = 9; A[2] = 7; A[3] = 8; A[4] = 12; A[5] =6;
        int n = 6;

        for (int x:A)

            System.out.print(x +",");



        System.out.println("");


         //decrementing from last element as long as index is greater than 2 and then inserting an element in between
        int x =20;
        int index = 2;

        for(int i = n; i>index; i--)
            A[i] = A[i-1];

            A[index] = x;




        for (int y:A)

            System.out.print(y +",");


    }

}
