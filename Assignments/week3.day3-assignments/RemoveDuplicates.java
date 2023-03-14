package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
	String text ="We learn java as part of java session in java week1";
	String[] text1= text.split(" ");
	String newText= "";
	for(int i=0;i< text1.length; i++) {
		System.out.println(	text1[i]);
		for (int j = i+1; j < text1.length; j++) {
			if(text1[i].equals(text1[j])){
				text1[j]="";
			}
		}
		newText = newText  + " " + text1[i];
		newText= newText.trim();
		}
	System.out.println( "your new text is: " + newText	);
	}
}
