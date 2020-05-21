package factoryDesignPattern;

public class BikeStore {
	public Bike orderBike(String type) {
		return createBike(type);
	}
	
	/**
	 * createBike() determines which child class gets called to instantiate the bike
	 * @param type a String that is checked to determine the correct child class
	 * @return an instance of the appropriate child class of Bike, either Tricycle, Strider, or Kids Bike
	 */
	private Bike createBike(String type) {
		Bike bike;
		
		if (type.toLowerCase() == "tricycle")
			bike = new Tricycle();
			
		else if (type.toLowerCase() == "strider")
			bike = new Strider();
		
		else
			bike = new KidsBike();

		return bike;
	}
}
