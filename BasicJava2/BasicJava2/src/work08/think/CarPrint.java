package work08.think;

public class CarPrint {

	public static void main(String[] args) {
		Car car1 = new Car("プリウス",45, 30.4, 0);
		Car car2 = new Car("ロードスター", 50, 11.8, 0);

		int distance = 10;

		car1.print(car1.nowFuel(distance), car1.nowDistance(distance));
		car2.print(car2.nowFuel(distance), car2.nowDistance(distance));
	}
	

}
