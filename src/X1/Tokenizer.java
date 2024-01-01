package X1;

import java.util.StringTokenizer;

public class Tokenizer{
	// String Tokenizer in to the java is the bulit class in to the java that helps in to the java to Breaks the Given String in to the 
	// in to the Tokens;
	// if We want to breaks A sting in to the Token on based on to the token or Some Pattern then We use the Concept of the String 
	// Tokenizer in to the java 
	public static void main(String[] args) {
		// Find the Number of the Word in to the Given String Lets See 
		
		int count = 0;
		StringTokenizer str = new StringTokenizer(" Vishal Yadav ");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			count++;
		}
		System.out.println(count);
		
	}
}