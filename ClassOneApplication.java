package ankita;

public class ClassOneApplication extends ClassOne {

	public ClassOneApplication(int x, int y) {
		super(x, y);
	}
	@Override
	void output() {
		System.out.println("overridden method");
	}
	public static void main(String[] args) {
		ClassOne one = new ClassOneApplication(3,6);
		one.display();
		one.output();
	}
}
