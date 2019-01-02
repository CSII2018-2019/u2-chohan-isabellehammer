
public class LoadedDie extends Die {

	
	public LoadedDie (int sides, double roll) {
		super (sides, roll);
	}
	
	public void setRoll(double roll) {
		dieRoll = Math.random()* getSides ();
		if (dieRoll % 2 == 1) {
			dieRoll = dieRoll + 1;
		}
	}
	
	
	
}
