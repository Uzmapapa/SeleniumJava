package week1.day1;

public class Report {

	public static void main(String[] args) {
		
		Student report = new Student();
		System.out.println( "Name : " +report.name);
		System.out.println("Roll Number : " +report.rollNumber);
		System.out.println("collegeName : "+report.collegeName);
		System.out.println("markScored : "+report.markScored);
		System.out.println("percentage : "+ report.cgpa + "%");
		
	}

}
