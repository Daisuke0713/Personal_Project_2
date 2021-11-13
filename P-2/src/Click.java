import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Click extends MouseAdapter {
	
	//private CirclePanel panel_c;
	//private RectanglePanel panel_r;
	private Panel p;
	
	public Click(Panel panel) {
		this.p = panel;
	}
	
	public boolean inside(int x_1, int x_2, int y_1, int y_2, int x, int y) {
		if((x >= x_1 && x <= x_2) && (y >= y_1 && y <= y_2)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		
		// if he pressed "DONE"
		if(inside(240, 350, 360, 420, x, y)) {
			p.CLEAR();
			return;
		}
		
		Rectangle rectangle = null;
		int index = -1;
		
		if(inside(55, 135, 65, 165, x, y)) {
			index = 0;
		} else if(inside(55, 135, 205, 305, x, y)) {
			index = 1;
		} else if(inside(155, 235, 65, 165, x, y)) {
			index = 2;
		} else if(inside(155, 235, 205, 305, x, y)) {
			index = 3;
		} else if(inside(255, 335, 65, 165, x, y)) {
			index = 4;
		} else if(inside(255, 335, 205, 305, x, y)) {
			index = 5;
		} else if(inside(355, 435, 65, 165, x, y)) {
			index = 6;
		} else if(inside(355, 435, 205, 305, x, y)) {
			index = 7;
		} else if(inside(455, 535, 65, 165, x, y)) {
			index = 8;
		} else if(inside(455, 535, 205, 305, x, y)) {
			index = 9;
		}
		
		for(Rectangle r : p.getRectangles()) {
			if(r.getIndex() == index) {
				rectangle = r;
			}
		}
		
		if(rectangle == null) {
			return;
		} else {
			p.change_shapes(rectangle);
		}
		
		
		//p.remove_shapes(locateShape(55, 135, 65, 165, x, y));
		//p.add_shapes(new Circle(e.getX() + 30, e.getY(), 24, Color.BLUE), 
		//		new Rectangle(e.getX(), e.getY(), 20, 30, Color.GREEN));
		//System.out.println("Click: mouseClicked");
		//panel_c.add_circle(new Circle(e.getX() + 30, e.getY(), 24, Color.BLUE));
		//panel_r.add_rectangle(new Rectangle(e.getX(), e.getY(), 20, 30, Color.GREEN));
		//System.out.println(e.getX() + ":" + e.getY());	
	}
}
