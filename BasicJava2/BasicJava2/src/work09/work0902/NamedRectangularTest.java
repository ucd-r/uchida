package work09.work0902;

import jp.co.ulsystems.basicjava.NamedRectangular;

public class NamedRectangularTest {

	public static void main(String[] args) {
		NamedRectangular test = new NamedRectangular(3,3,3,"test");
		System.out.println("getVolume:" + test.getVolume());
		System.out.println("isCube:" + test.isCube());
	}

}

