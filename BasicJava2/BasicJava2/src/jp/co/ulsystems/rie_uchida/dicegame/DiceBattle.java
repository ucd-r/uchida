package jp.co.ulsystems.rie_uchida.dicegame;

public class DiceBattle {
	private static final int GAME_NUM = 5;

	public static void main(String[] args) {

		Dice diceR = new RandomDice();
		Dice diceF = new FraudDice(diceR);
		Dice diceS = new SequentialDice();

		Player player1 = new Player("龍頭", diceF);
		Player player2 = new Player("平澤", diceR);
		Player player3 = new Player("内田", diceS);

		Judge judge = new Judge();

		judge.addPlayers(player1, player2, player3);

		judge.playGame(GAME_NUM);

		judge.gameResults();

	}

}