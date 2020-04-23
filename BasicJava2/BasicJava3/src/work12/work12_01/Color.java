package work12.work12_01;

public enum Color {
	BLACK("黒", 0x000000), RED("赤", 0xff0000), GREEN("緑", 0x00ff00), YELLOW("黄", 0xffff00),
	BLUE("青",0x0000ff), PURPLE("紫", 0xff00ff), CYAN("水", 0x00ffff), WHITE("白", 0xffffff);

	private final String japaneseName;
	private final int colorCode;

	Color(String japaneseName, int colorCode) {
		this.japaneseName = japaneseName;
		this.colorCode = colorCode;
	}

	public String japaneseName() {
		return japaneseName;
	}

	public int colorCode() {
		return colorCode;
	}
}