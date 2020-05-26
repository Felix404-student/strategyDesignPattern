package iteratorDesignPattern;

/**
 * Holds an array of max 5 Items. When the array is full, the array will double in size.
 * Holds the name of the WishList
 * @author justinbrown
 */
public class WishList {
	private String name;
	private Item[] items;
	private int count;
	private int maxCount = 5;
	
	public WishList(String name) {
		this.name = name;
		items = new Item[maxCount];
	}
	
	/*
	 * Adds 1 Item to the first empty index of the array.
	 * If array is already full, calls growArray to double its size
	 * Keeps track of first empty index in  array
	 */
	public void addItem(String title, String description, double price) {
		if (count >= maxCount) {
			growArray(items);
		}
		items[count] = new Item(title, description, price);
		count++;
	}
	
	/**
	 * creates a WishListIterator to iterate over the array
	 * @return an Iterator for the array of Items
	 */
	public WishListIterator createIterator() {
		return new WishListIterator(items);
	}
	
	/*
	 * Sums the price of all Items in array without needing to check if index is empty
	 */
	public double getTotalPrice() {
		double sum = 0.0;
		for (int i = 0; i < count; ++i) {
			sum += items[i].getPrice();
		}
		return sum;
	}
	
	/*
	 * Doubles size of array, copying over Items already in array
	 */
	private Item[] growArray(Item[] items) {
		maxCount *= 2;
		Item[] temp = new Item[maxCount];
		for (int i = 0; i < maxCount; ++i) {
			temp[i] = items[i];
		}
		items = temp;
		return items;
	}
}
