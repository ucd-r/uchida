package jp.co.ulsystems.rie_uchida.janken;

public class HandTest {

	public static void main(String[] args) {
		Hand test1 = new ScissorsHand();
		Hand test2 = new RockPaperHand();
		Hand test3 = new RockScissorsPaperHand();

		for (int i = 0; i < 100; i++) {

			//チョキ
			String tsetHand = test1.chooseHand();
			if (tsetHand.equals(Hand.CHOKI)) {
			} else {
				System.out.println(" Error :" + tsetHand);
			}

			//グー、パー
			tsetHand = test2.chooseHand();
			if (tsetHand.equals(Hand.GU) || tsetHand.equals(Hand.PA)) {
			} else {
				System.out.println(" Error :" + tsetHand);
			}

			//グー、チョキ，パー
			tsetHand = test3.chooseHand();
			if (tsetHand.equals(Hand.GU) || tsetHand.equals(Hand.CHOKI) || tsetHand.equals(Hand.PA)) {
			} else {
				System.out.println(" Error :" + test3.chooseHand());
			}
		}

	}
}