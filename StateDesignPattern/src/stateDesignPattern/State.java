package stateDesignPattern;

/**
 * Parent state class
 * Does not get instantiated
 * Stipulates what methods (buttons) child State classes must implement
 * @author justinbrown
 */
public interface State {
	public void pressHomeButton();
	
	public void pressNetflixButton();
	
	public void pressHuluButton();
	
	public void pressMovieButton();
	
	public void pressTVButton();
}
	
	
