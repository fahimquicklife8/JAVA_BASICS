public class ArgumentString {

    static void show(int Start, String ...S){

        for(int i =0; i<S.length; i++){
            System.out.println(Start +". " + S[i]);
            Start++;
        }

    }

    public static void main(String... args) {
        show(5, "John", "Mark", "Travis", "Carl", "Ryan", "Jacob");
    }
}
