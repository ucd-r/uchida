package work3.work3_03;
import java.util.Scanner;

public class Work3_3 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("幅を入力してください：");
        int width = stdIn.nextInt() ;

        if(width < 1) {
        	System.out.println("1以上の値を入力してください：");
        	System.exit(0);
        }else {
            System.out.println("高さを入力してください：");
            int height = stdIn.nextInt() ;
            if(height < 1) {
            	System.out.println("1以上の値を入力してください：");
            	System.exit(0);
            }
            System.out.println("面積：" + width*height);
            
        }

	}

}
