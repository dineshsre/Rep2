package dpdemo;

import java.util.StringTokenizer;

public class ReverseWordinString {

	public static void main(String[] args) {
		// Reverse Word in String
		
		String str = "New Zealand";
		String nstr ;
		StringTokenizer strToken = new StringTokenizer(str);
		while (strToken.hasMoreTokens()) {
			nstr = strToken.nextToken();
			 String build =new StringBuilder(nstr).reverse().toString();
			 System.out.print(build + " ");
		}

	}

}
