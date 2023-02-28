package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int number =34343;
		int tempNumber;
		int sum=0;
		int remiander;
		tempNumber = number;
		while (number>0) {
			remiander=number%10;
			sum= sum*10 +remiander;
			number=number/10;
		}
		if (sum==tempNumber) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		
	}

}
