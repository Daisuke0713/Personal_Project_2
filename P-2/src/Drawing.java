import java.awt.Graphics; // Abstract Graphics Class: need this always to work with graphics 
import java.awt.Point; // Supports x-y plane to indicate a location
import java.awt.event.MouseAdapter; // Receives mouse events (movements like clicks)
import java.awt.event.MouseEvent; // Receives mouse events like curving
import java.awt.event.MouseMotionAdapter; // Receives mouse motion events
import java.awt.Color;

// import javax.swing.ImageIcon;
// import javax.swing.JFrame; 
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Drawing extends JPanel {
	
	private Point last_point;
	
	public Drawing() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				last_point = new Point(e.getX(), e.getY());
				System.out.println(e.getX() + ": " + e.getY());
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Graphics g = getGraphics();
				g.drawLine(last_point.x, last_point.y, e.getX(), e.getY());
				g.dispose();
			}
		});
	}
}