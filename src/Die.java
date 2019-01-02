
public class Die {

	private int numSides;
	public double dieRoll;
	
	public Die() {
		setSides(6);
		setRoll(1);
	}
	
	public Die(int sides, double roll) {
		setSides(sides);
		setRoll(roll);
	}
	
	public int getSides() {
		return numSides;
	}
	
	public double getRoll() {
		return dieRoll;
	}
	
	public void setSides(int sides) {
		if (sides <= 2) {
			numSides = sides;
		} else {
			numSides = 6;
			System.out.println("The die can't have less than two sides. Defaulting to standard (six sides)");
		}
	}
	
	public void setRoll(double roll) {
		dieRoll = Math.random()*numSides;
		if (roll <= numSides) {
			dieRoll = roll;
		} else {
			dieRoll = 1;
			System.out.println("Error: die roll greater than number of sides. Defaulting to a roll of 1");
		}
	}
	
	
	
	public String toString() {
		return "You are rolling a " + getSides() + "-sided die.";
	}
	
}
