package week3.day2.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text ="We learn java as part of java session in java week1";
		String[] text1= text.split(" ");
		String newText= "";
		Set<String> sText = new LinkedHashSet <String>(Arrays.asList(text1));
		System.out.println(sText);
		//for(String string : sText ) {
		for (Iterator<String> iterator = sText.iterator(); iterator.hasNext();) {	
			String string = (String) iterator.next();
			newText =newText+ " " + string;
		}
		
		System.out.println( "your new text is: " + newText	);
		}

	}


