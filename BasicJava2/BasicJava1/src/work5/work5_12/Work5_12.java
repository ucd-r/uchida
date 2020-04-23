package work5.work5_12;

public class Work5_12 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s", i, args[i]);
			sum += Integer.valueOf(args[i]);
		}
		System.out.println("Sum=" + sum);
	}

}
