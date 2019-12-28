package ankita;

public class Circle extends Shape{

	public Circle(double radius) {
		super(radius);
	}

	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		Circle circle = new Circle(radius);
		circle.area();
	}

	@Override
	void area() {
		final double pi=3.14;
		double area = pi*radius*radius;
		System.out.println("The area of the Circle is "+area);
	}

}
