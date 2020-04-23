package jp.co.ulsystems.rie_uchida.dicegame;

public class PlayerTest {

	public static void main(String[] args) {
		RandomDice diceR = new RandomDice();
		FraudDice diceF = new FraudDice(diceR);

		Player rie = new Player("rie", diceF);

		for (int i = 0; i < 1; i++) {
			rie.castDice();
			System.out.println("目：" + rie.getLastDiceNum());
			System.out.println("スコア：" + rie.getScore());
		}
	}
}