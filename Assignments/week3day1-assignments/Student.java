package week3.day1;

public class Student {
public void getStudentInfo(int id)
{
	System.out.println("student id is :" + id);
}
public void getStudentInfo(int id , String name)
{
	System.out.println("student id is :" + id);
	System.out.println("student name is :" + name);
}
public void getStudentInfo ( String email, int phoneNo)
{
	System.out.println("student phone number is :" + phoneNo);
	System.out.println("student email is :" + email);
}
	public static void main(String[] args) {
		Student s1 =new Student();
		s1.getStudentInfo(786, "Uzma");
		s1.getStudentInfo("uzma@testleaf.com", 78956432);

	}

}
