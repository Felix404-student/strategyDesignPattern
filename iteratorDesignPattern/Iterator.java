package iteratorDesignPattern;

/**
 * Abstract interface, implemented by WishListIterator
 * @author justinbrown
 */
public interface Iterator {
	public boolean hasNext ();
	public Item next();
}
