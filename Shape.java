package ankita;

public abstract class Shape {
	protected double length;
	protected double breadth;
	protected double radius;
	abstract void area();
	public Shape(double length, double breadth) { //parameterized constructor for Rectangle class
		this.length = length;
		this.breadth = breadth;
	}
	public Shape(double radius) { //parameterized constructor for Circle class
		this.radius = radius;
	}
}
