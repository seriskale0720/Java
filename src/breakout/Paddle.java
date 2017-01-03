package breakout;

import java.awt.event.KeyEvent;

public class Paddle extends Sprite implements Commons {
	
	private int dx;
	
	public Paddle() {
		initPaddle();
	}
	public void initPaddle(){
		loadImage("image/breakout/paddle.png");
		getImageDimensions();
		resetState();
	}
	public void move() {
		x+= dx;
		if (x <= 0) {
			x = 0;
		}
		if (x >= WIDTH - width) {
			x = WIDTH - width;
		}
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){
			dx = -1;
		}
		if (key == KeyEvent.VK_RIGHT){
			dx = 1;
		}
	}
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){
			dx = 0;
		}
		if (key == KeyEvent.VK_RIGHT){
			dx = 0;
		}
	}
	private void resetState() {
		x = INIT_PADDLE_X;
		y = INIT_PADDLE_Y;
	}
}
