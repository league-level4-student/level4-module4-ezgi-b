package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    private ArrayList<Polymorph> polies;
    
    public static void main(String[] args) {
   	 	new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 	window = new JFrame("IT'S MORPHIN' TIME!");
   	 	window.add(this);
   	 	window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 	window.pack();
   	 	window.setVisible(true);
   	 	polies = new ArrayList<Polymorph>();
   	 	for(int i = 0; i < 3; i++) {
   	 		polies.add(new RedPolymorph((int)(Math.random() * 400) + 20, (int)(Math.random() * 400) + 20, (int)(Math.random() * 40) + 20, (int)(Math.random() * 40) + 20));
   	 		polies.add(new BluePolymorph((int)(Math.random() * 400) + 20, (int)(Math.random() * 400) + 20, (int)(Math.random() * 40) + 20, (int)(Math.random() * 40) + 20));
   	 		polies.add(new MovingMorph((int)(Math.random() * 400) + 20, (int)(Math.random() * 400) + 20, (int)(Math.random() * 40) + 20, (int)(Math.random() * 40) + 20));
   	 	}
   	 	
   	 polies.add(new CirclePolymorph(300, 300, 50, 50));
   	 	
   	 
   	 	timer = new Timer(1000 / 30, this);
   	 	timer.start();
    }
    
    public void paintComponent(Graphics g){
    	//draw background
   	 	g.setColor(Color.LIGHT_GRAY);
   	 	g.fillRect(0, 0, 500, 500);
   	
   	 	//draw polymorph
   	 	for(Polymorph poly: polies) {
   	 		poly.draw(g);
   	 	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	repaint();
    	for(Polymorph poly: polies) {
   	 		poly.update();
   	 	}
    }
}
