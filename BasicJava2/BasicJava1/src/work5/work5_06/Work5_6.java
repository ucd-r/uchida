package work5.work5_06;

import java.util.Scanner;

public class Work5_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] array = { 8, 4, 10, 2, 7, 5, 1, 3, 9, 6 };

		System.out.println("検索（数字）：");
		int searchNum = stdIn.nextInt();
		for (int num : array) {
			if (num == searchNum) {
				System.out.println("あり");
				System.exit(0);
			}
		}
		System.out.println("なし");
	}

}
