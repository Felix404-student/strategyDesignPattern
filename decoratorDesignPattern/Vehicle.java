package decoratorDesignPattern;

public abstract class Vehicle {
	protected String description;
	
	/**
	 * Returns the description of the vehicle, set by child classes' constructors
	 * Returns "Sedan", "Sports Car", or "Compact"
	 */
	public String toString() {
		return description;
	}
	/**
	 * Implemented by child classes
	 * @return total cost of the vehicle as a double
	 */
	public abstract double getCost();
}
