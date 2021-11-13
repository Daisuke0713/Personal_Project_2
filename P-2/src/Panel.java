import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;

public class Panel extends JPanel{
	
	// private List<Circle> circles = new LinkedList<Circle>();
	private List<Rectangle> rectangles = new LinkedList<Rectangle>();
	Random rand = new Random();
	int sum = 0;
	
	public Panel() {
		super();
		
		ArrayList<Integer> randoms = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			randoms.add(i);
		}
		int random = -1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 2; j++) {
				Rectangle r = new Rectangle(55 + i * 100, 65 + j * 140, 80, 100, Color.PINK, 2*i + j);
				while(!randoms.contains(random)) {
					random = rand.nextInt(10) + 1;
				}
				randoms.remove(randoms.indexOf(random));
				r.setRandom(random);
				rectangles.add(r);
			}
		}
	}

	public List<Rectangle> getRectangles() {
		return rectangles;
	}

	public void add_shapes(Circle c, Rectangle r) {
		// circles.add(c);
		rectangles.add(r);
		this.repaint();
	}
	
	public void remove_shapes(Rectangle r) {
		if(rectangles.isEmpty()) {
			return;
		}
		rectangles.remove(rectangles.indexOf(r));
		this.repaint();
	}
	
	public void change_shapes(Rectangle r) {
		if(rectangles.isEmpty()) {
			return;
		}
		r.setColorBLACK();
		this.repaint();
	}
	
	public void CLEAR() {
		for(int i = 0; i < 10; i++) {	
			if(rectangles.get(i).getColor() == Color.BLACK) {
				sum += rectangles.get(i).getRandom();
			}
		}
		rectangles.clear();
		this.repaint();
	}
	
	public void RESULT(Graphics g, int sum) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.RED);
		Font f = new Font ("Courier New", 1, 40);
		g2.setFont(f);
		if(30 <= sum && sum <= 40) {
			g2.drawString("YOU WIN: 30 <= " + String.valueOf(sum) + " <= 40", 20, 200);
		} else if(40 < sum) {
			g2.drawString("YOU LOSE: 40 < " + String.valueOf(sum), 120, 200);
		} else {
			g2.drawString("YOU LOSE: " + String.valueOf(sum) + " < 30", 120, 200);
		}
	}
	
	public void PRESS(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.ORANGE);
		g2.fillRect(240, 360, 110, 60);
		g2.setColor(Color.BLACK);
		Font f = new Font ("Courier New", 1, 28);
		g2.setFont(f);
		g2.drawString("DONE", 260, 398);
	}
	
	public void paint(Graphics g) {
		
		PRESS(g);
		
		for(Rectangle r : rectangles) {
			// circles.get(i).draw_circle(g);
			r.draw_rectangle(g);
		}
		
		if(rectangles.isEmpty()) {
			RESULT(g, sum);
			return;
		}	
		sum = 0;
	}
}
