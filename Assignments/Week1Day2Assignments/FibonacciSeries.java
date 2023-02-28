package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	int range=8;
	int firstNumber=0;
	int secondNumber=1;
	int sum;
	System.out.print( firstNumber + " ");
	System.out.print( secondNumber+ " ");
	
	for(int i=2; i<range; i++) {
		sum = firstNumber + secondNumber;
		firstNumber = secondNumber ;
		secondNumber= sum;
		System.out.print( sum + " ");
		

	}
	 
	


	}
	}


