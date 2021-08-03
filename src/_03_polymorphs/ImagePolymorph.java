package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImagePolymorph extends Polymorph{
	private BufferedImage image;
	public ImagePolymorph(int x, int y, int w, int h, String imageName) {
		super(x, y, w, h);
		loadImage(imageName);
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}
	
	void loadImage(String imageFile) {
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		} catch (Exception e) {
	            
		}
	}
}
