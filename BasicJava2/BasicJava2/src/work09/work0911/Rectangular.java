package work09.work0911;

public class Rectangular {
	//work8_5
	//public危険
	private int width;
	private int height;
	private int depth;
	
	
	
	 @Override
	 public String toString() {
	     return ("Rectangular:(width, height, depth) = (" + width + ","  + height + "," + depth + ")");
	 }

	//work8_6
	public Rectangular(int wid, int hei, int dep) {
		if(wid < 0) this.width = 0;
		else this.width = wid;

		if(hei < 0) this.height = 0;
		else this.height = hei;

		if(dep < 0) this.depth = 0;
		else this.depth = dep;
	}

	//work8_7
	public Rectangular(int num) {
		this(num, num, num);
	}
	//work8_7
	public Rectangular() {
		this(10,10,10);
	}

	//work8_14
	public int getVolume() {
		int vol = this.width *this.height * this.depth;
		return vol;
	}

	//work8_15
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getDepth() {
		return depth;
	}
	
	
	

}
