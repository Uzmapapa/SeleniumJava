package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		 String text = "changename";
	      char[] textArray = text.toCharArray();
	
			for(int i =0; i<textArray.length; i=i+2 ) {
		
				textArray[i] = Character.toUpperCase(textArray[i]);
			}
	
				System.out.println(textArray);

	}
}



