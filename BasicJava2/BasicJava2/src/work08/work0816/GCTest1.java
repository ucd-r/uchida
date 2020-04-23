package work08.work0816;

import java.util.Scanner;

public class GCTest1 {

	  public static void main(String[] args) {
		    System.out.println("VisualVM を接続してください.");
		    new Scanner(System.in).nextLine();
		    int num = 20_000_000;
		    Rectangular[] array = new Rectangular[num];
		    for (int i = 0; i < num; i++) {
		      array[i] = new Rectangular(3);
		      if (i % 100_000 == 0) {
		        long total = Runtime.getRuntime().totalMemory();
		        long free = Runtime.getRuntime().freeMemory();
		        System.out.printf("count %,14d : free %,14d bytes / total %,14d bytes\n", i, free, total);
		      }
		    }
		  }

}
