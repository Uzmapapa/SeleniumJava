package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateArray {

	public static void main(String[] args) {
	List<Integer> array= new ArrayList<Integer>();
	array.add(14);
	array.add(12);
	array.add(13);
	array.add(11);
	array.add(15);
	array.add(14);
	array.add(18);
	array.add(16);
	array.add(19);
	array.add(18);
	array.add(17);
		System.out.println(array);
		for (int i = 0; i < array.size(); i++) {
			for (int j = i+1; j < array.size(); j++) {
				if (array.get(i)==array.get(j)) {
				System.out.println(array.get(j));
			}
		}		
	}

	}
}
