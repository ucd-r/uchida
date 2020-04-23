package work10.work1003;

public class Trapezoid extends Shape implements Spreadable {

	double top;
	double bottom;
	double height;
	double hypotenuse;

	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
		this.hypotenuse = Math.sqrt(Math.pow(Math.abs(top - bottom), 2)+Math.pow(height, 2));
	}

	 @Override
	 public String toString() {
	     return ("Trapezoid:top=" + top + "\t bottom=" + bottom + "\t height=" + height);
	 }

	@Override
	public double getArea() {
		return (top+bottom)*height/2;
	}

	@Override
	public double getPerimeter() {
		return (top + bottom + height + hypotenuse);
	}

	@Override
	public void expand(double ratio) {
		top *= ratio;
		bottom *= ratio;
		height *= ratio;
		hypotenuse *= ratio;
	}

	public void spread(double ratio) {
		top *= ratio;
		bottom *= ratio;
	}

}