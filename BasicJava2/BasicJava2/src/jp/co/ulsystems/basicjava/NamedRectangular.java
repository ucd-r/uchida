package jp.co.ulsystems.basicjava;

public class NamedRectangular extends Rectangular{

	String name;
	public NamedRectangular(int width, int height, int depth, String name) {
		super(width, height, depth);
		
		this.name = name;
		
	}

}
