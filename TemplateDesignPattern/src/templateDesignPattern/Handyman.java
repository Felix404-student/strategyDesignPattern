package templateDesignPattern;

/**
 * Child class 4 of parent class Worker
 * Super's Worker's constructor and implements work()
 * @author justinbrown
 */
public class Handyman extends Worker {
	public Handyman(String name) {
		super(name);
		System.out.println(this.name + " is a strong handyman.");
	}
	
	/**
	 * Prints unique message for Worker's abstract work() method
	 */
	public void work() {
		System.out.println(this.name + ": It's time to fix stuff.");
	}
}
