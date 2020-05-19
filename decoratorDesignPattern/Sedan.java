package decoratorDesignPattern;

public class Sedan extends Vehicle {
	public Sedan() {
		this.description = "Sedan";
	}
	
	/**
	 * Returns 20,000.0 for parent class's abstract getCost() method
	 */
	public double getCost() {
		return 20000.0;
	}
}