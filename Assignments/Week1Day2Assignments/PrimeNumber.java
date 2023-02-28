package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 13;
		boolean flag = false;
		int value;
		value = number /2;
		for (int i=2; i <= value ; i++ ) {
		
			if( number % i==0) {
			flag = true;
			break;
			}
		}
		
		if(flag == true){
			System.out.println(" it is  not Prime number");
		 }
		else {
			System.out.println(" it is Prime number");
		}
		
	}
}


