package observerDesignPattern;

public class HoleScoreDisplay implements Observer {

	private Subject golfer;
	
	private int strokes, par;

	public HoleScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		golfer.registerObserver(this);
	}
	
	public void update (int strokes, int par) {
		this.strokes = strokes;
		this.par = par;
		displayCurrentScore();
	}
	
	private void displayCurrentScore () {
		System.out.println("\nCurrent Hole stats:\nPar: " + par + "\nStrokes: " + strokes);

		if (this.strokes > this.par) {
			System.out.println(this.strokes - this.par + " over par");
			
		} else if (this.strokes < this.par) {
			System.out.println(this.par - this.strokes + " under par");
			
		} else {
			System.out.println("Made par");
		}
	}

}
