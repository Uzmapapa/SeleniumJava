package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> array= new ArrayList<Integer>();
		List <Integer>array1= new ArrayList<Integer>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
		System.out.println(array);
		
		array1.add(1);array1.add(8);array1.add(4);array1.add(2);array1.add(11);
		System.out.println(array1);

		array.retainAll(array1);
		System.out.println( "The intersection elementsare : "+ array);
		
	}
}
	

