package jp.co.ulsystems.rie_uchida.janken;

public class RockScissorsPaperHand implements Hand {

	public String chooseHand() {

		int num = Hand.rand.nextInt(3);

		if (num == 0) {
			return GU;
		} else if (num == 1) {
			return CHOKI;
		} else {
			return PA;
		}
	}

}
