package work2.work2_04;

import java.util.Scanner;

public class Work2_4 {
	  public static void main(String[] args) {
		    Scanner stdIn = new Scanner(System.in);
		    System.out.println("xとyを加減乗除します。");
		    System.out.print("xの値:");	// x の値の入力を促す
		    int x = stdIn.nextInt();	// x に整数値を読み込む
		    System.out.print("yの値:");	// y の値の入力を促す
		    int y = stdIn.nextInt();	// y に整数値を読み込む
		    
		    System.out.println("x + y = " + (x + y));	// x + y の値を表示
		    System.out.println("x - y = " + (x - y));	// x - y の値を表示
		    System.out.println("x * y = " + (x * y));	// x * y の値を表示
		    System.out.println("x / y = " + (x / y));	// x / y の値を表示
		    System.out.println("x % y = " + (x % y));	// x % y の値を表示
		  }

}
