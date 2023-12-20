public class PracticeArray {

    public static void main(String[] args) {
        int[] A = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        //Find sum of Array
        int sum = 0;
        for (int i : A) {
            sum = sum + i;
        }
        System.out.println(sum);

        //Find Specific key in Array
        int key = 6;
        for (int i : A) {
            if (i == 6) {
                System.out.println(i);
                //   System.exit(0);
            }
        }
        // System.out.print("not found");

        //find maximum element
        int num = A[0];
        for (int i = 0; i < A.length; i++) {
            if (num < A[i]) {
                num = A[i];
            }
        }
        System.out.println(num);


        //Print second largest element

        int secondMax = A[0];
        for(int i = 0; i < A.length; i++) {
            if(secondMax < A[i] && A[i] < num) {
                secondMax = A[i];
            }

        }

        System.out.println(secondMax);

    }

}
