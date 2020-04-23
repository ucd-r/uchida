package jp.co.ulsystems.rie_uchida.dicegame;

public class SequentialDice implements Dice {
	private int diceNum = 0;

	public int cast() {
		if (this.diceNum == 6) {
			this.diceNum = 0;
		}
		this.diceNum++;
		return this.diceNum;
	}
}
