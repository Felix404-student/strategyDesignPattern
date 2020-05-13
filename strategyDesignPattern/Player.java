package strategyDesignPattern;

public abstract class Player {

	protected String name;
	
	private boolean defence;

	protected OffenceBehavior offenceBehavior;
	
	protected DefenceBehavior defenceBehavior;
	
	public Player () {
		this.name = "null";
		this.defence = false;
	}
	
	public Player (String name) {
		this.name = name;
		this.defence = false;
	}
	
	public String toString () {
		return this.name;
	}
	
	public boolean isDefence() {
		return defence;
	}
	
    public abstract void setDefenceBehavior ();
    
	public abstract void setOffenceBehavior ();
	
	public abstract String play ();
	
	public void turnover () {
		if (this.defence) {
			this.defence = false;
		} else {
			this.defence = true;
		}
	}

}
