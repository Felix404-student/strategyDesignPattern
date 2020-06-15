package stateDesignPattern;

/**
 * TV is the object which gets instantiated (TV turns on) and all
 * interaction (button) methods are called on the TV object.
 * Button methods pass off to the State child classes for functionality
 * @author justinbrown
 */
public class TV {
	private State HomeState;
	private State NetflixState;
	private State HuluState;
	private State state;

	/**
	 * Instantiates the State objects, calling the constructors on this TV object
	 */
	public TV() {
		HomeState = new HomeState(this);
		NetflixState = new NetflixState(this);
		HuluState = new HuluState(this);
		this.state = HomeState;
	}
	
	/**
	 * Passes off functionality to the current State's pressHome method
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	
	/**
	 * Passes off functionality to the current State's pressNetflix method
	 */
	public void pressNetflixButton() {
		state.pressNetflixButton();
	}
	
	/**
	 * Passes off functionality to the current State's pressHulu method
	 */
	public void pressHuluButton() {
		state.pressHuluButton();
	}
	
	/**
	 * Passes off functionality to the current State's pressMovie method
	 */
	public void pressMovieButton() {
		state.pressMovieButton();
	}
	
	/**
	 * Passes off functionality to the current State's pressTV method
	 */
	public void pressTVButton() {
		state.pressTVButton();
	}
	
	/**
	 * The private attribute state tracks what the "current" State is (Home, Netflix, Hulu),
	 * so we can call the above methods on the correct State
	 * @param state The chosen next State, gets set to current State
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Passes State object, to be used in conjunction with setState
	 * @return our instantiated HomeState object
	 */
	public State getHomeState() {
		return this.HomeState;
	}
	
	/**
	 * Passes State object, to be used in conjunction with setState
	 * @return our instantiated NetflixState object
	 */
	public State getNetflixState() {
		return this.NetflixState;
	}

	/**
	 * Passes State object, to be used in conjunction with setState
	 * @return our instantiated HuluState object
	 */
	public State getHuluState() {
		return this.HuluState;
	}
}
