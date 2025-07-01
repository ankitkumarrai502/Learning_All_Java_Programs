package Program_003_Uppercase_and_Lowercase;

public class character_case_check {
    public static void main(String[] args) {
        char ch = 'b';

        if (Character.isUpperCase(ch)) {
            System.out.println("Character is in Uppercase: " + ch);
        }
            else if(Character.isLowerCase(ch)) {
                System.out.println("Character is in Lowercase: " + ch);
            }

    }
}
