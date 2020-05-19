package decoratorDesignPattern;

public class SportsCar extends Vehicle {
	public SportsCar() {
		this.description = "Sports Car";
	}
	
	/**
	 * Returns 30,000.0 for parent class's abstract getCost() method
	 */
	public double getCost() {
		return 30000.0;
	}
}
