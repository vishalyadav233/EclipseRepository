package X1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
	
	public static void main(String[] args) {
		
		
		
		//Pattern p = Pattern .compile("[\\s]"); // \s  is used to find the WhiteSpace in to given Spring
		
		
		
		//Pattern p = Pattern .compile("[\\S]");
		
		//Pattern p = Pattern .compile("[\\d]"); // \d is used to find the Only Digits in to the Particular String
		//Pattern p = Pattern .compile("[\\D]"); // \ D is used to find the All the Things Except the String
		
		//Pattern p = Pattern .compile("[\\w]"); // \ this is used to fingf the Upper case lower case and the Digit Except 
		// The White Space and the Special Charachter
		
		Pattern p = Pattern .compile("[\\W]"); // USed to find the Special Charater and White Space in to the Paricular String 
		
		Matcher m = p.matcher("bnx989kdsk@*&%#!(@) msm027lds"); // \S is used to find the All the things Except the WhiteSpace
		
		while (m.find()){
			System.out.println(m.start()+"...."+m.group());
		}
	}

}
