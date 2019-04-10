package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a "
				+ "piranha-infested \n river, here's how to do it...");
		// Get the user to enter an adjective
		JOptionPane.showInputDialog("Type in an Adjective.");
		// Get the user to enter a type of liquid
		JOptionPane.showInputDialog("type in a liquid.");
		// Get the user to enter a body part
		JOptionPane.showInputDialog("Type in a body part.");
		// Get the user to enter a verb
		JOptionPane.showInputDialog("Type in a verb.");
		// Get the user to enter a place
		JOptionPane.showInputDialog("Type in a place.");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more active during the day, so cross the river at \n night. Piranhas are attracted to \n fresh blood and will mostlikely \n take a bite out of your pelvis if you swim. Whateveryou do, \n if you have an open wound, try to find another \n way to getback to the river. Good luck!");

	}
}

