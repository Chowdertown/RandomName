package NameGen;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 * This class runs the GUI for the NameGenerator class
 * @author Oladotun Oladimejij
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		NameGenerator gen = new NameGenerator();
		NameGenerator.ListNames();
		
		JFrame frame = new JFrame("Random Name Generator");
	      frame.setSize(400, 250);
	      frame.setContentPane( new MainPanel(gen));
		  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
	      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      int upperLeftCornerX = (screenSize.width - frame.getWidth()) / 2;
		  int upperLeftCornerY = (screenSize.height - frame.getHeight()) / 2;
		  frame.setLocation(upperLeftCornerX, upperLeftCornerY);
	      frame.setVisible(true);
	      
	      
	      int result = JOptionPane.showConfirmDialog(null, "Would you like to get a random Name?");
	      
	      NameGenerator.showPrompt(result, frame);
	}
	

}
