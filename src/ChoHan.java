import javax.swing.JOptionPane;

public class ChoHan {

	public static void main(String[] args) {
		
		Die round1a = new Die();
		round1a.setSides(6);
		round1a.setRoll(Math.random());
		Die round1b = new Die();
		round1b.setSides(6);
		round1b.setRoll(Math.random());
		LoadedDie round1z = new LoadedDie();
		round1z.setSides(6);
		round1z.setLoadedRoll(Math.random());
		LoadedDie round1y = new LoadedDie();
		round1y.setSides(6);
		round1y.setLoadedRoll(Math.random());
		
		String input = JOptionPane.showInputDialog(null, "Hello, player 1! Guess Cho (even) or Han (odd).");
		String input2 = JOptionPane.showInputDialog(null, "Hello player 2! Guess Cho (even) or Han (odd).");
		double sum = ((round1a.getRoll() || round1z.getLoadedRoll()) + (round1b.getRoll() || round1y.getLoadedRoll()));
		if (sum%2 == 0) {
			//how do I make it represent Cho without printing it?
		}
		
		if (sum%2 == 1) {
			//how do I make it represent Han without printing it?
		}
		

	}

}
