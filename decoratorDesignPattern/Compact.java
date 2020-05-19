package decoratorDesignPattern;

public class Compact extends Vehicle {
	public Compact() {
		this.description = "Compact";
	}
	
	/**
	 * Returns 30,000.0 for parent class's abstract getCost() method
	 */
	public double getCost() {
		return 15000.0;
	}
}
