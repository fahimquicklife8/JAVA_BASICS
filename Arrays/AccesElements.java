
public class AccesElements {
    public static void main(String[] args) {

 int A[] = {1,2,3,5,7,8,9,10};


        //Access elements from first to last
        //we keep incrementing from first to last until we have reached the end of array
        for (int i = 0; i < A.length ; i++) {
        System.out.println("Array in straight " + A[i] + ",");
        }
        //We subtract one from final size so that we don't get Array out of Bound Exception and then as long as j>=0 we decrement from last to first
        for(int j = A.length -1; j>=0;j--){

            System.out.println("Array in reverse " + A[j] + ",");
        }

    }
}