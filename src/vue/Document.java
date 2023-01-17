package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Document extends JInternalFrame {

	/**
	 * Create the frame.
	 */
	public Document() {
		setBounds(50, 50, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(223, 0, 215, 271);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGenSoldeToutCompte = new JLabel("Générer un solde de tout compte");
		lblGenSoldeToutCompte.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblGenSoldeToutCompte.setBounds(10, 10, 205, 29);
		panel.add(lblGenSoldeToutCompte);
		
		JLabel lblConsigneSoldeToutCompte = new JLabel("Sélectionnez un locataire et un logement");
		lblConsigneSoldeToutCompte.setBounds(10, 49, 205, 13);
		panel.add(lblConsigneSoldeToutCompte);
		
		JLabel lblIdLoc = new JLabel("Identifiant locataire : ");
		lblIdLoc.setBounds(10, 82, 106, 13);
		panel.add(lblIdLoc);
		
		JComboBox comboBoxIdLocataire = new JComboBox();
		comboBoxIdLocataire.setBounds(10, 99, 85, 21);
		panel.add(comboBoxIdLocataire);
		
		JLabel lblIdLogement = new JLabel("Identifiant logement : ");
		lblIdLogement.setBounds(10, 133, 102, 13);
		panel.add(lblIdLogement);
		
		JComboBox comboBoxIdLogement = new JComboBox();
		comboBoxIdLogement.setBounds(10, 153, 85, 21);
		panel.add(comboBoxIdLogement);
		
		JButton btnGenSoldeToutCompte = new JButton("Générer le solde de tout compte");
		btnGenSoldeToutCompte.setBounds(10, 193, 127, 46);
		panel.add(btnGenSoldeToutCompte);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 224, 271);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRegulCharge = new JLabel("Générer une régularisation des charges");
		lblRegulCharge.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblRegulCharge.setBounds(0, 10, 239, 25);
		panel_1.add(lblRegulCharge);

	}
}
