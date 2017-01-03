package breakout;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
public class Sprite {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected Image image;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void getImageDimensions(){
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	protected void loadImage(String imagePath){
		ImageIcon ii = new ImageIcon(imagePath);
		image = ii.getImage();
	}
	Image getImage() {
		return image;
	}
	Rectangle getRect() {
		return new Rectangle(x, y, width, height);
	}
}