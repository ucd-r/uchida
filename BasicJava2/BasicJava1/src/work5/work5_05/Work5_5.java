package work5.work5_05;

import java.util.Arrays;

public class Work5_5 {

	public static void main(String[] args) {
		int[][] intArrays = { { 8, 4, 10, 2, 7, 5, 1, 3, 9, 6 }, { 4, 2, 9, 5, 1, 6, 2 } };

		for (int[] intArray : intArrays) {
			int[] destArray = new int[intArray.length];
			System.out.println("対象配列 : " + Arrays.toString(intArray));
			reverseArray(intArray, destArray, intArray.length);
			System.out.println("処理結果 : " + Arrays.toString(destArray));
			System.out.println();
		}

	}

	public static void reverseArray(int src[], int dest[], int len) {
		for (int i = 0; i < len; i++) {
			dest[i] = src[len - 1 - i];
		}
	}

}