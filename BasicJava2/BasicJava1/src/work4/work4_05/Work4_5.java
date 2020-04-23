package work4.work4_05;

public class Work4_5 {

	public static void main(String[] args) {
        int num = 0;
        for(int year = 1582; year <= 2016; year++) {

            if((year%4 == 0 & year%100 != 0) || year%400 == 0) {
                System.out.println(year + "年");
                num++;
            }
        }
        System.out.println("回数：" + num);
	}

}
