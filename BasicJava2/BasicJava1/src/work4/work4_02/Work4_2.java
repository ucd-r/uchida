package work4.work4_02;
import java.util.Random;

public class Work4_2 {

	public static void main(String[] args) {
        Random rnd = new Random();
        int num = 0;

        while(num <= 100) {
            int sum = rnd.nextInt(31) ;
            System.out.printf("生成値：%d　合計値：%d\n", sum, (num += sum));
        }
	}

}
