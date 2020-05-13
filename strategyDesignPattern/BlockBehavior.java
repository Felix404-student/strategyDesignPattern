package strategyDesignPattern;
import java.util.Random;

public class BlockBehavior implements DefenceBehavior{

	public String play () {
		Random r = new Random();
		int pick = r.nextInt(4);						// picks 0, 1, 2, or 3. 0 = kick, 1 = punt, 2 = pass, 3 = catch
		String play = "";
		switch (pick) {
			case 0:	play = "kick";
			break;
			case 1:	play = "punt";
			break;
			case 2:	play = "pass";
			break;
			case 3: play = "catch";
			break;
			default: System.out.println("ERROR: BlockBehavior Random out of bounds");
			break;
		}
		return "block a " + play;
	}

}
