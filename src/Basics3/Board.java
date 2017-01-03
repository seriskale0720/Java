package Basics3;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {
	
	private Image something;
	
	public Board() {
		initBoard();
	}
	
	private void initBoard() {
		
		loadImage();
		
		int w = something.getWidth(this);
		int h = something.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}
	
	private void loadImage() {
		
		ImageIcon ii = new ImageIcon("Image/Image1.jpg");
		something = ii.getImage();
	}
	@Override
	public void paintComponent (Graphics g) {
		g.drawImage(something, 0, 0, null);
	}

}
