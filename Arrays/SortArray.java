public class SortArray {
    public static void main(String[] args) {
        String[] Arr = {"java", "ada", "python", "C++", "SQL", "Rust"};



        java.util.Arrays.sort(Arr,String.CASE_INSENSITIVE_ORDER);

        for (String x : Arr) {
            System.out.println(x);

        }
    }
}
