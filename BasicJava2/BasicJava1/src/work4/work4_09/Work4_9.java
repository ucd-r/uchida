package work4.work4_09;

public class Work4_9 {

	public static void main(String[] args) {
        for(double j=0.0; j <= 1.0; j += 0.001) {
            System.out.println("値:" + j);
            System.out.printf("2乗:%f\n", j*j);
        }
	}

}
