package animation;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ThreadExample extends JFrame {
	
	public ThreadExample(){
		initUI();
	}
	
	private void initUI(){
		add(new Board());
		setResizable(false);
		pack();
		setTitle("Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable(){
			
			@Override
			public void run() {
				ThreadExample ex = new ThreadExample();
				ex.setVisible(true);
			}
		});
	}

}
