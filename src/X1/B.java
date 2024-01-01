package X1;

// \ s is used to find the WhiteSpace in to the Particular String

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	
	
	public static void main(String[] args) {
		
		
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("abABALHSO GWbsshsswls10820228@(382   @))8208*&%%$$");
		while (m.find()) {
			
			System.out.println(m.start()+"==="+m.group());
			
		}
		
	}

}
