package templateDesignPattern;

/**
 * Abstract base class of Worker — cannot be instantiated
 * Has children: Firefighter, Policeman, Postman, and HandyMan
 * Name is protected so it can be read by child classes.
 * DailyRoutine calls all following methods, to be executed in sequence. 
 * @author justinbrown
 */
public abstract class Worker {
	protected String name;
	
	public Worker(String name) {
		this.name = name;
	}
	
	/**
	 * The method that calls all of the helper methods, to be executed in sequence
	 * Note that work() is abstract and will only be implemented by child classes
	 */
	public void dailyRoutine() {
		wakeUp();
		eatBreakfast();
		goToWork();
		work();
		comeHome();
		eat();
		sleep();
	}
	
	/**
	 * Helper method 1, prints same message for all child classes
	 */
	public void wakeUp() {
		System.out.println(this.name + ": It's time to get out of bed, sleepyhead.");
	}
	
	/**
	 * Helper method 2, prints same message for all child classes
	 */
	public void eatBreakfast() {
		System.out.println(this.name + ": It's time to eat some yummy breakfast.");
	}
	
	/**
	 * Helper method 3, prints same message for all child classes
	 */
	public void goToWork() {
		System.out.println(this.name + ": It's time to drive to work.");
	}
	
	/**
	 * Helper method 4: abstract. Gets called by dailyRoutine(), but executes the child class's method	
	 */
	public abstract void work();
	
	/**
	 * Helper method 5, prints same message for all child classes
	 */
	public void comeHome() {
		System.out.println(this.name + ": It's time to drive home, YAY!");
	}
	
	/**
	 * Helper method 6, prints same message for all child classes
	 */
	public void eat() {
		System.out.println(this.name + ": It's time to eat, yum yum yum.");
	}
	
	/**
	 * Helper method 7, prints same message for all child classes
	 */
	public void sleep() {
		System.out.println(this.name + ": It's time to go back to bed...zzzzz");
	}
}
