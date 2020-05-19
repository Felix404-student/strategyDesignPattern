package decoratorDesignPattern;

public abstract class VehicleDecorator extends Vehicle {
	/**
	 * Implemented by child classes
	 * Adds additional descriptions of the vehicle
	 * Possible additions "fancy paint", "cool rims", and "awesome sound"
	 */
	public abstract String toString();
}
