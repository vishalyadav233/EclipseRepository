package X1;

import java.util.StringTokenizer;

public class  DateAndTime{
	public static void main(String[] args) {
		
		
		int count =0;
		StringTokenizer str = new StringTokenizer ("01-01-2024" , "-");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			count++;
		}
		System.out.println("     "+count);
	}
}