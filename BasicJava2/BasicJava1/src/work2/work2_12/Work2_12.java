package work2.work2_12;
import java.util.Scanner;

public class Work2_12 {
	static final double PI = 3.1416;
			;
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("半径を入力してください：");
        double radius = stdIn.nextDouble();

        System.out.println("表面積＝" + 4*radius*radius*PI);
        System.out.println("体積＝" + (4/3)*radius*radius*radius*PI);
    }
}
