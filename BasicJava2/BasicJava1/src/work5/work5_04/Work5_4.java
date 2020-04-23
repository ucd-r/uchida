package work5.work5_04;

import java.util.Arrays;

public class Work5_4 {

	public static void main(String[] args) {
		int[] intArray = { 8, 4, 10, 2, 7, 5, 1, 3, 9, 6 };

		System.out.println("対象行列：" + Arrays.toString(intArray));
		System.out.println("最大値：" + intArray[maxNum(intArray)]);
		System.out.println("添え字：" + maxNum(intArray));
	}

	private static int maxNum(int[] intArray) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
				index = i;
			}
		}
		return index;
	}

}