package templateDesignPattern;

/**
 * Driver for Worker and children Firefighter, Policeman, Postman, and HandyMan
 * Creates array of workers, casts each of them to different child class
 * Calls DailyRoutine() on each instantiated child class.
 * @author portiaportia
 */
public class TemplateDriver {

	public static void main(String[] args) {
		System.out.println("**** Let's work! ****");
		
		Worker[] workers = new Worker[4];
		
		workers[0] = new FireFighter("Ted");
		workers[1] = new Policeman("Sandy");
		workers[2] = new Postman("Casey");
		workers[3] = new Handyman("Tim");
		
		System.out.println();
		
		//loop through the houses and build them.
		for(int i=0; i < workers.length; i++) {
			workers[i].dailyRoutine();
			System.out.println();
		}
	}
}
