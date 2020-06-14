package templateDesignPattern;

/**
 * Child class 3 of parent class Worker
 * Super's Worker's constructor and implements work()
 * @author justinbrown
 */
public class Postman extends Worker {
	public Postman(String name) {
		super(name);
		System.out.println(this.name + " is a weather-proof postman.");
	}
	
	/**
	 * Prints unique message for Worker's abstract work() method
	 */
	public void work() {
		System.out.println(this.name + ": It's time to deliver the mail.");
	}
}
