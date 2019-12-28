package ankita;

public class StudentLibraryDetails extends Student {
	public StudentLibraryDetails(int regno, String stdName, String group, int booksIssued) {
		super(regno, stdName, group);
		this.booksIssued=booksIssued;
	}
	protected int booksIssued;
	public void libraryDetails() {
		System.out.println(regno+" "+stdName+" "+group+" "+booksIssued);
	}
}
