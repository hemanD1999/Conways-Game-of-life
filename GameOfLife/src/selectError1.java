import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class selectError1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public selectError1() {
		setTitle("Error");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
		setBounds(100, 100, 370, 90);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblPleaseSelectAn = new JLabel("Please select an option");
			lblPleaseSelectAn.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblPleaseSelectAn);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
