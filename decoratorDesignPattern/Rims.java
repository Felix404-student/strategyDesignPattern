package decoratorDesignPattern;

public class Rims extends VehicleDecorator {
	private Vehicle vehicle;
	
	/**
	 * wraps a Vehicle in a Rims object
	 * modifies the Rims object's description based on the Vehicle's description
	 * the description can already be modified by another decorator class
	 * @param vehicle An instantiated object of a child class of Vehicle
	 */
	public Rims (Vehicle vehicle) {
		this.vehicle = vehicle;
		this.description = vehicle.description + ", cool rims";
	}
	
	/**
	 * Returns the modified description
	 */
	public String toString() {
		return vehicle.description;
	}
	
	/**
	 * Calls the Vehicle's getCost() method, and adds to it
	 */
	public double getCost() {
		return vehicle.getCost() + 200.0;
	}
}
