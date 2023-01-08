package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class AjouterCharge extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textFieldMontantReel;
	public AjouterCharge() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitreAjouterCharge = new JLabel("Ajouter une charge");
		getContentPane().add(lblTitreAjouterCharge, BorderLayout.NORTH);
		
		JPanel panelEntete = new JPanel();
		getContentPane().add(panelEntete, BorderLayout.CENTER);
		panelEntete.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panelEntete.add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblLocation = new JLabel("Location");
		panel.add(lblLocation);
		
		JComboBox comboBoxLocation = new JComboBox();
		panel.add(comboBoxLocation);
		
		JLabel lblIntituleCharge = new JLabel("Intitul\u00E9 charge : ");
		panel.add(lblIntituleCharge);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JPanel panel_1 = new JPanel();
		panelEntete.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JLabel lblAncienIndex = new JLabel("Ancien index");
		panel_2.add(lblAncienIndex);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_2.add(textField);
		
		JLabel lblNouvelIndex = new JLabel("Nouvel index");
		panel_2.add(lblNouvelIndex);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_2.add(textField_1);
		
		JLabel lblPrixUnite = new JLabel("Prix unit\u00E9");
		panel_2.add(lblPrixUnite);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_2.add(textField_2);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JLabel lblMontantChargeDirectEnFait = new JLabel("Montant charge");
		panel_3.add(lblMontantChargeDirectEnFait);
		
		textFieldMontantReel = new JTextField();
		panel_3.add(textFieldMontantReel);
		textFieldMontantReel.setColumns(10);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterCharge frame = new AjouterCharge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
