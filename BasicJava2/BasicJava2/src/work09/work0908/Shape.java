package work09.work0908;

public abstract class Shape {

	public abstract double getArea();
	
	public abstract  double getPerimeter();
	
	public boolean isLargerThan(Shape another) {
		if(this.getArea() > another.getArea()) return true;
		else return false;
	}
	
	public abstract void expand(double ratio);

	
}
