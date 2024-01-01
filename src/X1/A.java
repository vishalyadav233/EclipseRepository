package X1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		
		
		
		
		Pattern p = Pattern.compile("[\\s]");
		Matcher m = p.matcher("abhdgf2918272bsksmhi");
		
		while ( m.find()) {
			System.out.println(m.start()+"="+m.group());
		}
		
	}

}
