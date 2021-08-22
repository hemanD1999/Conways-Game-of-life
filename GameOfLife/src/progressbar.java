import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class progressbar extends JProgressBar {
	final int interval = 30;
	int i = 0;
	Timer t;
	
	public progressbar(){
		super(0, 100);
		setValue(0);
		t = new Timer(interval, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i==100) {
					t.stop();
				}
				else {
					i++;
					setValue(i);
				}
			}
		});
		t.start();
	}
}
