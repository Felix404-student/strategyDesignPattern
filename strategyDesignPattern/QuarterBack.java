package strategyDesignPattern;
import java.util.Random;

public class QuarterBack extends Player{

	public QuarterBack () {
		super ();
	}
	
	public QuarterBack (String name) {
		super (name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	public void setOffenceBehavior () {
		Random r = new Random();
		int pick = r.nextInt(2);						// picks 0 or 1. 0 = Run, 1 = Pass
		if (pick == 0) {
			this.offenceBehavior = new RunBehavior();
		} else if (pick == 1) {
			this.offenceBehavior = new PassBehavior();
		} else {
			System.out.println("ERROR: QuarterBack Random out of bounds");
		}
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
