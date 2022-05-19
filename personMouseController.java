package application;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class personMouseController extends JFrame implements KeyListener  {
	JLabel label;
	ImageIcon iconup,icondown,iconleft,iconright;
	
	personMouseController() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setBounds(getMaximizedBounds());
		this.addKeyListener(this);
		
		
		iconup = new ImageIcon("up.png");
		icondown = new ImageIcon("down.png");
		iconleft = new ImageIcon("left.png");
		iconright = new ImageIcon("right.png");
		
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(icondown);
		
		this.add(label);
		
		this.setVisible(true);
		
		;
		
		
		
		
		
	}
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 38:
			label.setIcon(iconup);
			label.setLocation(label.getX(),label.getY()-10);
			break;
		case 40:
			label.setIcon(icondown);
			label.setLocation(label.getX(),label.getY()+10);
			
			break;
		case 37:
			label.setIcon(iconleft);
			label.setLocation(label.getX()-10,label.getY());
			
			break;
		case 39:
			label.setIcon(iconright);
			label.setLocation(label.getX()+10,label.getY());
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
