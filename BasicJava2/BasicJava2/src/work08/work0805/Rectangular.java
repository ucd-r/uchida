package work08.work0805;

public class Rectangular {

	//work8_5
	//public危険
	public int width;
	public int height;
	public int depth;

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


	//work8_8
	public int getVolume() {
		int vol = this.width *this.height * this.depth;
		return vol;
	}

	//work8_9
	public void isCube () {
		if (this.width == this.height &&  this.height == this.depth)
		System.out.println("立方体");
		else
		System.out.println("直方体");
	}

	//work8_10
	// 別の直方体と体積を比較する
	public boolean isLargerThan(Rectangular another) {

		if (this.getVolume() > another.getVolume()) {
			System.out.println("大きい");
			return true;
		}
		else {
			System.out.println("小さい");
			return false;
		}
	}
	// 底辺、高さ、奥行の比率がすべて等しいかどうかを判定する
	public boolean isSimularTo(Rectangular another) {

		if((float)this.depth/(float)another.depth == (float)this.height/(float)another.height && (float)this.height/(float)another.height == (float)this.width/(float)
				another.width ){
			System.out.println("相似");
			return true;
		}
		else {
			System.out.println("not相似");
			return false;
		}


	}
}
