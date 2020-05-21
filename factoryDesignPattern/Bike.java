package factoryDesignPattern;

public abstract class Bike {
	protected String name;
	protected double price;
	protected int numWheels;
	protected boolean hasPeddles;
	protected boolean hasTrainingWheels;
	
	/**
	 * No matter which child class is instantiated, their constructor will call createBike()
	 * Calls our 4 helper methods
	 */
	public void createBike() {
		createFrame();
		addWheels();
		addPedals();
		getPrice();
	}
	
	/**
	 * All types of bikes get a frame. Name set by child classes.
	 */
	private void createFrame() {
		System.out.println("Assembling " + this.name + " frame");
	}
	
	/**
	 * numWheels and hasTrainingWheels set by child classes
	 * All bikes with wheels get wheels. Kids Bikes get training wheels
	 */
	private void addWheels() {
		if (this.numWheels > 0)
			System.out.println("Adding " + this.numWheels + " wheels");
		
		if (this.hasTrainingWheels)
			System.out.println("Adding training wheels");
	}
	
	/**
	 * hasPedals set by child classes
	 * All bikes besides Strider get pedals.
	 */
	private void addPedals() {
		if (this.hasPeddles)
			System.out.println("Adding pedals");
	}
	
	/**
	 * price set by child classes
	 * All types of bikes have a price
	 */
	public void getPrice() {
			System.out.println("Price: $" + this.price);
	}
}
