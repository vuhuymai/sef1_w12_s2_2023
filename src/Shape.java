import java.awt.Graphics;


public abstract class Shape {

	private double x;
	private double y;

	protected Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw(Graphics g);

	public abstract void move(int x, int y);

}