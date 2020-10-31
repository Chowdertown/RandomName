package NameGen;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * CenterPanel extends JPanel and this class is responsible for the creation 
 * of the panel that displays a welcome message and the name generated 
 * by program
 * 
 * @author Oladotun Oladimejij 
 *
 */
public class CenterPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message= " Welcome to Random Name Generator! \n";
	private JLabel name = new JLabel("  Name: ");
	private JLabel prompt = new JLabel(message);
	private static Font font = new Font("Arial", Font.BOLD, 20);
	/**
	 * Creates the panel that displays the game and its events
	 * and takes place at the center of the frame. It utilizes a GridLayout 
	 * manager that takes in the size of 2x1
	 * It first adds the prompt then the name.
	 * 
	 * @param RandonNumGenerator
	 * 
	 */
	public CenterPanel(NameGenerator gen) {
		
		setLayout(new GridLayout(2, 1));
		prompt.setFont(font);
		font = new Font("Arial", Font.BOLD, 30);
		name.setFont(font);
		add(prompt);
		add(name);
		
		Timer timer = new Timer(500, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("  Name: " + NameGenerator.getName());
			}
		});
		timer.start();
	}
	
}
