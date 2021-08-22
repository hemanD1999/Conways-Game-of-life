import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class gofFrame2_1 extends JFrame implements ComponentListener {

	private Dimension newSize;
	private JPanel contentPane;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JButton btnStart;
	private JButton btnReset;
	private JButton btnHelp;
	private JCheckBox Autofill;
	private JComboBox cellsize;
	private JComboBox gps;
	private JComboBox color;
	private JComboBox gridcolor;
	private JComboBox shape;
	private JComboBox percentage;
	
	
	private String[] generations_sec = {"Select", "1", "2", "5", "10", "15", "30", "40"};
	private String[] cell_size = {"Select", "3", "5", "10", "20", "50"};
	private String[] percent = {"0", "5", "10", "20", "40", "50", "60", "80", "90", "95", "100"};
	
	private String[] colorlistcell = {"black", "white", "red", "orange", "green", "blue", "yellow", "gray", "cyan", "magenta"};
	private Color[] colorlistcell1 = {Color.black, Color.white, Color.red, Color.orange, Color.green, Color.blue, Color.yellow, Color.gray, Color.cyan, Color.magenta};
	
	private String[] colorlistgrid = {"white", "black", "red", "orange", "green", "blue", "yellow", "gray", "cyan", "magenta"};
	private Color[] colorlistgrid1 = {Color.white, Color.black, Color.red, Color.orange, Color.green, Color.blue, Color.yellow, Color.gray, Color.cyan, Color.magenta};
	
	private String[] Shapes = {"-None-",
			"Glider (0 deg)", "Glider (90 deg)", "Glider (180 deg)", "Glider (270 deg)",
			"Small Exploder",
			"Exploder",
			"10 Cell Row (0 deg)" , "10 Cell Row (90 deg)",
			"Lightweight Spaceship (0 deg)", "Lightweight Spaceship (90 deg)", "Lightweight Spaceship (180 deg)", "Lightweight Spaceship (270 deg)",
			"Gosper Glider Gun (0 deg)", "Gosper Glider Gun (90 deg)", "Gosper Glider Gun (180 deg)", "Gosper Glider Gun (270 deg)",
			"Tumbler (0 deg)", "Tumbler (90 deg)"};
	
	private gridpane grid = new gridpane();
	
	
	public gofFrame2_1() {
		
		setTitle("Conway's Game Of Life");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
		addComponentListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1278, 720);
		setMinimumSize(new Dimension(1278,600));
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		newSize = new Dimension(1278, 720);
		
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 610, 1260, 63);
		panel_1.setBackground(new Color(240, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
////////////////////////////////////////////////////////////////////////////////////////
////////GRID and SCROLLPANE
////////////////////////////////////////////////////////////////////////////////////////
		scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(Color.white);
		scrollPane.setBounds(new Rectangle(10, 40, 1240, 560));
		contentPane.add(scrollPane);
		
		
		grid.setMaximumSize(new Dimension(32000, 16000));
		grid.setPreferredSize(new Dimension(1000,1000));
	//	grid.setPreferredSize(grid.getMaximumSize());
		scrollPane.setViewportView(grid);
		
//////////////////////////////////////////////////////////////////////////////////////////
////////LABELS - 6
//////////////////////////////////////////////////////////////////////////////////////////
		JLabel lblShape = new JLabel("Shape");
		lblShape.setFont(new Font("Unispace", Font.PLAIN, 15));
		lblShape.setBounds(847, 3, 45, 28);
		contentPane.add(lblShape);

		JLabel lblGridColor = new JLabel("Grid Color");
		lblGridColor.setFont(new Font("Unispace", Font.PLAIN, 15));
		lblGridColor.setBounds(617, 3, 90, 28);
		contentPane.add(lblGridColor);

		JLabel lblColor = new JLabel("Cell Color");
		lblColor.setBounds(380, 3, 90, 28);
		contentPane.add(lblColor);
		lblColor.setFont(new Font("Unispace", Font.PLAIN, 15));

		JLabel lblGenerationssecond = new JLabel("Generations/second");
		lblGenerationssecond.setFont(new Font("Unispace", Font.PLAIN, 16));
		lblGenerationssecond.setBounds(160, 15, 180, 37);
		panel_1.add(lblGenerationssecond);

		JLabel lblGridSize = new JLabel("Cell Size(Size length)");
		lblGridSize.setFont(new Font("Unispace", Font.PLAIN, 16));
		lblGridSize.setBounds(448, 15, 220, 37);
		panel_1.add(lblGridSize);

		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setFont(new Font("Unispace", Font.PLAIN, 15));
		lblPercentage.setBounds(153, 3, 90, 28);
		lblPercentage.setVisible(false);
		contentPane.add(lblPercentage);

///////////////////////////////////////////////////////////////////////////////////////////
////////BUTTONS - 2
///////////////////////////////////////////////////////////////////////////////////////////
		//-1
		btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnStart.getText().compareTo("START")==0) {
					grid.Start();
					btnStart.setText("STOP");
				}
				else {
					grid.Stop();
					btnStart.setText("START");
				}
			}
		});
		btnStart.setFont(new Font("Unispace", Font.PLAIN, 20));
		btnStart.setBounds(12, 13, 110, 37);
		panel_1.add(btnStart);
		
		//-2
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	grid.Stop();
				grid.Reset();
				btnStart.setText("START");
			}
		});
		btnReset.setFont(new Font("Unispace", Font.PLAIN, 20));
		btnReset.setBounds(1138, 13, 110, 37);
		panel_1.add(btnReset);
		
		//-3
		btnHelp = new JButton("HELP");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gofFrame3 info = new gofFrame3();
				info.setAlwaysOnTop(true);
				info.setLocationRelativeTo(null);
				info.setVisible(true);
				info.setResizable(false);
				info.setAlwaysOnTop(true);
			}
		});
		btnHelp.setFont(new Font("Unispace", Font.BOLD, 15));
		btnHelp.setBounds(1152, 2, 98, 33);
		contentPane.add(btnHelp);
		
		
