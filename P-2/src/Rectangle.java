import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	private int index = 0;
	private int random = 0;
	
	public Rectangle(int x, int y, int width, int height, Color color, int index) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		this.index = index;
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}
	
	public void setColorBLACK() {
		this.color = Color.BLACK;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getRandom() {
		return random;
	}
	
	public void setRandom(int i){
		this.random = i;
	}
	public void draw_rectangle(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
	
}
