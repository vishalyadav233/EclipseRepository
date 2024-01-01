package X1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {
	
	
	private static boolean isValidPhoneNumber(String phoneNumber) {
		 
        String regex = "^[0-9]{10}$";

      
        Pattern pattern = Pattern.compile(regex);


        Matcher matcher = pattern.matcher(phoneNumber);

   
        return matcher.matches();
	}

    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	System.out.println(" enter the Mobile Number");
    	String phoneNumber = s.next();
    	

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }
    }

	
}
    