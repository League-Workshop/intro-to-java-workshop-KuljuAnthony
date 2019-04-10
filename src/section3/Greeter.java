package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("You'r A nerd.");
	JOptionPane.showMessageDialog(null, "And that's Toooo true"+ name);
}
}


