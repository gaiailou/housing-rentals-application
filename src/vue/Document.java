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

import controleur.GestionDocument;
import modele.dao.requete.RequetesAjouterLocation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Document extends JInternalFrame{
	 
	private JComboBox comboBoxLocataire;
	private JComboBox comboBoxIdLogement;

	private GestionDocument gestionClic;

	private JButton btnGenSoldeToutCompte;
	private JButton btnFermer;
	
	public String getComboBoxLocataire() {
		return this.comboBoxLocataire.getSelectedItem().toString();
	}

	public void setComboBoxLocataire(JComboBox comboBoxLocataire) {
		this.comboBoxLocataire = comboBoxLocataire;
	}

	public String getComboBoxIdLogement() {
		return this.comboBoxIdLogement.getSelectedItem().toString();
	}

	public void setComboBoxIdLogement(JComboBox comboBoxIdLogement) {
		this.comboBoxIdLogement = comboBoxIdLogement;
	}

	public GestionDocument getGestionClic() {
		return gestionClic;
	}

	public void setGestionClic(GestionDocument gestionClic) {
		this.gestionClic = gestionClic;
	}

	public JButton getBtnGenSoldeToutCompte() {
		return btnGenSoldeToutCompte;
	}

	public void setBtnGenSoldeToutCompte(JButton btnGenSoldeToutCompte) {
		this.btnGenSoldeToutCompte = btnGenSoldeToutCompte;
	}

	public JButton getBtnFermer() {
		return btnFermer;
	}

	public void setBtnFermer(JButton btnFermer) {
		this.btnFermer = btnFermer;
	}

	public Document() {
		setBounds(50, 50, 500, 400);
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
		
		
		this.comboBoxLocataire = new JComboBox();
		this.comboBoxLocataire.setSelectedItem(null);
		this.comboBoxLocataire.setModel(RequetesAjouterLocation.comboLocataire(this.comboBoxLocataire));
		this.comboBoxLocataire.setMaximumRowCount(20);
		this.comboBoxLocataire.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(this.comboBoxLocataire);
		
		JLabel lblIdLogement = new JLabel("Identifiant logement : ");
		lblIdLogement.setBounds(10, 133, 102, 13);
		panel.add(lblIdLogement);
		
		this.comboBoxIdLogement = new JComboBox();
		this.comboBoxIdLogement.setBounds(10, 153, 85, 21);
		panel.add(this.comboBoxIdLogement);
		
		this.btnGenSoldeToutCompte = new JButton();
		btnGenSoldeToutCompte.setText("Générer");
		this.btnGenSoldeToutCompte.addActionListener(this.gestionClic);
		this.btnGenSoldeToutCompte.setBounds(10, 193, 127, 46);
		panel.add(this.btnGenSoldeToutCompte);
		
		this.btnFermer = new JButton("Fermer");
		this.btnFermer.addActionListener(this.gestionClic);
		this.btnFermer.setBounds(10, 249, 85, 21);
		panel.add(this.btnFermer);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 224, 271);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblRegulCharge = new JLabel("Générer une régularisation des charges");
		lblRegulCharge.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblRegulCharge.setBounds(0, 10, 239, 25);
		panel1.add(lblRegulCharge);
	}
}

