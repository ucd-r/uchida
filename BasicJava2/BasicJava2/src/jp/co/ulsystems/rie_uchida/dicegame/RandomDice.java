package jp.co.ulsystems.rie_uchida.dicegame;

import java.util.Random;

public class RandomDice implements Dice {
	private Random rand = new Random();

	public int cast() {
		int diceNum = this.rand.nextInt(6) + 1;
		return diceNum;
	}
}
