package jp.co.ulsystems.rie_uchida.dicegame;

public class FraudDiceTest {

	public static void main(String[] args) {
		RandomDice testR = new RandomDice();
		SequentialDice testS = new SequentialDice();

		//ランダムサイコロを細工
		FraudDice testDice1 = new FraudDice(testR);
		for (int i = 0; i < 1000; i++) {
			int diceNum = testDice1.cast();
			if ((diceNum < 3) || (diceNum > 6)) {
				System.out.println("error:" + diceNum);
			}
		}
		//順次サイコロを細工
		FraudDice testDice2 = new FraudDice(testS);
		for (int i = 0; i < 1000; i++) {
			int diceNum = testDice2.cast();
			if ((diceNum < 3) || (diceNum > 6)) {
				System.out.println("error:" + diceNum);
			}
		}
	}
}
