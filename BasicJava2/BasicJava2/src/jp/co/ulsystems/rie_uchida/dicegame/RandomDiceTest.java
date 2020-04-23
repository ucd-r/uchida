package jp.co.ulsystems.rie_uchida.dicegame;

public class RandomDiceTest {

	public static void main(String[] args) {
		RandomDice testDice = new RandomDice();

		for (int i = 0; i < 1000; i++) {
			int testNum = testDice.cast();
			if ((testNum < 1) || (testNum > 6)) {
				System.out.println("error:" + testNum);
			}
		}
	}
}
