package decoratorDesignPattern;

public class SoundSystem extends VehicleDecorator {
	private Vehicle vehicle;
	
	/**
	 * wraps a Vehicle in a SoundSystem object
	 * modifies the SoundSystem object's description based on the Vehicle's description
	 * the description can already be modified by another decorator class
	 * @param vehicle An instantiated object of a child class of Vehicle
	 */
	public SoundSystem (Vehicle vehicle) {
		this.vehicle = vehicle;
		this.description = vehicle.description + ", awesome sound";
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
		return vehicle.getCost() + 350.0;
	}
}
