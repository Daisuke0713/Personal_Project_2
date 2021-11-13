import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	
	private int x;
	private int y;
	private int r;
	private Color color;
	
	// Source -> Generate constructor
	public Circle(int x, int y, int r, Color color) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public Color getColor() {
		return color;
	}
	
	public void draw_circle(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 2*r, 2*r);
	}
}
