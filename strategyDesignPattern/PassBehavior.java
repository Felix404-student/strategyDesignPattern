package strategyDesignPattern;
import java.util.Random;

public class PassBehavior implements OffenceBehavior{

	public String play () {
		Random r = new Random();
		int pick = r.nextInt(4);						// picks 0, 1, 2, 3, or 4. 0 = drive (up the gut)
		String play = "";								// 0 = slant route, 1 = out route, 2 = seem route, 3 = screen pass, 4 = hail mary
		switch (pick) {
			case 0:	play = "slant route";
			break;
			case 1:	play = "out route";
			break;
			case 2:	play = "seem route";
			break;
			case 3: play = "screen pass";
			break;
			case 4: play = "hail mary";
			break;
			default: System.out.println("ERROR: PassBehavior Random out of bounds");
			break;
		}
		return "runs a " + play;
	}
	
}
