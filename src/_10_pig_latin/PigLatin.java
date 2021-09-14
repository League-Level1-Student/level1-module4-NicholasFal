package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {
	
	public void run() {
		JTextField english = new JTextField(10);
		JTextField pigLatin = new JTextField(10);
		JButton convert = new JButton();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(english);
		panel.add(convert);
		panel.add(pigLatin);
	}
}
