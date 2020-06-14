package templateDesignPattern;

/**
 * Child class 1 of parent class Worker
 * Super's Worker's constructor and implements work()
 * @author justinbrown
 */
public class FireFighter extends Worker {
	public FireFighter(String name) {
		super(name);
		System.out.println(this.name + " is a brave fire fighter.");
	}
	
	/**
	 * Prints unique message for Worker's abstract work() method
	 */
	public void work() {
		System.out.println(this.name + ": It's time to water down the fires.");
	}
}
