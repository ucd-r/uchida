package work3.work3_09;
import java.util.Arrays;
import java.util.Scanner;

public class Work3_9 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数1：");
        int num1 = stdIn.nextInt() ;
        System.out.println("整数2：");
        int num2 = stdIn.nextInt() ;
        System.out.println("整数3：");
        int num3 = stdIn.nextInt() ;

        int array[] = {num1, num2, num3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

	}

}

