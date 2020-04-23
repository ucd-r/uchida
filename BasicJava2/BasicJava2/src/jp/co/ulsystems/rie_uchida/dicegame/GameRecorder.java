package jp.co.ulsystems.rie_uchida.dicegame;

import java.util.List;

public class GameRecorder {

	public static void recordScore(List<Player> playersList) {
		for (Player player : playersList) {
			System.out.printf("%sさん：%d(%d)\t", player.getName(), player.getLastDiceNum(), player.getScore());
		}
		System.out.println();
	}

	public static void recordWinners(List<String> winnerList) {
		if (winnerList == null) {
			System.out.println("引き分けです！");
			return;
		}
		for (String winner : winnerList) {
			if (winnerList.get(winnerList.size() - 1).equals(winner)) {
				System.out.printf("%sさん", winner);
			} else {
				System.out.printf("%sさんと", winner);
			}
		}
		System.out.println("の勝ち！");
	}

}
