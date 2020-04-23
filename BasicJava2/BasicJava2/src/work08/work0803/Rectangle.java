package work08.work0803;

public class Rectangle {
	  public int width;
	  public int height;
	  public Rectangle(int width, int height) {
	      this.width = width;
	      this.height = height;
	  }
	  public Rectangle() {

	  }

	  public int getArea() {
	      return this.width * this.height;
	  }

}
