package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
	 int[] array = {23,45,67,32,89,22};
	 Arrays.sort(array);
	// System.out.println(array[1]);
	for (int i = 0; i < array.length; i++) {	 
		
		System.out.print(array[i] + " ");
	}
		System.out.println();
		System.out.println("The second smallest number in array is : "+ array[1]);

	}

}
