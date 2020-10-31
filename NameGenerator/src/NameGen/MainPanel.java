package NameGen;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * MainPanel extends JPanel and this class is responsible 
 * for getting the contents of the CenterPanel into the frame.
 * 
 * @author Oladotun Oladimejij 
 *
 */
public class MainPanel extends JPanel {
  
	private static final long serialVersionUID = 1L;

/**
    * This constructor allows the frame of the panel to be set by adding a 
    * center panel that displays the a welcome message an updated stream of 
    * the name generated.
    *
    * 
    * @param  NameGenerator
    * 
    */
	public MainPanel(NameGenerator gen) {
		setLayout(new BorderLayout());
		add(new CenterPanel(gen), BorderLayout.CENTER);
		
	}
}
