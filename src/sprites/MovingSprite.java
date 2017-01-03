package sprites;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingSprite extends JFrame {
	
	public MovingSprite() {
		
		initUI();
	}
	
	private void initUI() {
		
		add(new Board());
		
		setSize(400, 300);
		
		setResizable(false);
		
		setTitle("Moving sprite");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main (String[] args){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run(){
				
				MovingSprite ex = new MovingSprite();
				ex.setVisible(true);
			}
		});
	}

}
