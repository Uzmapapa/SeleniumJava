package week3.day2.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int number=1;
		List<Integer> array= new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(7);
		array.add(6);
		array.add(8);
	    Collections.sort(array);
	    System.out.println(array);
	    
	    for (int i = 0; i < array.size(); i++) {
			 	 if(array.get(i) !=i+1) {
			 	 System.out.println();
			 	 System.out.print ("The missing number in the array is :" + (i + 1));
			 	  number++;
				break;
			 	 }
	    }

	}

}
