package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();

	public void setup() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		trick.setText("Trick");
		treat.setText("Treat");
		trick.addActionListener(this);
		treat.addActionListener(this);
		frame.pack();
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == trick) {
		showPictureFromTheInternet("https://ih1.redbubble.net/image.422724097.5780/flat,750x,075,f-pad,750x1000,f8f8f8.u3.jpg");
		} else if(arg0.getSource() == treat) {
			showPictureFromTheInternet("https://media.gq.com/photos/5d714f7c2a02f600086df664/1:1/w_1390,h_1390,c_limit/MCDITCH_EC006.jpg");
		}
	}

}
