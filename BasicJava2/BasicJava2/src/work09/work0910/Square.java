package work09.work0910;

public class Square extends Shape{

	double sides;

	public Square(double sides) {
		this.sides = sides;
	}

	@Override
	public double getArea() {
		return sides*sides;
	}

	@Override
	public double getPerimeter() {
		return (4*sides);
	}

	@Override
	public void expand(double ratio) {
		sides *= ratio;
	}
	
}
