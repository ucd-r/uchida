package work10.work1003;

public class Rectangle extends Shape implements Spreadable {

	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	 @Override
	 public String toString() {
	     return ("Rectangle:width= " + width + "\t height=" + height);
	 }

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return (2*width + 2*height);
	}

	@Override
	public void expand(double ratio) {
		width *= ratio;
		height *= ratio;
	}

	public void spread(double ratio) {
		width *= ratio;
	}


}
