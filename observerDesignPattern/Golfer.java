package observerDesignPattern;
import java.util.*;

public class Golfer implements Subject {

	private ArrayList<Observer> observers;
	
	private String name;
	
	public Golfer (String name) {
		this.name = name;
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver (Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver (Observer observer) {
		observers.remove(observer);
	}
	
	public void enterScore (int strokes, int par) {
		notifyObservers(strokes, par);
	}
	
	public void notifyObservers (int strokes, int par) {
		for (Observer observer : observers) {
			observer.update(strokes, par);
		}
	}
	
	public String getName () {
		return this.name;
	}
}
