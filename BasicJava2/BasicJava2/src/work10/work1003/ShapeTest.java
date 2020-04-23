package work10.work1003;

public class ShapeTest {

	  private static final int RATIO = 2;

	  public static void main(String[] args) {

		    testShape(new Rectangle(3,4));		// 長方形
		    testShape(new Circle(16));		// 円
		    testShape(new Trapezoid(7 , 8, 9));	// 台形
		    testShape(new Square(10));		// 正方形


			  Rectangle rect = new Rectangle(3,4);
			  testSpreadable(rect);//A
			  Shape shapeRect = new Rectangle(3,4);
			  //testSpreadable(shapeRect);//C

			  Circle circle = new Circle(16);
			  //testSpreadable(circle);//B
			  Shape shapeCircle = new Circle(16);
			  //testSpreadable(shapeCircle);//C

			  Trapezoid trape = new Trapezoid(7 , 8, 9);
			  testSpreadable(trape);//A
			  Shape shapeTrape = new Trapezoid(7 , 8, 9);
			  //testSpreadable(shapeTrape);//C

			  Square square = new Square(10);
			  //testSpreadable(trape);//B
			  Square shapeSquare = new Square(10);
			  //testSpreadable(shapeTrape);//C

			  /* Aが実引数として設定できる理由：
			   * Spreadableインタフェースを実装しているクラスのインスタンスは，自動的にSpreadable型に変換され，
			   * testSpreadableメソッドの引数に渡るため．
			   *
			   * Bが実引数として設定できない理由：
			   * Spreadableインタフェースを実装していないクラスのインスタンスのため．
			   * 明示的にキャストしても，インタフェースを実装していないため引数として渡すことができない．
			   *
			   * Cが実引数として設定できない理由：
			   * Spreadableインタフェースを実装していない親クラスの型のインスタンスなので，自動的にSpreadable型に変換されないため．
			   * testSpreadable((Spreadable)shapeRect);
			   * とキャストすると引数として渡すことができる．
			   *
			   */
	}

	  //work10-2
	  private static void testShape(Shape shape) {
		  System.out.printf("work10-2\n【%s】\n", shape.toString());
		  System.out.printf("Area:%.2f \t Perimeter:%.2f\n", shape.getArea(), shape.getPerimeter());
		  System.out.printf("↓↓expand(%d倍)↓↓\n",RATIO);
		  shape.expand(RATIO);
		  System.out.printf("Area:%.2f \t Perimeter:%.2f\n", shape.getArea(), shape.getPerimeter());

		  if(shape instanceof Spreadable) {
			  System.out.printf("↓↓spread(%d倍)↓↓\n",RATIO);
			  ((Spreadable)shape).spread(RATIO);
			  System.out.printf("Area:%.2f \t Perimeter:%.2f\n", shape.getArea(), shape.getPerimeter());
		  }
		  System.out.println();
	 }

	  //work10-3
	  private static void testSpreadable(Spreadable spreadable) {
		  System.out.printf("work10-3\n%s\n",spreadable.toString());
		  System.out.printf("↓↓spread(%d倍)↓↓\n",RATIO);
		  spreadable.spread(RATIO);
		  System.out.printf("%s\n\n", spreadable.toString());
		  }
}