/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class Exercise2 {

	public static void main(String[] args) {
		
		String stringAge = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(stringAge);
		
		JOptionPane.showMessageDialog(null, "You were born in the year " + (2016 - age) + ".");
		
		if (age > 30) {
			JOptionPane.showMessageDialog(null, "You're tooo old to play this game.");
		}
		
	}
	
}

