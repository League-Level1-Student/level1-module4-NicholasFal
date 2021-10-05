package _12_slot_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
	void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.add(panel);
		panel.add(button);
		button.setText("Spin");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
}
