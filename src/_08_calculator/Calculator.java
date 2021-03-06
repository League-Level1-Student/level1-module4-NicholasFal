package _08_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	JLabel result = new JLabel();
	JTextField first = new JTextField(10);
	JTextField second = new JTextField(10);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(first);
		panel.add(second);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(result);
		add.setText("+");
		subtract.setText("-");
		multiply.setText("x");
		divide.setText("÷");
		add.addMouseListener(this);
		subtract.addMouseListener(this);
		multiply.addMouseListener(this);
		divide.addMouseListener(this);
		frame.setSize(275, 125);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent yes) {
		// TODO Auto-generated method stub
		double firstInt = Double.parseDouble(first.getText());
		double secondInt = Double.parseDouble(second.getText());
		double resultInt;
		String resultString;
		if(yes.getSource() == add) {
		resultInt = firstInt + secondInt;
		resultString = Double.toString(resultInt);
		result.setText(resultString);
		} else if(yes.getSource() == subtract) {
			resultInt = firstInt - secondInt;
			resultString = Double.toString(resultInt);
			result.setText(resultString);
		} else if(yes.getSource() == multiply) {
			resultInt = firstInt * secondInt;
			resultString = Double.toString(resultInt);
			result.setText(resultString);
		} else if(yes.getSource() == divide) {
			resultInt = firstInt / secondInt;
			resultString = Double.toString(resultInt);
			result.setText(resultString);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
