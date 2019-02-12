import javax.swing.JOptionPane;

public class ChoHan {

	public static void main(String[] args) {
		
		
		
		//ROUND 1 REGULAR
		
		
		Die roundA = new Die();
		roundA.setSides(6);
		roundA.setRoll(Math.random());
		Die roundB = new Die();
		roundB.setSides(6);
		roundB.setRoll(Math.random());
		
		
		double sum = (roundA.getRoll()  + roundB.getRoll());
		
		String input = JOptionPane.showInputDialog(null, "Hello, player 1! Guess Cho (even) or Han (odd).");
		String input2 = JOptionPane.showInputDialog(null, "Hello player 2! Guess Cho (even) or Han (odd).");
		
		if (sum % 2 == 0) {
			System.out.println("The sum is Cho.");
			if (input.equals("Cho")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input2.equals("Cho")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		if (sum % 2 == 1) {
			System.out.println("The sum is Han.");
			if (input.equals("Han")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input2.equals("Han")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		
		
		// ROUND 2 REGULAR
		
		
		Die round2A = new Die();
		round2A.setSides(6);
		round2A.setRoll(Math.random());
		Die round2B = new Die();
		round2B.setSides(6);
		round2B.setRoll(Math.random());
		
		double sum2 = (round2A.getRoll()  + round2B.getRoll());
		
		String input3 = JOptionPane.showInputDialog(null, "Time for round 2. Player 1, guess Cho (even) or Han (odd).");
		String input4 = JOptionPane.showInputDialog(null, "Player 2, guess Cho (even) or Han (odd).");
		
		if (sum % 2 == 0) {
			System.out.println("The sum is Cho.");
			if (input3.equals("Cho")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input4.equals("Cho")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		if (sum % 2 == 1) {
			System.out.println("The sum is Han.");
			if (input3.equals("Han")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input4.equals("Han")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		
		
		//ROUND 3 REGULAR
		
		Die round3A = new Die();
		round3A.setSides(6);
		round3A.setRoll(Math.random());
		Die round3B = new Die();
		round3B.setSides(6);
		round3B.setRoll(Math.random());
		
		double sum3 = (round3A.getRoll()  + round3B.getRoll());
		
		String input5 = JOptionPane.showInputDialog(null, "Time for round 3. Player 1, guess Cho (even) or Han (odd).");
		String input6 = JOptionPane.showInputDialog(null, "Player 2, guess Cho (even) or Han (odd).");
		
		if (sum % 2 == 0) {
			System.out.println("The sum is Cho.");
			if (input5.equals("Cho")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input6.equals("Cho")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		if (sum % 2 == 1) {
			System.out.println("The sum is Han.");
			if (input5.equals("Han")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input6.equals("Han")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		
		
		
		//ROUND 4 REGULAR
		
		Die round4A = new Die();
		round4A.setSides(6);
		round4A.setRoll(Math.random());
		Die round4B = new Die();
		round4B.setSides(6);
		round4B.setRoll(Math.random());
		
		double sum4 = (round4A.getRoll()  + round4B.getRoll());
		
		String input7 = JOptionPane.showInputDialog(null, "Time for round 4. Player 1, guess Cho (even) or Han (odd).");
		String input8 = JOptionPane.showInputDialog(null, "Player 2, guess Cho (even) or Han (odd).");
		
		if (sum % 2 == 0) {
			System.out.println("The sum is Cho.");
			if (input7.equals("Cho")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input8.equals("Cho")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		if (sum % 2 == 1) {
			System.out.println("The sum is Han.");
			if (input7.equals("Han")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input8.equals("Han")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		
		
		//ROUND 5 REGULAR
		
		Die round5A = new Die();
		round5A.setSides(6);
		round5A.setRoll(Math.random());
		Die round5B = new Die();
		round5B.setSides(6);
		round5B.setRoll(Math.random());
		
		double sum5 = (round5A.getRoll()  + round5B.getRoll());
		
		String input9 = JOptionPane.showInputDialog(null, "Time for round 5. Player 1, guess Cho (even) or Han (odd).");
		String input0 = JOptionPane.showInputDialog(null, "Player 2, guess Cho (even) or Han (odd).");
		
		if (sum % 2 == 0) {
			System.out.println("The sum is Cho.");
			if (input9.equals("Cho")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input0.equals("Cho")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		if (sum % 2 == 1) {
			System.out.println("The sum is Han.");
			if (input9.equals("Han")){
				System.out.println("Player 1 guessed correctly!");
			}
			if (input0.equals("Han")){
				System.out.println("Player 2 guessed correctly!");
			}
			else {
				System.out.println("Please enter either Cho or Han.");
			}
		}
		
		

	}

}
