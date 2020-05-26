package iteratorDesignPattern;

/**
 * Holds the details of an Item, formats text output that gets called by the driver
 * @author justinbrown
 */
public class Item {
	private String title;
	private String description;
	private double price;
	
	public Item(String title, String description, double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	/**
	 * Returns the formatted text output for an Item (title, description, price), to be printed by the driver
	 */
	public String toString() {
		return "\n***** " + this.title + " *****\n" + this.description + "\nPrice: $" + this.price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Prints the formatted toString to the console, called by WishListDriver
	 */
	public void print() {
		System.out.println(this.toString());
	}
}
