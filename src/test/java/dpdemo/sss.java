package dpdemo;
import java.util.Arrays;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class sss {
	
	
	public static String solution(String T) {
        // write your code in Java SE 8

        char tempArray[] = T.toCharArray();
        // Sorting temp array
        Arrays.sort(tempArray);
        // Returning new sorted string
        return new String(tempArray);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File myObj = new File("C:\\Users\\Canada\\eclipse-workspace\\NewMavenWork\\src\\test\\java\\dpdemo\\test.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        String outputString = solution(data);
	        System.out.println("Output String : "+ outputString);
	      }
        

	}

}
