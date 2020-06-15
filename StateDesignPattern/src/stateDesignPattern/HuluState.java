package stateDesignPattern;

/**
 * State child class 3
 * Has a list of movies and a list of tv shows which can be printed
 * Can change to Netflix or back to Home States
 * Can cycle on Hulu State
 * @author justinbrown
 */
public class HuluState implements State {
	private TV tv;
	private String[] movies = {"The Last Black Man in San Francisco", "Midsommar", "It's a Wonderful Life", "The Disaster Artist", "Eigth Grade"};
	private String[] shows = {"Jack Ryan", "Chernobyl", "Mr. Robot", "The Wire", "Westworld"};
	
	public HuluState(TV tv ) {
		this.tv = tv;
	}
	
	/**
	 * Changes TV.state back to Home State
	 * Goto HomeState class
	 */
	public void pressHomeButton() {
		System.out.println("Loading Home Screen...\n");
		tv.setState(tv.getHomeState());
	}
	
	/**
	 * Changes TV.state to Netlfix State
	 * Goto NetflixState class
	 */
	public void pressNetflixButton() {
		System.out.println("Loading Netflix...\n");
		tv.setState(tv.getNetflixState());
	}
	
	/**
	 * Cycles on Hulu State (does nothing)
	 */
	public void pressHuluButton() {
		System.out.println("We are already in Hulu\n");
	}
	
	/**
	 * Prints list of all stored movies, formatted
	 */
	public void pressMovieButton() {
		System.out.println("Hulu movies:");
		for (int i = 0; i < movies.length; ++i) {
			System.out.println(" — " + movies[i]);
		}
		System.out.println();
	}
	
	/**
	 * Prints list of all stored tv shows, formatted
	 */
	public void pressTVButton() {
		System.out.println("Hulu TV shows:");
		for (int i = 0; i < shows.length; ++i) {
			System.out.println(" — " + shows[i]);
		}
		System.out.println();
	}
}
