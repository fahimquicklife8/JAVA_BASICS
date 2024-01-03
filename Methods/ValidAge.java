public class ValidAge {

    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
        return age>= 3 && age <= 15;
    }

    public static void main(String[] args) {
        String name = "fahim";
        int age = 21;

        System.out.println(validate(age));
        System.out.println(validate(name));
    }
}
