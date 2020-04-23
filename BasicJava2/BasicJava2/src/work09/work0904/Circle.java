package work09.work0904;

public class Circle extends Shape {
	double radius;
	private double PI = 3.14; 
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius*radius*PI;
	}

	public double getPerimeter() {
		return 2*radius*PI;
	}
}