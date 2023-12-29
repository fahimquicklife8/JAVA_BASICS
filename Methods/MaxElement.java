public class MaxElement {
    int max(int[]X, int b){
        int maximum = 0;
       for(int i = 1; i<b; i++){
           if(X[i-1] <X[i]){
               maximum = X[i];
           }
       }
        return maximum;
    }

    public static void main(String[] args) {
        int A[] =  {1,2,3,4,5,6,99};
        MaxElement mAx = new MaxElement();
        System.out.print(mAx.max(A,A.length));
    }
}
