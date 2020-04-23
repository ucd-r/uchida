package work5.work5_08;

import java.util.Arrays;

public class Work5_8 {

	public static void main(String[] args) {
		String a[] = { "Alan", "Bob", "Charles", "David" };
		String b[] = new String[a.length];
		System.out.println(Arrays.toString(reverse(a, b, a.length)));
	}

	static String[] reverse(String src[], String dest[], int len) {
		for (int i = 0; i < len; i++) {
			dest[i] = src[len - 1 - i];
		}
		return dest;
	}
}
