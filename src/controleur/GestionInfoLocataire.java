package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import vue.InfoLocataire;

public class GestionInfoLocataire implements ActionListener {
	private InfoLocataire il;
	
	public GestionInfoLocataire(InfoLocataire il) {
		this.il = il;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton item =(JButton)e.getSource();
		switch(item.getText()) {
			case"Fermer":
				this.il.dispose();
				break;
			case"Supprimer":
				try {
					int res = JOptionPane.showConfirmDialog(this.il, "Voulez-vous vraiment supprimer un locataire ?");
				    if(res == JOptionPane.YES_OPTION){
				      this.il.getLocataireSelected().deleteLocataire();
				      JOptionPane jpn = new JOptionPane();
				      jpn.showMessageDialog(this.il, "Votre locataire a bien été supprimé", "Message de confirmation", JOptionPane.PLAIN_MESSAGE);
					}
				} catch (SQLException e1) {
					//JOptionPane jpn = new JOptionPane();
				    //jpn.showMessageDialog(jpn, "Votre locataire n'a pas bien été supprimé", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
				this.il.dispose();
				break;
		}
	}
}
