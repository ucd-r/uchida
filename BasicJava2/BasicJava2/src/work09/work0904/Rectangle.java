package work09.work0904;

public class Rectangle extends Shape{

	int width;
	int heught;
	
	public Rectangle(int width, int heught) {
		this.width = width;
		this.heught = heught;
	}

	@Override
	public double getArea() {
		return width*heught;
	}
	
	
}
