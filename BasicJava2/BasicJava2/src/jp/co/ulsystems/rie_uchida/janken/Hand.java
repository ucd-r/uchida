package jp.co.ulsystems.rie_uchida.janken;

import java.util.Random;

public interface Hand {

	public static Random rand = new Random();
	public static final String GU = "グー";
	public static final String CHOKI = "チョキ";
	public static final String PA = "パー";

	//出す手を決める
	public String chooseHand();
}
