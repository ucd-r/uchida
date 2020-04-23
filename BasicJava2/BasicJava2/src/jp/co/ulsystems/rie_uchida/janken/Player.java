package jp.co.ulsystems.rie_uchida.janken;

public class Player {
	private String name;
	private Hand hand;
	private int score;
	private String lastHand;

	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	public String getLastHand() {
		return this.lastHand;
	}

	public String setHand() {
		lastHand = hand.chooseHand();
		return this.lastHand;
	}

	public void addPoint() {
		score += 1;
	}

}
