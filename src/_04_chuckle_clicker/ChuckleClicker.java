package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();
	void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		joke.setText("Joke");
		punchline.setText("Punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent yes) {
		// TODO Auto-generated method stub
		if(yes.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "Want to hear a construction joke?");
		} else if(yes.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "Never mind, I am still working on that one.");
		}
	}
}
