package jp.co.ulsystems.rie_uchida.dicegame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Judge {
	private List<Player> playersList = new ArrayList<Player>();

	public void addPlayers(Player... players) {
		for (Player player : players) {
			this.playersList.add(player);
		}
	}

	public void playGame(int gameNum) {
		for (int i = 0; i < gameNum; i++) {
			for (Player player : this.playersList) {
				player.castDice();
			}
			GameRecorder.recordScore(playersList);
		}
	}

	public void gameResults() {

		List<Integer> scoreList = new ArrayList<Integer>();
		for (Player player : this.playersList) {
			scoreList.add(player.getScore());
		}

		List<String> winnersList = new ArrayList<String>();
		Integer maxScore = Collections.max(scoreList);
		for (Player player : this.playersList) {
			if (maxScore == player.getScore()) {
				winnersList.add(player.getName());
			}
		}

		if (winnersList.size() == this.playersList.size()) {
			GameRecorder.recordWinners(null);
		} else {
			GameRecorder.recordWinners(winnersList);
		}
	}

}