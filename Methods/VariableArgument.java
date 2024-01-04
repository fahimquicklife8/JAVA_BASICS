public class VariableArgument {

    static void show(int... x) {

        for (int a : x) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {


        show(new int[]{10,20,30,40});
    }
}