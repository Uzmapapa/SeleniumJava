package week3.day1;

public class Automation  extends MultipleLanguage implements TestTool,Language {

	public static void main(String[] args) {
		Automation proLanguage = new Automation();
		proLanguage.java();
		proLanguage.selenium();
		proLanguage.python();
		proLanguage.ruby();
		

	}

	public void java() {
		System.out.println("you are coding in java");
		
	}

	public void selenium() {
		System.out.println("you are coding in selenium");
	}

	@Override
	public void ruby() {
		System.out.println("you are coding ruby");
	}

}
