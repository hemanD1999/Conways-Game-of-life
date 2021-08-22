import java.awt.EventQueue;

import javax.swing.WindowConstants;

public class mainGame {

	public static void main(String[] args) throws InterruptedException {
		gofFrame1 frame = new gofFrame1();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Thread.sleep(3400);
		frame.dispose();
		
		gofFrame3 info = new gofFrame3();
		info.setAlwaysOnTop(true);
		info.setLocationRelativeTo(null);
		info.setVisible(true);
		info.setResizable(false);
		info.setAlwaysOnTop(true);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gofFrame2_1 frame2 = new gofFrame2_1();
					frame2.setLocationRelativeTo(null);
					frame2.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
