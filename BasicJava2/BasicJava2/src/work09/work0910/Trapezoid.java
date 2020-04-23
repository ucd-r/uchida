package work09.work0910;

public class Trapezoid extends Shape{

	double top;
	double bottom;
	double heught;
	double hypotenuse;

	public Trapezoid(double top, double bottom, double heught) {
		this.top = top;
		this.bottom = bottom;
		this.heught = heught;
		this.hypotenuse = Math.sqrt(Math.pow(Math.abs(top - bottom), 2)+Math.pow(heught, 2));
	}

	@Override
	public double getArea() {
		return (top+bottom)*heught/2;
	}

	@Override
	public double getPerimeter() {
		return (top + bottom + heught + hypotenuse);
	}

	@Override
	public void expand(double ratio) {
		top *= ratio;
		bottom *= ratio;
		heught *= ratio;
		hypotenuse *= ratio;
	}
	@Override
	public void spread(double ratio) {
		top *= ratio;
		bottom *= ratio;
	}

}