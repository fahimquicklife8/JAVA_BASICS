public class ObjectMethod {

    static void change(int A[], int index, int value){
        A[index] = value;
    }

    static void change2(int x, int value ){
        x = value;
        System.out.println(x);

    }
    public static void main(String[] args) {

       int A[] = {2,4,6,8,10};
       change(A,2,20);

       ObjectMethod mp = new ObjectMethod();
       for(int x:A)
           System.out.println(x);


       int x = 10;
       change2(x,20);
       System.out.println(x);

    }
}
