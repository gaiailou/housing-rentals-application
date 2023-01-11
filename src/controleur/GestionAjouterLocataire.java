package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modele.Locataire;
import modele.dao.DaoLocataire;
import vue.AjouterLocataire;

public class GestionAjouterLocataire implements ActionListener {
	private AjouterLocataire al;
	private DaoLocataire dl;
	
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
		case "Ins\u00E9rer":
			AjouterLocataire al = (AjouterLocataire) this.al.getTopLevelAncestor();
			try {
				Locataire.insererLocataire(this.al.getTextId(), this.al.getTextNom(), this.al.getTextPrenom(), this.al.getComboCivilite(), this.al.getTextNbFixe(), this.al.getTextNbPortable(), this.al.getTextDateNaissance(), this.al.getTextField(), null);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			this.al.dispose();
		}
	}
}
