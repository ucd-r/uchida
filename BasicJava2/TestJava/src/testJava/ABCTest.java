package testJava;

public class ABCTest {


	public static void main(String[] args) {
		B sample = new B();
		A sample2 = new C();
		System.out.println("B");
		sample.test();
		sample.getB();
		System.out.println("C");
		sample2.test();
		//sample2.getC();
	}

}
