package work11.work1101;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder recordVal = new StringBuilder();
		Integer num = 0;

		while (true) {
			System.out.printf("%d：", num);
			String line = scanner.nextLine();

			try {
				if (line.equals("=")) {
					recordVal.append(" = " + num);
					break;
				}

				int value = Integer.parseInt(line);
				num += value;

				if ((value > 0) && (recordVal.length() != 0)) {
					recordVal.append(" + ");
				} else if (value < 0) {
					recordVal.append(" - ");
				}
				recordVal.append(Math.abs(value));

			} catch (NumberFormatException e) {
				System.out.println("整数を入力してください");
			}
		}
		System.out.println(recordVal);
	}

}
