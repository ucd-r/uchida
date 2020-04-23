package work10.work1002;

public class ShapeTest {
	 static final int RATIO = 2;
	  
	  public static void main(String[] args) {
		    testShape(new Rectangle(3,4));		// 長方形
		    testShape(new Circle(16));		// 円
		    testShape(new Trapezoid(7 , 8, 9));	// 台形
		    testShape(new Square(10));		// 正方形
	}

	  private static void testShape(Shape shape) {
		  System.out.println(shape.getClass());
		  System.out.printf("【expand(%d倍)】\n",RATIO);
		  System.out.printf("面積:%.2f\n周囲長さ:%.2f\\n", shape.getArea(), shape.getPerimeter());
		  shape.expand(RATIO);
		  System.out.println("拡張後面積:" + shape.getArea());

		  if(shape instanceof Spreadable) {
			  System.out.printf("【spread(%d倍)】\n",RATIO);
			  shape.spread(RATIO);
			  System.out.println("拡張後面積:" + shape.getArea());
		  }
		  System.out.println();
	 }

}