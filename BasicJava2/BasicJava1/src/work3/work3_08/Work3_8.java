package work3.work3_08;
import java.util.Scanner;

public class Work3_8 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数：");
        int num = stdIn.nextInt() ;

        System.out.println(getFizzBuzzCheckResult(num));

	}

    public static String getFizzBuzzCheckResult(int num) {

        if(num % 15 == 0)
            return "FizzBuzz";
        else if (num % 5 == 0)
            return "Buzz";
        else if(num % 3 == 0)
            return "Fizz";
        else
            return String.valueOf(num);
    }

}