//////////////////////////////////////////////////////////////////////////////////////////
////////COMBOBOX - 6
//////////////////////////////////////////////////////////////////////////////////////////
		//-1
		gps = new JComboBox(generations_sec);
		gps.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		gps.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED && (gps.getSelectedIndex()==0)) {
					selectError1 error1 = new selectError1();
					error1.setModal(true);
					error1.setLocationRelativeTo(null);
					error1.setVisible(true);
					error1.setResizable(false);
					gps.setSelectedIndex(1);
					grid.setGen_sec(generations_sec[gps.getSelectedIndex()]);
				}
				else if(e.getStateChange()==ItemEvent.SELECTED && (gps.getSelectedIndex()!=0)) {
					grid.setGen_sec(generations_sec[gps.getSelectedIndex()]);
				}
			}
		});
		gps.setBounds(352, 13, 70, 37);
		panel_1.add(gps);
		
		//-2
		cellsize = new JComboBox(cell_size);
		cellsize.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		cellsize.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED && (cellsize.getSelectedIndex()==0)) {
					selectError1 error1 = new selectError1();
					error1.setModal(true);
					error1.setLocationRelativeTo(null);
					error1.setVisible(true);
					error1.setResizable(false);
					cellsize.setSelectedIndex(5);
					grid.setCellSize(cell_size[cellsize.getSelectedIndex()]);
				}
				else if(e.getStateChange()==ItemEvent.SELECTED && (cellsize.getSelectedIndex()!=0)) {
					grid.setCellSize(cell_size[cellsize.getSelectedIndex()]);
				}
				scrollPane.repaint();
				
			}
		});
		cellsize.setBounds(680, 13, 70, 37);
		panel_1.add(cellsize);
		
		//-3
		percentage = new JComboBox(percent);
		percentage.setFont(new Font("Dialog", Font.BOLD, 15));
		percentage.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					String p1 = percent[percentage.getSelectedIndex()];
					grid.Reset();
					btnStart.setText("START");
					if(Autofill.isSelected()) {
						grid.autofill(p1);
					}
				}
			}
		});
		percentage.setVisible(false);
		percentage.setBounds(261, 2, 55, 33);
		contentPane.add(percentage);
		
		//-4
		color = new JComboBox(colorlistcell);
		color.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		color.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					grid.setCellColor(colorlistcell1[color.getSelectedIndex()]);
					scrollPane.repaint();
				}
			}
		});
		color.setBounds(488, 2, 70, 33);
		contentPane.add(color);
		
		//-5
		gridcolor = new JComboBox(colorlistgrid);
		gridcolor.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		gridcolor.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					grid.setGridColor(colorlistgrid1[gridcolor.getSelectedIndex()]);
					scrollPane.repaint();
				}
			}
		});
		gridcolor.setBounds(725, 2, 70, 33);
		contentPane.add(gridcolor);
		
		//-6
		shape = new JComboBox(Shapes);
		shape.setModel(new DefaultComboBoxModel(new String[] {"-None-", "Glider (0 deg)", "Glider (90 deg)", "Glider (180 deg)", "Glider (270 deg)", "Small Exploder", "Exploder", "10 Cell Row (0 deg)", "10 Cell Row (90 deg)", "Lightweight Spaceship (0 deg)", "Lightweight Spaceship (90 deg)", "Lightweight Spaceship (180 deg)", "Lightweight Spaceship (270 deg)", "Gosper Glider Gun (0 deg)", "Gosper Glider Gun (90 deg)", "Gosper Glider Gun (180 deg)", "Gosper Glider Gun (270 deg)", "Tumbler (0 deg)", "Tumbler (90 deg)"}));
		shape.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		shape.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					grid.setshape(shape.getSelectedIndex());
					scrollPane.revalidate();
				}
			}
		});
		shape.setBounds(910, 3, 230, 33);
		contentPane.add(shape);
		
//////////////////////////////////////////////////////////////////////////////////////////
////////CHECKBOX - 1
//////////////////////////////////////////////////////////////////////////////////////////
		
		Autofill = new JCheckBox("Autofill");
		Autofill.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(Autofill.isSelected()) {
					lblPercentage.setVisible(true);
					percentage.setVisible(true);
				}
				else {
					lblPercentage.setVisible(false);
					percentage.setVisible(false);
				}
			}
			
		});
		Autofill.setFont(new Font("Unispace", Font.PLAIN, 15));
		Autofill.setBounds(28, 3, 97, 28);
		contentPane.add(Autofill);
		
		
		
	}
	
	
	public void componentResized(ComponentEvent e) {
		newSize = e.getComponent().getSize();
		scrollPane.setBounds(10, 40, (int)newSize.getWidth()-38, (int)newSize.getHeight()-160);
		panel_1.setBounds(0, (int)(newSize.getHeight()-110), (int)(newSize.getWidth()-18), 63);
		btnReset.setBounds((panel_1.getWidth()-123), 13, 110, 37);
		btnHelp.setBounds((int)newSize.getWidth()-126, 2, 98, 33);;
		revalidate();
		repaint();
	}
	
	public void componentHidden(ComponentEvent e) {}
	public void componentMoved(ComponentEvent e) {repaint();}
	public void componentShown(ComponentEvent e) {repaint();}
}
