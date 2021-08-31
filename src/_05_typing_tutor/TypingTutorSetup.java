package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutorSetup implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
    Random r = new Random();
	void setup(){
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	char generateRandomLetter() {
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("You pressed: " + arg0.getKeyChar());
		if(arg0.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.green);
		} else {
			System.out.println("Incorrect");
			panel.setBackground(Color.red);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
