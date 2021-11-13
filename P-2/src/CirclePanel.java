import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

public class CirclePanel extends JPanel {
	
	private List<Circle> circles = new LinkedList<Circle>();
	
	public void add_circle(Circle circle) {
		// System.out.println("CirclePanel: add_circle");
		circles.add(circle);
		this.repaint();
	}
	
	// this "built-in" function is called when ever the state of the panel has
	// been changed; we do it by calling repaint();
	@Override
	public void paint(Graphics g) {
		//System.out.println("------CP:paint-------");
		for(Circle c : circles) {
			// System.out.println(c.getX());
			c.draw_circle(g);
		}
		//System.out.println("---------------------");
	}
}