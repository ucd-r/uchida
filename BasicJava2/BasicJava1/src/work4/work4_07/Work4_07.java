package work4.work4_07;
import java.util.Scanner;

public class Work4_07 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("何個表示しますか：");
        int num = stdIn.nextInt();
        
        int start = 2;//初項
        int ratio = 3;
        int total = 0;
        
        System.out.print(start);
        for(int i=1; i < num; i++) {
            System.out.print( ", " + (int)(start*(Math.pow(ratio, i))));
            total +=  start*(Math.pow(ratio, i));
        }

        System.out.println("\ntotal:" + total);

	}

}

