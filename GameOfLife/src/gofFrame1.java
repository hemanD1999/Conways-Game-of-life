import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class gofFrame1 extends JFrame {

	private JPanel contentPane;
	
	public gofFrame1() {
		setTitle("Conway's Game Of Life");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(255, 255, 255));
		setBounds(100, 100, 587, 356);
		contentPane = new JPanel();
		
		
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
	//	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressbar pb = new progressbar();
		pb.setBounds(12, 289, 549, 15);
		contentPane.add(pb);
		
		JLabel lblConways = new JLabel("Conway's");
		lblConways.setForeground(Color.WHITE);
		lblConways.setFont(new Font("Algerian", Font.PLAIN, 50));
		lblConways.setBounds(155, 37, 297, 61);
		contentPane.add(lblConways);
		
		JLabel lblGameOfLife = new JLabel("Game Of Life");
		lblGameOfLife.setForeground(Color.WHITE);
		lblGameOfLife.setFont(new Font("Algerian", Font.PLAIN, 50));
		lblGameOfLife.setBounds(118, 111, 360, 61);
		contentPane.add(lblGameOfLife);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\JAVA Projects Eclipse\\Projects\\GameOfLife-1\\src\\bk1.jpg"));
		lblNewLabel.setBounds(0, 0, 583, 326);
		contentPane.add(lblNewLabel);
	}
}
