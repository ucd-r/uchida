package work3.work3_10;
import java.util.Scanner;

public class work3_10 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数1：");
        int num1 = stdIn.nextInt() ;
        System.out.println("整数2：");
        int num2 = stdIn.nextInt() ;

        System.out.println(num1 > num2 ? num1 : num2);

	}

}