package jp.co.ulsystems.rie_uchida.dicegame;

public class DiceGame {
	private static final int GAME_NUM = 5;

	public static void main(String[] args) {
		RandomDice diceR = new RandomDice();
		FraudDice diceF = new FraudDice(diceR);

		Player player1 = new Player("龍頭", diceF);
		Player player2 = new Player("平澤", diceR);

		Judge judge = new Judge();

		judge.addPlayers(player1, player2);
		judge.playGame(GAME_NUM);
		judge.gameResults();
	}
}