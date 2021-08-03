package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class FollowPolymorph extends Polymorph{

	FollowPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void mouseUpdate(int x, int y) {
		super.setX(x);
		super.setY(y);
	}
	
}
