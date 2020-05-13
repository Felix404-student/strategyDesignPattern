package strategyDesignPattern;

public class Receiver extends Player{

	public Receiver () {
		super ();
	}
	
	public Receiver (String name) {
		super (name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	public void setOffenceBehavior () {
		this.offenceBehavior = new ReceiveBehavior();
	}
	
	public void setDefenceBehavior () {
		this.defenceBehavior = null;
	}
	
	public String play () {
		if (this.isDefence()) {
			return "not playing";
		} else {
			return this.offenceBehavior.play();
		}
	}
}
