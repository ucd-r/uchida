package work4.work4_15;
import java.util.Scanner;

public class Work4_15 {
	static final int NUM = 25;

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum;
        for(int j=1; j <= 5; j ++) {
            System.out.printf("%d回目:数値を入力してください:", j);
            sum = stdIn.nextInt();

             if (sum == NUM) {
            	 System.out.println("正解！");
            	 break;
             }else if(sum < NUM) {
                 System.out.println("もっと大きな数です");
             }else if(sum > NUM) {
            	 System.out.println("もっと小さな数です");
             }

             if(j ==5) {
            	 System.out.printf("正解は%dでした", NUM);
             }
        }
	}

}

