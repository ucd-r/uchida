package work3.work3_07;
import java.util.Scanner;

public class Work3_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
        System.out.println("整数1：");
        int num1 = stdIn.nextInt() ;
        System.out.println("整数2：");
        int num2 = stdIn.nextInt() ;

        if (Math.abs(num1-num2) <= 10) {
        	System.out.println("それらの差は10以下です。");
        }else {
        	System.out.println("それらの差は11以上です。");
        }

	}

}
