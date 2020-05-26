package iteratorDesignPattern;

/**
 * Creates an Iterator to iterate over all Items in the WishList
 * @author justinbrown
 */
public class WishListIterator implements Iterator {
	private Item[] items;
	private int position = 0;
	
	public WishListIterator(Item[] items) {
		this.items = items;
	}
	
	/**
	 * Determines if there is an instantiated Item in the next index of the array or not
	 */
	public boolean hasNext() {
		return !(position >= items.length || items[position] == null);
	}
	
	/**
	 * First uses hasNext() to check the next index, then iterates over the array of items,
	 * returns the Item at the next index of the array.
	 * If there are no more Items, returns null.
	 */
	public Item next() {
		if (hasNext()) {
			Item item = items[position];
			position++;
			return item;
		}
		return null;
	}
}
