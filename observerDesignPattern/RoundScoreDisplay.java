package observerDesignPattern;

public class RoundScoreDisplay implements Observer {

	private Subject golfer;
	
	private int strokesTotal, parTotal;
	
	public RoundScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		golfer.registerObserver(this);
		this.strokesTotal = this.parTotal = 0;
	}
	
	public void update (int strokes, int par) {
		this.strokesTotal += strokes;
		this.parTotal += par;
		displayRoundScore();
	}
	
	private void displayRoundScore () {
		System.out.println("\nRound stats:\nPar: " + parTotal + "\nStrokes: " + strokesTotal);

		if (this.strokesTotal > this.parTotal) {
			System.out.println(this.strokesTotal - this.parTotal + " over par");
			
		} else if (this.strokesTotal < this.parTotal) {
			System.out.println(this.parTotal - this.strokesTotal + " under par");
			
		} else {
			System.out.println("Making par");
		}
	}

}
