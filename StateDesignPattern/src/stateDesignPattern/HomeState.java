package stateDesignPattern;

/**
 * State child class 1
 * TV.state starts in HomeState
 * Does not have movies or tv
 * Can change to Netflix or Hulu States
 * Can cycle on Home State
 * @author justinbrown
 */
public class HomeState implements State {
	private TV tv;
	
	public HomeState(TV tv) {
		this.tv = tv;
	}
	
	/**
	 * Cycles on Home State (does nothing)
	 */
	public void pressHomeButton() {
		System.out.println("TV is already on the home screen\n");
	}
	
	/**
	 * Changes TV.state to Netflix State
	 * Goto NetflixState class
	 */
	public void pressNetflixButton() {
		System.out.println("Loading Netflix...\n");
		tv.setState(tv.getNetflixState());
	}
	
	/**
	 * Changes TV.state to Hulu State
	 * Goto HuluState class
	 */
	public void pressHuluButton() {
		System.out.println("Loading Hulu...\n");
		tv.setState(tv.getHuluState());
	}
	
	/**
	 * Home State has no movies (does nothing)
	 */
	public void pressMovieButton() {
		System.out.println("You must pick an app to show movies.\n");
	}
	
	/**
	 * Home State has no tv shows (does nothing)
	 */
	public void pressTVButton() {
		System.out.println("You must pick an app to show tv shows.\n");
	}
}
