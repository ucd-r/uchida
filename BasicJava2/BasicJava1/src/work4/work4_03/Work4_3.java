package work4.work4_03;
import java.util.Scanner;

public class Work4_3 {
	static final int NUM = 25;

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum;
        do {
            System.out.println("数値を入力してください:");
             sum = stdIn.nextInt();

             if(sum < NUM) {
                 System.out.println("もっと大きな数です");
             }else if(sum > NUM) {
            	 System.out.println("もっと小さな数です");
             }

        }while(sum != NUM);
        System.out.println("正解です！");
	}

}
