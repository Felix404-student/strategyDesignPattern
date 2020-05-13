package strategyDesignPattern;
import java.util.Random;

public class RunBehavior implements OffenceBehavior{

	public String play () {
		Random r = new Random();
		int pick = r.nextInt(4);						// picks 0, 1, 2, or 3. 0 = drive (up the gut), 1 = draw, 2 = pitch, 3 = reverse,
		String play = "";
		switch (pick) {
			case 0:	play = "drive (up the gut)";
			break;
			case 1:	play = "draw";
			break;
			case 2:	play = "pitch";
			break;
			case 3: play = "reverse";
			break;
			default: System.out.println("ERROR: RunBehavior Random out of bounds");
			break;
		}
		return "runs a " + play;
	}
	
}
