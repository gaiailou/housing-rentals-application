package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class RegularisationCharge extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegularisationCharge frame = new RegularisationCharge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegularisationCharge() {
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblLocation = new JLabel("Location : ");
		panel.add(lblLocation);
		
		JComboBox comboBoxLocation = new JComboBox();
		panel.add(comboBoxLocation);
		
		JLabel lblMontantCharge = new JLabel("Charge mensuelle : ");
		panel.add(lblMontantCharge);
		
		JLabel lblAfficheCharge = new JLabel("...\u20AC");
		panel.add(lblAfficheCharge);
		
		JLabel lblCoutReel = new JLabel("Co\u00FBt r\u00E9el : ");
		panel.add(lblCoutReel);
		
		JLabel lblAfficheCoutReel = new JLabel("... \u20AC");
		panel.add(lblAfficheCoutReel);
		
		JLabel lblCalculRegCharge = new JLabel("R\u00E9sultat : ");
		panel.add(lblCalculRegCharge);
		
		JLabel lblNewLabel = new JLabel("charge mensuelle * nb de mois - charge r\u00E9elle");
		panel.add(lblNewLabel);

	}

}
