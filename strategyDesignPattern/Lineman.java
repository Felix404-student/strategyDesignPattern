package strategyDesignPattern;
import java.util.Random;

public class Lineman extends Player{

	public Lineman () {
		super ();
	}
	
	public Lineman (String name) {
		super (name);
		this.setDefenceBehavior();
		this.setOffenceBehavior();
	}
	
	public void setOffenceBehavior () {
		this.offenceBehavior = new OBlockBehavior();
	}
	
	public void setDefenceBehavior () {
		Random r = new Random();
		int pick = r.nextInt(3);						// picks 0, 1, or 2. 0 = Block, 1 = Strip, 2 = Sack
		if (pick == 0) {
			this.defenceBehavior = new BlockBehavior();
		} else if (pick == 1) {
			this.defenceBehavior = new StripBehavior();
		} else if (pick == 2) {
			this.defenceBehavior = new SackBehavior();
		} else {
			System.out.println("ERROR: Lineman Random out of bounds");
		}
	}
	
	public String play () {
		if (this.isDefence()) {
			return this.defenceBehavior.play();
		} else {
			return this.offenceBehavior.play();
		}
	}
}
