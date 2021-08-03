package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class ClickPolymorph extends Polymorph{
	public ClickPolymorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void mouseClickUpdate(int x, int y) {
		if(x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight()) {
			JOptionPane.showMessageDialog(null, "You have clicked on this ClickPolymorph!!!");
		}
	}
}
