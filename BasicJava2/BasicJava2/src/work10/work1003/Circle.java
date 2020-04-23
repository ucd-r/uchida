package work10.work1003;

public class Circle extends Shape {
	double radius;
	private double PI = 3.14; 
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	 @Override
	 public String toString() {
	     return ("Circle:radius= " + radius);
	 }
	
	@Override
	public double getArea() {
		return radius*radius*PI;
	}
	
	@Override
	public double getPerimeter() {
		return 2*radius*PI;
	}
	
	@Override
	public void expand(double ratio) {
		radius *= ratio;				
	}
}
