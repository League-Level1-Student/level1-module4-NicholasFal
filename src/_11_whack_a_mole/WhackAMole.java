package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame;
	JPanel panel;
	Random rand = new Random();
	int molePlacement; 
	Dimension dim = new Dimension(90, 50);
	GridLayout layout = new GridLayout(8, 3);
	JButton button;
	int molesMissed = 0;
	int molesHit = 0;
	int times = 0;
	Date startTime;
			//3 by 8
				void run() {
					if(times == 0) {
						startTime = new Date();
						times++;
					}
					frame = new JFrame();
					panel = new JPanel();
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
					JButton anotherButton = (JButton) arg0.getSource();
					if(anotherButton.getText().equalsIgnoreCase("Mole!")) {
						molesHit++;
					} else {
						molesMissed++;
						Random ran = new Random();
						int missMessage = ran.nextInt(5);
						if(missMessage == 0) {
						JOptionPane.showMessageDialog(null, "You were supposed to click the button that says mole...");
						} else if(missMessage == 1) {
							JOptionPane.showMessageDialog(null, "You did not hit the mole. Do better next time.");
						} else if(missMessage == 2) {
							JOptionPane.showMessageDialog(null, "You missed the mole. Better luck next time!");
						} else if(missMessage == 3) {
							JOptionPane.showMessageDialog(null, "You aren't very good at this game.");
						} else if(missMessage == 4) {
							JOptionPane.showMessageDialog(null, "Nice try! Click the mole next time.");
						}
					}
					if(molesHit == 10) {
						endGame(startTime, molesHit);
					} else {
						if(molesMissed == 5) {
							JOptionPane.showMessageDialog(null, "You whacked 5 moles and have lost.");
						}
					}
					frame.dispose();
					if(molesHit != 10 && molesMissed != 5) {
					run();
					}
				}
				private void endGame(Date timeAtStart, int molesWhacked) { 
				    Date timeAtEnd = new Date();
				    JOptionPane.showMessageDialog(null, "Your whack rate is "
				            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
				                  + " moles per second.");
				}
}

