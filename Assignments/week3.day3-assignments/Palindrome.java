package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		 String text = "Malayalam";
		 String reverseText = "";
		
		 for(int i =text.length()-1; i>=0; i-- ) {
			 reverseText= reverseText + text.charAt(i);
		 }
		 
		 if (text.equalsIgnoreCase(reverseText))
		 {
			 System.out.println("It is a palindrome");
		 }
		 else
			 System.out.println("It is not a palindrome");
	}

}
