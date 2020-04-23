package work4.work4_08;
import java.util.Random;

public class Work4_8 {

	public static void main(String[] args) {
        Random rnd = new Random();

        int n = rnd.nextInt(9) + 1;
        System.out.println(n + "段");

        for(int i=1; i <= n; i++) {

            int space = n - i;
            int num = 2*i-1;

            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for(int j=0; j < num; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
	}

}
