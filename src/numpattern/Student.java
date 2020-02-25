package numpattern;

public class Student {

	static String CollegeName = "abc";
	int rollNo;
	String stname;

	Student(int rollNo, String stname) {
		this.rollNo = rollNo;
		this.stname = stname;
	}

	static void disp(Student s) {
		System.out.println(CollegeName);
		System.out.print(s.rollNo);
		System.out.print(s.stname);
	}

	public static void main(String[] args) {
		Student s1=new Student(100," sharan ");
		disp(s1);
		
		Student s2=new Student(200," siddaling ");
		disp(s2);
	}

}
