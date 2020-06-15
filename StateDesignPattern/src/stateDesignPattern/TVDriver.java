package stateDesignPattern;

/**
 * Driver class for TV and State classes
 * Cycles through all buttons to test functionality
 * Gets out of static-land as soon as possible
 * @author portiaportia
 */
public class TVDriver {

	public void runTV() {
		TV tv = new TV();
		tv.pressHomeButton();
		tv.pressNetflixButton();
		tv.pressMovieButton();
		tv.pressTVButton();
		tv.pressHuluButton();
		tv.pressMovieButton();
		tv.pressTVButton();
		tv.pressHomeButton();
	}
	
	public static void main(String[] args) {
		TVDriver tvDriver = new TVDriver();
		tvDriver.runTV();
	}
}
