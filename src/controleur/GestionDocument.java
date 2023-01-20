package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modele.dao.requete.RequeteFonction;
import vue.Document;

public class GestionDocument implements ActionListener{
	private Document doc;
	
	public GestionDocument(Document doc) {
		this.doc = doc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch (item.getText()){
			case "Générer":
				try {
		            RequeteFonction.soldeToutCompte(this.doc.getComboBoxLocataire(),this.doc.getComboBoxIdLogement());
		        } catch (SQLException e2) {
		            e2.printStackTrace();
		        }
		            this.doc.dispose();
		        break;
			case "Fermer":
				this.doc.dispose();
		}
	}
}
