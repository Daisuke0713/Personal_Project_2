import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

public class RectanglePanel extends JPanel{
	
	private List<Rectangle> rectangles = new LinkedList<Rectangle>();
	
	public void add_rectangle(Rectangle r) {
		rectangles.add(r);
		this.repaint();
	}
	
	@Override
	public void paint(Graphics rectangle) {
		for(Rectangle r : rectangles) {
			r.draw_rectangle(rectangle);
		}
	}
}
