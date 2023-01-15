package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modele.Locataire;
import modele.dao.DaoLocataire;
import vue.AjouterLocataire;

public class GestionAjouterLocataire implements ActionListener {
	private AjouterLocataire al;
	private DaoLocataire dl;
	private Connection cn;
	
	public GestionAjouterLocataire(AjouterLocataire al) {
		this.al = al;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Annuler" :
			this.al.dispose();
			break;
		case "Valider":
			if (this.al.getTextId().compareTo("") == 0) {
				//TODO;
			}else {
				try {
					Locataire.insererLocataire(this.al.getTextId(), this.al.getTextNom(), this.al.getTextPrenom(), this.al.getComboCivilite(), this.al.getTextNbFixe(), this.al.getTextNbPortable(), this.al.getTextDateNaissance(), this.al.getTextField(), null);
				} catch (SQLException e1) {
					JOptionPane jpn = new JOptionPane();
					jpn.showMessageDialog(jpn, "Il semble que les paramètres entrés rencontrent un problème.\n Vérifiez les informations et recommencez.", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				this.al.dispose();
			}
			
		}
	}
}
