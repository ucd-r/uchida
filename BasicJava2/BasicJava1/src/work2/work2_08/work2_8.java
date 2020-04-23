package work2.work2_08;
import java.util.Scanner;

public class work2_8 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("身長(cm)を入力してください：");
        double height = (stdIn.nextDouble())*0.01;
        System.out.println("体重（kg）を入力してください：");
        double Weight = stdIn.nextDouble();

        System.out.printf("BMIは%.1fです。", Weight/(height*height));

	}

}
