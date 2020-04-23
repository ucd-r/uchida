package work12.work12_01;

public class work12_1 {

	public static void main(String[] args) {

		Color colorArray[] = { Color.BLACK, Color.RED, Color.YELLOW, Color.BLUE, Color.PURPLE, Color.CYAN,
				Color.WHITE };

		for (Color color : colorArray) {
			System.out.printf("色名：%s，カラーコード：#%06x\n", color.japaneseName(), color.colorCode());
		}

	}

}
