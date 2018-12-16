
public class LoadedDie extends Die {

	private double loadedRoll;
	
	public LoadedDie (int sides, double roll, double lroll) {
		super (sides, roll);
		setLoadedRoll(lroll);
	}
	
	public void setLoadedRoll(double lroll) {
		if (lroll%2 == 1) {
			loadedRoll = lroll;
		} else {
			loadedRoll = lroll + 1;
		}
	}
	
	public double getLoadedRoll() {
		return loadedRoll;
	}
	
	
	
}
