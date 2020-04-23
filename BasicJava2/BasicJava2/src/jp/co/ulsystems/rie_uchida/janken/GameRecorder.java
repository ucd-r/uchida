package jp.co.ulsystems.rie_uchida.janken;

import java.util.ArrayList;
import java.util.List;

public class GameRecorder {

	public static void recordPlayerName(ArrayList<Player> playersList) {
		System.out.println("【ジャンケン開始】");
		playersList.forEach(player -> {
			System.out.printf(playersList.get(0) == player ? "%sさん" : "vs.%sさん", player.getName());
		});
		System.out.println();
	}

	public static void recordPlayersHand(ArrayList<Player> playersList) {
		playersList.forEach(player -> {
			System.out.printf(playersList.get(0) == player ? "%s" : "vs.%s", player.getLastHand());
		});
		System.out.println();
	}

	public static void recordResults(List<Player> winnerList, int playerNum) {
		for (Player winner : winnerList) {
			if (winnerList.size() == playerNum) {
				System.out.println("引き分け！");
				return;
			}
			System.out.printf(winnerList.get(0) == winner ? "%sさん" : "と%sさん", winner.getName());
		}
		System.out.println("が勝ちました！");
	}

	public static void recordScore(ArrayList<Player> playersList) {
		playersList.forEach(player -> {
			System.out.printf(playersList.get(0) == player ? "\n%d" : "対%d", player.getScore());
		});
		System.out.print("で");
	}

}

