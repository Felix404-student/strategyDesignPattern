package stateDesignPattern;

/**
 * State child class 2
 * Has a list of movies and a list of tv shows which can be printed
 * Can change to Hulu or back to Home States
 * Can cycle on Netflix State
 * @author justinbrown
 */
public class NetflixState implements State {
	private TV tv;
	private String[] movies = {"Da 5 Bloods", "The Help", "The Witch", "Jerry Maguire", "Get Me Roger Stone"};
	private String[] shows = {"Hannibal", "Patriot Act", "Bojack Horseman", "Breaking Bad", "The Great British Baking Show"};
	
	public NetflixState(TV tv ) {
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
	 * Cycles on Netflix State (does nothing)
	 */
	public void pressNetflixButton() {
		System.out.println("We are already in Netflix\n");
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
	 * Prints list of all stored movies, formatted
	 */
	public void pressMovieButton() {
		System.out.println("Netflix movies:");
		for (int i = 0; i < movies.length; ++i) {
			System.out.println(" — " + movies[i]);
		}
		System.out.println();
	}
	
	/**
	 * Prints list of all stored tv shows, formatted
	 */
	public void pressTVButton() {
		System.out.println("Netflix TV shows:");
		for (int i = 0; i < shows.length; ++i) {
			System.out.println(" — " + shows[i]);
		}
		System.out.println();
	}
}
