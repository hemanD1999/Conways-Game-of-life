import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;



public class gofFrame2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private boolean prevState[][] = new boolean[59][124];
	private boolean nextState[][] = new boolean[59][124];
	private JButton cell[][] = new JButton[59][124];
//	private int global = 1;
	
	public gofFrame2() {
		super("Conway's Game Of Life");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1276, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1240, 590);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(59, 124, 0, 0));
		
		
		for(int i = 0 ; i<59 ; i++) {
			for(int j = 0 ; j<124 ; j++) {
				cell[i][j] = new JButton();
				cell[i][j].setBackground(Color.white);
				cell[i][j].addActionListener(this);
				panel.add(cell[i][j]);
				prevState[i][j] = false;
				nextState[i][j] = false;
			}
		}
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(10, 610, 1240, 62);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.setForeground(Color.BLACK);
		btnStart.setBackground(Color.white);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		btnStart.setBounds(10, 10, 100, 42);
		panel_1.add(btnStart);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(Color.BLACK);
		btnReset.setBackground(Color.white);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0 ; i<59 ; i++) {
					for(int j=0 ; j<124 ; j++) {
						prevState[i][j] = false;
						nextState[i][j] = false;
						cell[i][j].setBackground(Color.white);
						//global = 1;
					}
				}
			}
		});
		btnReset.setBounds(1130, 10, 100, 42);
		panel_1.add(btnReset);
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton test;
		int q, w;
		test = (JButton)e.getSource();
		q = test.getY();
		w = test.getX();
		q = q/10;
		w = w/10;
		//System.out.println(test.getX() + " " + test.getY());
		if(test.getBackground() == Color.white) {
			test.setBackground(Color.black);
			prevState[q][w] = true;
		}
		else {
			test.setBackground(Color.white);
			prevState[q][w] = false;
		}
		
	}
	
	public void go() {
		//prevState = new boolean[59][124];
		//nextState = new boolean[59][124];
		int i,j;
		int count = 0;
		//while(global!=0) {
		/*	for(i=0;i<59;i++) {
				for(j=0;j<124;j++) {
					if(cell[i][j].getBackground()==Color.black) {
						prevState[i][j] = true;
					}
					else {
						prevState[i][j] = false;
					}
				}
			}*/
		//}
		
		for(i=0;i<59;i++) {
			for(j=0;j<124;j++) {
				count = liveNeighbors(i, j);
				//System.out.println(count + " " + i + " " + j);
				if(count < 2 || count >3) {nextState[i][j] = false;}
				else if(count == 3) {nextState[i][j] = true;}
				else if(count == 2) {
					if(prevState[i][j]) {nextState[i][j] = true;}
					else {nextState[i][j] = false;}
				}
				count = 0;
			}
		}
		
		for(i=0 ; i<59 ; i++) {
			for(j=0 ; j<124 ; j++) {
				if(nextState[i][j]) {
					cell[i][j].setBackground(Color.black);
				}
				else {
					cell[i][j].setBackground(Color.white);
				}
			}
		}
		
		for(i=0 ; i<59 ; i++) {
			for(j=0 ; j<124 ; j++) {
				prevState[i][j] = nextState[i][j];
				nextState[i][j] = false;
			}
		}
		
		
	}
	
	public int liveNeighbors(int i, int j) {
		int count=0;
		if(i==0 && j==0) {
			count = 0;
			if(prevState[0][1]) {count++;}
			if(prevState[1][0]) {count++;}
			if(prevState[1][1]) {count++;}
			return count;
		}
		else if(i==58 && j==0) {
			count = 0;
			if(prevState[57][0]) {count++;}
			if(prevState[57][1]) {count++;}
			if(prevState[58][1]) {count++;}
			return count;
		}
		else if(i==0 && j==123) {
			count = 0;
			if(prevState[0][122]) {count++;}
			if(prevState[1][122]) {count++;}
			if(prevState[1][123]) {count++;}
			return count;
		}
		else if(i==58 && j==123) {
			count = 0;
			if(prevState[57][122]) {count++;}
			if(prevState[57][123]) {count++;}
			if(prevState[58][122]) {count++;}
			return count;
		}
		
		else if(i==0 && (j>0 && j<123)) {
			count = 0;
			if(prevState[i][j-1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i+1][j-1]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i+1][j+1]) {count++;}
			return count;
		}
		else if(i==58 && (j>0 && j<123)) {
			count = 0;
			if(prevState[i][j-1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i-1][j-1]) {count++;}
			if(prevState[i-1][j]) {count++;}
			if(prevState[i-1][j+1]) {count++;}
			return count;
		}
		else if(j==0 && (i>0 && i<58)) {
			count = 0;
			if(prevState[i-1][j]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i-1][j+1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i+1][j+1]) {count++;}
			return count;
		}
		else if(j==123 && (i>0 && i<58)) {
			count = 0;
			if(prevState[i-1][j]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i-1][j-1]) {count++;}
			if(prevState[i][j-1]) {count++;}
			if(prevState[i+1][j-1]) {count++;}
			return count;
		}
		else if((i<58 && i>0) && (j>0 && j<123)) {
			count = 0;
			if(prevState[i-1][j-1]) {count++;}
			if(prevState[i-1][j]) {count++;}
			if(prevState[i-1][j+1]) {count++;}
			if(prevState[i][j-1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i+1][j-1]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i+1][j+1]) {count++;}
			return count;
		}
		return count;
	}
}
