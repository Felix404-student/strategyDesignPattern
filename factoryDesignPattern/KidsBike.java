package factoryDesignPattern;

public class KidsBike extends Bike{
	public KidsBike() {
		name = "Kids Bike";
		price = 80.99;
		numWheels = 2;
		hasPeddles = true;
		hasTrainingWheels = true;
		this.createBike();
	}
}
