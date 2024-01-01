package X1;
// Regular Expression in to the java is the Defined As the Sequesnce of the Cjarachter Which is USed to the Defined the SearchPattern 
// if We Search Any data from the text this Regular Excprssion is Used to Explain what we Search 
// Regular Expression may be any Type may be the Single and the Complex Exprssion in the java 

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		
		
		Pattern p = Pattern .compile("[abc]");
		Matcher m = p.matcher("avbcjd02202bndkjsn023##902") ;
		
		while(m.find()){
			
			System.out.println(m.start()+"_____"+m.group());
			
		
	}
	
	
	
	}
	
	
	

}

