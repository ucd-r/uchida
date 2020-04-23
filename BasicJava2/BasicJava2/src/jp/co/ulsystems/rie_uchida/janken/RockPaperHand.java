
package jp.co.ulsystems.rie_uchida.janken;

public class RockPaperHand implements Hand {

	public String chooseHand() {
		int num = Hand.rand.nextInt(2);
		if (num == 0) {
			return GU;
		} else {
			return PA;
		}
	}
}
