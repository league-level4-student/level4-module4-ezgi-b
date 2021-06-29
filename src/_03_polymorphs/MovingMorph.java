package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	private int moved;
	private int sign;
	MovingMorph(int x, int y, int width, int height){
		super(x, y, width, height);
		moved = 0;
		sign = -1;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		if(moved > 30) {
			sign*=-1;
			moved = 0;
		}
		int moveX = (int)(Math.random() * 6) - 2;
		int moveY = (int)(Math.random() * 7) - 2;
		moved += moveX + moveY;
		setX(getX() + (sign*moveX));
		setY(getY() + (sign*moveY));
	}
}
