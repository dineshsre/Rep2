package dpdemo;

public class RemoveSpecialCharacterExample {

	public static void main(String[] args) {
String str1 = "TEST";
String str2 = "TEST";

String str3 = new String("TEST"); 

System.out.println(str1.equals(str2));
System.out.println(str2.equals(str3));

System.out.println(str1 == str2);
System.out.println(str3 == str1);



String str= "This#string%contains^special*characters&.";   
str = str.replaceAll("[^a-zA-Z0-9]", " ");  

System.out.println(str);  

	}

}
