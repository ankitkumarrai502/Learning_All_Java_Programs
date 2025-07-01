package Program_003_Uppercase_and_Lowercase;

public class string_uppercase_lowercase {
    public static void main(String[] args) {
        String name = "Ankit";

        String lower = name.toLowerCase(); // Converts to: ankit
        String upper = name.toUpperCase(); // Converts to: ANKIT


        System.out.println("Original: "  +name);
        System.out.println("LowerCase: "  +lower);
        System.out.println("UpperCase: "  +upper);

    }
}
