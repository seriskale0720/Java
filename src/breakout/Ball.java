package breakout;
public class Ball extends Sprite implements Commons {
	private int xdir;
	private int ydir;
	public Ball() {
		initBall();
	}
	private void initBall() {
		xdir = 1;
		ydir = -1;
		loadImage("image/breakout/ball.png");
		getImageDimensions();
		resetState();
	}
	public void move() {
		x += xdir;
		y += ydir;
		if (x == 0) {
			setXDir(1);
		}
		if (x == WIDTH - width) {
			setXDir(-1);
		}
		if (y == 0) {
			setYDir(1);
		}
	}
	private void resetState() {
		x = INIT_BALL_X;
		y = INIT_BALL_Y;
	}
	public void setXDir(int x){
		xdir = x;
	}
	public void setYDir(int y){
		ydir = y;
	}
	public int getYDir() {
		return ydir;
	}
}
