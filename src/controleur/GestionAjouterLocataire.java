package controleur;

import java.awt.Color;
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
	//private DaoLocataire dl;
	//private Connection cn;
	
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
				this.al.getLblIdLoc().setText(this.al.getLblIdLoc().getText() + "      *vide*");
				this.al.getLblIdLoc().setForeground(new Color(255, 0, 0));
				//voir comment le mettre en rouge ou le mettre en �vidence pour si on se trompe en entrant les donn�es
			}else {
				try {
					Locataire.insererLocataire(this.al.getTextId(), this.al.getTextNom(), this.al.getTextPrenom(), this.al.getComboCivilite(), this.al.getTextNbFixe(), this.al.getTextNbPortable(), this.al.getTextDateNaissance(), this.al.getTextField(), null);
					JOptionPane jpn = new JOptionPane();
					jpn.showMessageDialog(this.al, "Votre nouveau locataire a été inséré avec succès.", "Insertion OK", JOptionPane.INFORMATION_MESSAGE);
					this.al.dispose();
				} catch (SQLException e1) {
					int msgErreur = e1.getErrorCode();
					JOptionPane jpn = new JOptionPane();
					switch (msgErreur) {
					case 12899 :
						jpn.showMessageDialog(this.al, "Valeur trop grande pour le champ de saisie de l'identifiant du locataire.\n V�rifiez les informations et recommencez.", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
						break;
					default :
						jpn.showMessageDialog(jpn, "Il semble que les param�tres entr�s rencontrent un probl�me.\n V�rifiez les informations et recommencez.", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}
					
				}
				//this.al.dispose();
			}
			
		}
	}
}
