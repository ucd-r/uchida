package work2.work2_05;

import java.util.Scanner;

public class Work2_5 {
	 public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Scanner stdIn2 = new Scanner(System.in);
		Scanner stdIn3 = new Scanner(System.in);
		System.out.print("文字列入力：");
		String  stringIn = stdIn.next();
		System.out.println(stringIn);
		
		boolean boolIn = false;
		System.out.println("\n" + boolIn);
		System.out.print("入力：");	
		boolIn = stdIn2.hasNext();
		System.out.println(boolIn);
		
		System.out.print("\n少数入力：");	
		double boubleIn = stdIn3.nextDouble();
		System.out.println(boubleIn);
	 }

}
