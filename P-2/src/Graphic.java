import java.util.*;
import java.awt.Graphics; // Abstract Graphics Class: need this always to work with graphics 
import java.awt.Point; // Supports x-y plane to indicate a location
import java.awt.event.MouseAdapter; // Receives mouse events (movements like clicks)
import java.awt.event.MouseEvent; // Receives mouse events like curving
import java.awt.event.MouseMotionAdapter; // Receives mouse motion events
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame; 
import javax.swing.JPanel;
/**
 * Graphic Class
 */

@SuppressWarnings("unused")
public class Graphic extends JPanel{
	
	JFrame window;
	
	public Graphic() {
		
		window = new JFrame("Board");
		
		//CirclePanel circle = new CirclePanel();
		//RectanglePanel rectangle = new RectanglePanel();
		Panel p = new Panel();
		// layer that is used to hold objects is called "content pane"
		window.setContentPane(p);
		
		// Create a mouse listener (= new Click(circle)) to the component "circle"
		// Every time I click, this code is executed by re-drawing everything 
		p.addMouseListener(new Click(p)); 
		
		window.getContentPane().setBackground(Color.LIGHT_GRAY);
		window.setSize(600, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}	
}
