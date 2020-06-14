package templateDesignPattern;

/**
 * Child class 2 of parent class Worker
 * Super's Worker's constructor and implements work()
 * @author justinbrown
 */
public class Policeman extends Worker {
	public Policeman(String name) {
		super(name);
		System.out.println(this.name + " is a courageous police officer.");
	}
	
	/**
	 * Prints unique message for Worker's abstract work() method
	 */
	public void work() {
		System.out.println(this.name + ": It's time to get the bad guys!");
	}
}
