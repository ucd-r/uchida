package jp.co.ulsystems.rie_uchida.janken;

public class JankenGame {

	private static final int GAME_COUNT = 3;

	public static void main(String[] args) {
		Hand handS = new ScissorsHand();
		Hand handRP = new RockPaperHand();
		Hand handRSP = new RockScissorsPaperHand();

		Player player1 = new Player("漆原", handS);
		Player player2 = new Player("平澤", handRP);
		Player player3 = new Player("内田", handRSP);

		Judge judge = new Judge();

		judge.addPlayers(player1, player2, player3);
		judge.processGame(GAME_COUNT);
		judge.gameResults();
	}

}