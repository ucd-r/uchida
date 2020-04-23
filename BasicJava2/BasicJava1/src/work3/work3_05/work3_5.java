package work3.work3_05;

import java.util.Scanner;

public class work3_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        System.out.println("西暦を入力してください : ");
        int year = stdIn.nextInt() ;

        System.out.printf("西暦%dは", year);
        if (year <= 1581) {
        	System.out.println("グレゴリオ歴ではない。");
        }else if (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
        	System.out.println("閏年です。");
        }else {
        	System.out.println("平年です。");
        }
	}

}
