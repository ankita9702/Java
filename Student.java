package ankita;

public class Student {
	protected int regno;
	protected String stdName;
	protected String group;
	
	public void display(){
		System.out.println("from super class");
		System.out.println(regno+" "+stdName+" "+group);
	}
	public Student() {
	
	}
	public Student(int regno, String stdName, String group) {
		super();
		this.regno = regno;
		this.stdName = stdName;
		this.group = group;
	}
}
