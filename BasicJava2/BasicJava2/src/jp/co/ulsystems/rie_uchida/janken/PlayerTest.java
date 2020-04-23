package jp.co.ulsystems.rie_uchida.janken;

public class PlayerTest {

	public static void main(String[] args) {
		Hand scissorsHand = new ScissorsHand();
		Player rie = new Player("rie", scissorsHand);

		System.out.printf("名前：%s, 手：%s, 点数：%d\n", rie.getName(), rie.setHand(), rie.getScore());
		rie.addPoint();
		System.out.println("加点後：" + rie.getScore());

	}

}