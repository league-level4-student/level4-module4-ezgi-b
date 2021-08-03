package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	private int centerX;
	private int centerY;
	private int degrees = 0;
	private static final int RADIUS = 60;
	public CirclePolymorph(int x, int y, int width, int height) {
		super(x + RADIUS, y, width, height);
		centerX = x;
		centerY = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		degrees += 2;
		setX((int)(RADIUS * Math.cos(Math.toRadians(degrees))) + centerX);
		setY((int)(RADIUS * Math.sin(Math.toRadians(degrees))) + centerY);
		
	}

}
