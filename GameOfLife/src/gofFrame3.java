import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class gofFrame3 extends JFrame {
	private JPanel panel;
	public JScrollPane scrollPane1;
	
	public gofFrame3() {
		setSize(new Dimension(780,600));
		setTitle("Corway's Game Of Life -Help");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA Projects Eclipse\\Projects\\GameOfLife-1\\src\\logo.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panel = new JPanel();
		setContentPane(panel);
		panel.setLayout(null);
		
		scrollPane1 = new JScrollPane();
		scrollPane1.setLocation(7, 7);
		scrollPane1.setSize(new Dimension(762, 553));
		panel.add(scrollPane1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setSize(new Dimension(732, 2000));
		panel_1.setPreferredSize(new Dimension(732, 2000));
		panel_1.setBackground(new Color(240, 248, 255));
		scrollPane1.setViewportView(panel_1);
		scrollPane1.getVerticalScrollBar().setValue(0);
		
		JLabel label_4 = new JLabel("John Horton Conway");
		label_4.setForeground(new Color(220, 20, 60));
		label_4.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_4.setBounds(392, 84, 202, 25);
		panel_1.add(label_4);
		
		JLabel label = new JLabel("4.");
		label.setForeground(new Color(220, 20, 60));
		label.setFont(new Font("MV Boli", Font.BOLD, 18));
		label.setBounds(24, 583, 29, 25);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("3.");
		label_1.setForeground(new Color(220, 20, 60));
		label_1.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_1.setBounds(24, 523, 29, 25);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("2.");
		label_2.setForeground(new Color(220, 20, 60));
		label_2.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_2.setBounds(24, 463, 29, 25);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("1.");
		label_3.setForeground(new Color(220, 20, 60));
		label_3.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_3.setBounds(24, 403, 16, 25);
		panel_1.add(label_3);
		
		JLabel label_5 = new JLabel("Percentage");
		label_5.setForeground(new Color(220, 20, 60));
		label_5.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_5.setBounds(531, 1032, 220, 25);
		panel_1.add(label_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setText("The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970.\r\n\r\nThe game is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves, or, for advanced players, by creating patterns with particular properties.");
		textArea.setLineWrap(true);
		textArea.setForeground(new Color(0, 0, 205));
		textArea.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea.setEditable(false);
		textArea.setBackground(new Color(240, 248, 255));
		textArea.setBounds(22, 51, 698, 244);
		panel_1.add(textArea);
		
		JLabel label_7 = new JLabel("Rules...");
		label_7.setOpaque(true);
		label_7.setFont(new Font("Unispace", Font.BOLD | Font.ITALIC, 20));
		label_7.setBackground(new Color(0, 191, 255));
		label_7.setBounds(12, 360, 96, 25);
		panel_1.add(label_7);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setText("1. Any live cell with fewer than two live neighbors dies, as if by underpopulation.\r\n2. Any live cell with two or three live neighbors lives on to the next generation.\r\n3. Any live cell with more than three live neighbors dies, as if by overpopulation.\r\n4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.");
		textArea_1.setLineWrap(true);
		textArea_1.setForeground(new Color(0, 0, 205));
		textArea_1.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_1.setEditable(false);
		textArea_1.setBackground(new Color(240, 248, 255));
		textArea_1.setBounds(24, 400, 698, 244);
		panel_1.add(textArea_1);
		
		JLabel label_8 = new JLabel("Functions in game...");
		label_8.setOpaque(true);
		label_8.setFont(new Font("Unispace", Font.BOLD | Font.ITALIC, 20));
		label_8.setBackground(new Color(0, 191, 255));
		label_8.setBounds(12, 698, 247, 25);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("1. Generations/Second");
		label_9.setForeground(new Color(220, 20, 60));
		label_9.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_9.setBounds(22, 736, 230, 25);
		panel_1.add(label_9);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setText("Sets number of generation simulations to run in one second.");
		textArea_2.setLineWrap(true);
		textArea_2.setForeground(new Color(0, 0, 205));
		textArea_2.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_2.setEditable(false);
		textArea_2.setBackground(new Color(240, 248, 255));
		textArea_2.setBounds(32, 774, 688, 34);
		panel_1.add(textArea_2);
		
		JLabel label_10 = new JLabel("2. Cell Size");
		label_10.setForeground(new Color(220, 20, 60));
		label_10.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_10.setBounds(22, 821, 202, 25);
		panel_1.add(label_10);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setWrapStyleWord(true);
		textArea_3.setText("Sets the size of each cell. (side length is in pixels)");
		textArea_3.setLineWrap(true);
		textArea_3.setForeground(new Color(0, 0, 205));
		textArea_3.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_3.setEditable(false);
		textArea_3.setBackground(new Color(240, 248, 255));
		textArea_3.setBounds(32, 859, 688, 34);
		panel_1.add(textArea_3);
		
		JLabel label_11 = new JLabel("3. Cell Color");
		label_11.setForeground(new Color(220, 20, 60));
		label_11.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_11.setBounds(22, 906, 202, 25);
		panel_1.add(label_11);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setWrapStyleWord(true);
		textArea_4.setText("Sets the color of cell.");
		textArea_4.setLineWrap(true);
		textArea_4.setForeground(new Color(0, 0, 205));
		textArea_4.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_4.setEditable(false);
		textArea_4.setBackground(new Color(240, 248, 255));
		textArea_4.setBounds(32, 944, 688, 34);
		panel_1.add(textArea_4);
		
		JLabel label_12 = new JLabel("4. Autofill");
		label_12.setForeground(new Color(220, 20, 60));
		label_12.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_12.setBounds(22, 991, 202, 25);
		panel_1.add(label_12);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setWrapStyleWord(true);
		textArea_5.setText("When this option is selected, a new dropdown list Percentage appears which randomly fills selected percentage of grid.");
		textArea_5.setLineWrap(true);
		textArea_5.setForeground(new Color(0, 0, 205));
		textArea_5.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_5.setEditable(false);
		textArea_5.setBackground(new Color(240, 248, 255));
		textArea_5.setBounds(32, 1029, 688, 70);
		panel_1.add(textArea_5);
		
		JLabel label_13 = new JLabel("Giving input...");
		label_13.setForeground(new Color(220, 20, 60));
		label_13.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_13.setBounds(22, 1102, 202, 25);
		panel_1.add(label_13);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setWrapStyleWord(true);
		textArea_6.setText("When the left mouse button is clicked or dragged in the cell grid, the cell state changes fron dead to alive i.e,. the cells change color from \"Grid color\" to \"Cell color\".\r\n\r\nWhen the right mouse button is clicked or dragged, its the opposite.");
		textArea_6.setLineWrap(true);
		textArea_6.setForeground(new Color(0, 0, 205));
		textArea_6.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_6.setEditable(false);
		textArea_6.setBackground(new Color(240, 248, 255));
		textArea_6.setBounds(32, 1140, 688, 170);
		panel_1.add(textArea_6);
		
		JLabel label_14 = new JLabel("5. START button");
		label_14.setForeground(new Color(220, 20, 60));
		label_14.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_14.setBounds(22, 1323, 202, 25);
		panel_1.add(label_14);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setWrapStyleWord(true);
		textArea_7.setText("It starts the simulation and changes into STOP button.\r\n\r\nIf the STOP button button is pressed, it stops the simulation and the button changes to START again.");
		textArea_7.setLineWrap(true);
		textArea_7.setForeground(new Color(0, 0, 205));
		textArea_7.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_7.setEditable(false);
		textArea_7.setBackground(new Color(240, 248, 255));
		textArea_7.setBounds(32, 1361, 688, 130);
		panel_1.add(textArea_7);
		
		JLabel label_15 = new JLabel("5. RESET button");
		label_15.setForeground(new Color(220, 20, 60));
		label_15.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_15.setBounds(22, 1504, 202, 25);
		panel_1.add(label_15);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setWrapStyleWord(true);
		textArea_8.setText("It stops the simulation and clears the grid.");
		textArea_8.setLineWrap(true);
		textArea_8.setForeground(new Color(0, 0, 205));
		textArea_8.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_8.setEditable(false);
		textArea_8.setBackground(new Color(240, 248, 255));
		textArea_8.setBounds(32, 1542, 688, 31);
		panel_1.add(textArea_8);
		
		JLabel label_16 = new JLabel("5. Shapes");
		label_16.setForeground(new Color(220, 20, 60));
		label_16.setFont(new Font("MV Boli", Font.BOLD, 18));
		label_16.setBounds(22, 1586, 202, 25);
		panel_1.add(label_16);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setWrapStyleWord(true);
		textArea_9.setText("It allows you to add the common shapes to your grid.\r\n\r\nSelect the item/shape and click on the grid where you want to add the shape.\r\n\r\nTo stop adding the shapes, select \"-None-\" option from shapes list.");
		textArea_9.setLineWrap(true);
		textArea_9.setForeground(new Color(0, 0, 205));
		textArea_9.setFont(new Font("MV Boli", Font.BOLD, 18));
		textArea_9.setEditable(false);
		textArea_9.setBackground(new Color(240, 248, 255));
		textArea_9.setBounds(32, 1624, 688, 183);
		panel_1.add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setWrapStyleWord(true);
		textArea_10.setText("I hope this introduction will help in simulation.\r\n\r\n           Happy simulation...!");
		textArea_10.setLineWrap(true);
		textArea_10.setForeground(new Color(220, 20, 60));
		textArea_10.setFont(new Font("MV Boli", Font.BOLD, 20));
		textArea_10.setEditable(false);
		textArea_10.setBackground(new Color(240, 248, 255));
		textArea_10.setBounds(125, 1840, 688, 160);
		panel_1.add(textArea_10);
		
		JLabel label_6 = new JLabel("About Game...");
		label_6.setOpaque(true);
		label_6.setFont(new Font("Unispace", Font.BOLD | Font.ITALIC, 20));
		label_6.setBackground(new Color(0, 191, 255));
		label_6.setBounds(12, 13, 156, 25);
		panel_1.add(label_6);
		revalidate();
	}
	
	public void top() {
		this.setAlwaysOnTop(isDisplayable());
	}
}
