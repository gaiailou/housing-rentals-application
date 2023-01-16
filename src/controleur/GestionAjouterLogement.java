package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.AjouterLogement;

public class GestionAjouterLogement implements ActionListener {
	private AjouterLogement al;
	
	public GestionAjouterLogement(AjouterLogement al) {
		this.al = al;
	}

	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		switch(btn.getText()) {
			case"Annuler":
				this.al.dispose();
				break;
			case"Valider":
				this.al.dispose();
				break;
		}
	}
}
