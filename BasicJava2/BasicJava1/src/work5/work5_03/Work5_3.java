package work5.work5_03;

import java.util.Arrays;
import java.util.Scanner;

public class Work5_3 {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		Scanner stdIn = new Scanner(System.in);
		int num = 0;

		System.out.println("要素（1~10）:");
		num = stdIn.nextInt();

		for (int i = 1; i < intArray.length; i++) {
			while (intArray[i - 1] == num) {
				System.out.println("要素（1~10）:");
				num = stdIn.nextInt();
			}
			intArray[i] = num;
		}

		System.out.println(Arrays.toString(intArray));

	}

}