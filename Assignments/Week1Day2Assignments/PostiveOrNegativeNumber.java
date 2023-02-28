package week1.day2;

public abstract class PostiveOrNegativeNumber {

	public static void main(String[] args) {
		
		int number= 35;
		if (number<0) {
			System.out.println("the number is negative");
		}
		else if( number>0) {
			System.out.println("the number is positive");
		}
		else {
			System.out.println("the number is negither positive nor negative");
		}
	}

}
