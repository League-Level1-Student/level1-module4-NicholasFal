package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random();
	int molePlacement; 
	Dimension dim = new Dimension(90, 50);
	GridLayout layout = new GridLayout(8, 3);
	JButton button;
	int molesMissed = 0;
	int molesHit = 0;
			//3 by 8
				void run() {
					frame.add(panel);
					panel.setLayout(layout);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
					frame.setSize(300, 500);
					molePlacement = rand.nextInt(24);
					for(int buttons = 0; buttons < 24; buttons ++) {
						JButton button = new JButton();
						button.addActionListener(this);
						panel.add(button);
						if(buttons == molePlacement) {
							button.setText("Mole!");
						}
						
					}

		}
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					if(arg0.getSource().getText().equalsIgnoreCase("Mole!")) {
						molesHit++;
					} else {
						molesMissed++;
						JOptionPane.showMessageDialog(null, "You missed the mole.");
					}
				}

}

