package work4.work4_10;

public class Work4_10 {

	public static void main(String[] args) {
        System.out.print(" |");
        for(int i = 1; i <= 9; i++) System.out.printf("%2d",i);
        System.out.println();
        for(int i = 1; i <= 20; i++) {
            if(i == 4) {
            	System.out.print("+");
            }
            System.out.print("-");
        }
        System.out.println();
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%2d%2s",i,"|");
            for(int j = 1; j <=9; j++)
                System.out.printf("%2d",j*i);
            System.out.println();
        }
	}

}
