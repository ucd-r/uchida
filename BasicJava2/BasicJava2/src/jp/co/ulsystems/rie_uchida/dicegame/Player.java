package jp.co.ulsystems.rie_uchida.dicegame;

public class Player {
	private String name;
	private Dice dice;
	private int score;
	private int lastDiceNum;

	public Player(String name, Dice dice) {
		this.dice = dice;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void castDice() {
		this.lastDiceNum = dice.cast();
		score += this.lastDiceNum;
	}

	public int getScore() {
		return this.score;
	}

	public int getLastDiceNum() {
		return this.lastDiceNum;
	}
}
