package work3.work3_06;
import java.util.Scanner;

public class Work3_6 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数入力：");
        int x = stdIn.nextInt() ;

        if(x%3 == 0) {
        	 System.out.println("その値は3で割り切れます。");
        }else if (x%3 == 1) {
        	System.out.println("その値を3で割った余りは1です。");
        }else if (x%3 == 2) {
        	System.out.println("その値を3で割った余りは2です。");
        }
	}

}
