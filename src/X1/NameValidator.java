package X1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println(" Enter the name To which You Want to validate");
     String name = s.next();
     
        
        
        if (isValidName(name)) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }
    }

    public static boolean isValidName(String name) {
        // Define a regular expression for a name (assuming a simple format with letters and spaces)
        String regex = "^[a-zA-Z]+(\\s[a-zA-Z]+)?$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher object
        Matcher matcher = pattern.matcher(name);

        // Return true if the name matches the pattern, false otherwise
        return matcher.matches();
    }
}
