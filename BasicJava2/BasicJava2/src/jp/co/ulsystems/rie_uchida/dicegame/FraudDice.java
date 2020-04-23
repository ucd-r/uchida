package jp.co.ulsystems.rie_uchida.dicegame;

public class FraudDice implements Dice {
	private Dice dice;

	public FraudDice(Dice anotherDice) {
		this.dice = anotherDice;
	}

	public int cast() {
		int diceNum = 0;
		while (diceNum <= 2) {
			diceNum = this.dice.cast();
		}
		return diceNum;
	}
}