package dpdemo;

public class CapitalizefirstletterString {
	public static void main(String[] args) {
	      String myinput = "simply easy learning tutorialspoint";
	      // store each character to a char array
	      char[] charAray = myinput.toCharArray();
	      System.out.println("Before capitalizing: " + myinput);
	      // for loop to capitalize first letter 
	      for(int i = 0; i < charAray.length; i++) {
	         // capitalizing first letter of first word
	         charAray[0] = Character.toUpperCase(charAray[0]);
	         // loop to check if there is space between two letters
	         if(charAray[i] == ' ') {
	            // capitalizing first letter of rest of the word
	            charAray[i+1] = Character.toUpperCase(charAray[i+1]);
	         }
	      }
	      // converting the character array to the string
	      myinput = String.valueOf(charAray);
	      // to print the final result
	      System.out.println("After capitalizing the first letter: " + myinput);
	   }

}
