package breakout;


public class Brick extends Sprite {
	
	private boolean destroyed;
	
	public Brick (int x, int y) {
		
		this.x = x;
		this.y = y;
		
		initBrick();
	}
	
	private void initBrick(){
		loadImage("image/breakout/brickie.png");
		getImageDimensions();
		
		destroyed = false;
		
	}
	
	public boolean isDestroyed() {
		return destroyed;
	}
	
	public void setDestroyed(boolean val){
		destroyed = val;
	}

}
