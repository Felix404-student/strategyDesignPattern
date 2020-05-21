package factoryDesignPattern;

public class Strider extends Bike {
	public Strider() {
		name = "Strider";
		price = 65.99;
		numWheels = 2;
		hasPeddles = false;
		hasTrainingWheels = false;
		this.createBike();
	}
}
