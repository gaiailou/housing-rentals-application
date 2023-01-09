package controleur;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Collection;

import javax.swing.JButton;

import modele.Locataire;
import modele.dao.DaoLocataire;
import vue.AjouterLocataire;

public class GestionAjouterLocataire implements ActionListener {
	private AjouterLocataire al;
	private JButton btn;
	private DaoLocataire dl;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Annuler":
				this.al.dispose();
				break;
			case"Valider":
				this.al.dispose();
				
		}
	}
}
