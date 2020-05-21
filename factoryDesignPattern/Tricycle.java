package factoryDesignPattern;

public class Tricycle extends Bike {
	public Tricycle() {
		name = "Tricycle";
		price = 54.95;
		numWheels = 3;
		hasPeddles = true;
		hasTrainingWheels = false;
		this.createBike();
	}
}
