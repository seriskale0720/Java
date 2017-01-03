package breakout;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

public class Board extends JPanel implements Commons {
	
	private Timer timer;
	private String message = "Game Over";
	private Ball ball;
	private Paddle paddle;
	private Brick bricks[];
	private boolean ingame = true;
	
	public Board() {
		initBoard();
	}
	
	private void initBOard() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		bricks = new Brick[N_OF_BRICKS];
		setDoubleBuffered(true);
		timer = new Timer();
		timer.scheduleAtFixedRate(new ScheduleTask(), DELAY, PERIOD);
	}
	@Override
	public void addNotify() {
		super.addNotify();
		gameInit();
	}
	private void gameInit(){
		ball = new Ball();
		paddle = new Paddle();
		
		int k= 0;
		for (int i = 0; i < 5; i++){
			for (int j = 0; j <6; j++) {
				bricks[k] = new Brick(j*40+30, i*10+50);
				k++;
			}
		}
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_RENDER_QUALITY);
		if (ingame){
			drawObjects(g2d);
		} else {
			gameFinished(g2d);
		}
		Toolkit.getDefaultToolkit().sync();
	}
	private void drawObjects(Graphics2D g2d){
		g2d.drawImage(ball.getImage(),ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight(), this);
		
	}

}
