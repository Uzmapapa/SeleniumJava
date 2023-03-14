package week3.day2.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SecondSmallestNumber {

	public static void main(String[] args) {

	List<Integer> array = new ArrayList<Integer>();
	
	array.add(3);
	array.add(2);
	array.add(11);
	array.add(4);
	array.add(6);
	array.add(7);
	System.out.println(array);
	Collections.sort(array);
	System.out.println(array);
    int size = array.size();
    System.out.println("The second largest number in the list is: " + array.get((size)-2));
    

	}

}
