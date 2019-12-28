package ankita;

public class StudentExam extends StudentLibraryDetails{

	public StudentExam(int regno, String stdName, String group, int booksIssued, int sub1, int sub2 ) {
		super(regno, stdName, group, booksIssued);
		this.sub1=sub1;
		this.sub2=sub2;
	}
	private int sub1;
	private int sub2;
	public void studentDetails() {
		int total=sub1+sub2;
		System.out.println(regno+" "+stdName+" "+group+" "+booksIssued+" "+total);
	}
	public void display(){
		System.out.println("from sub class");
		System.out.println(regno+" "+stdName+" "+group);
	}
	public static void main(String[] args) {
		StudentExam exam = new StudentExam (117, "Ankita", "EE", 4, 80, 90);
		//exam.display();
		//exam.libraryDetails();
		//exam.studentDetails();
		Student student = new Student();
		student.display();
		student = exam;
		student.display();
	}
}
