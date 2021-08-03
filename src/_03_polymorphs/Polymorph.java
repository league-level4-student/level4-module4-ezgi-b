package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y, int width, int height){
   	 	this.x = x;
   	 	this.y = y;
   	 	this.width = width;
   	 	this.height = height;
    }
    
    public void update(){
   	 
    }
    
    public void mouseUpdate(int x, int y) {
    	
    }
    
    public void mouseClickUpdate(int x, int y) {
    	
    }
    
    public abstract void draw(Graphics g);
    
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
    
    public void setX(int x) {
    	this.x = x;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
}
