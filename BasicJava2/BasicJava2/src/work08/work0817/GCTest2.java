package work08.work0817;

public class GCTest2 {
	  public static void main(String[] args) {
		    int num = 20_000_000;
		    for (int i = 0; i < num; i++) {
		      new Rectangular(3);
		      if (i % 100_000 == 0) {
		        long total = Runtime.getRuntime().totalMemory();
		        long free = Runtime.getRuntime().freeMemory();
		        System.out.printf("count %,14d : free %,14d bytes / total %,14d bytes\n", i, free, total);
		      }
		    }
		  }


}
