package work08.think;

public class Car {

	  String carName;		// 車名
	  double carFuel;			// 燃料
	  double carFuelCost;			// 燃費
	  double carDistance;			// 走行距離


	  public Car(String carName, double carFuel, double carFuelCost, double carDistance) {
		  this.carName = carName;
		  this.carFuel = carFuel;
		  this.carFuelCost = carFuelCost;
		  this.carDistance = carDistance;
	  }



	// 燃料消費計算
	  public double nowFuel(int distance){
		  carFuel     -= distance/carFuelCost;
		  return carFuel;
	  }
	// 走行距離計算
	  public double nowDistance(int distance){
		  carDistance += distance;
		  return carDistance;
	  }

	// 自動車の状態を表示
	  void print(double fuelCost,  double Mileage) {
		 System.out.println(String.format(
		   "%s 燃費:%.2f 燃料:%.2f 走行距離:%.2f",
		   carName, carFuelCost, fuelCost, Mileage));
		}

}
