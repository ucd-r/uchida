package work09.work0907;

public class ShapeTest {

	public static void main(String[] args) {
		//1)インスタンス格納可能
		Shape rect1 =  new Rectangle(1,1);
		Shape cir1 =  new Circle(1);
		//1)メソッド呼び出し可能

		System.out.println(rect1.getArea());
		System.out.println(cir1.getArea());

		//9-7
		rect1.expand(2);
		System.out.println(rect1.getArea());//4倍
		cir1.expand(2);
		System.out.println(cir1.getArea());//4倍
	}



}
