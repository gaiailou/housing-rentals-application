package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modele.Logement;
import vue.AjouterLogement;

public class GestionAjouterLogement implements ActionListener {
	private AjouterLogement al;
	
	public GestionAjouterLogement(AjouterLogement al) {
		this.al = al;
	}

	public void actionPerformed(ActionEvent e) {
		JButton item =(JButton)e.getSource();
		switch(item.getText()) {
			case"Annuler":
				this.al.dispose();
				break;
			case"Valider":
				if (this.al.getTextId().compareTo("") == 0) {
					//TODO;
				}else {
					try {
						Logement.insererLogement(this.al.getTextId(), this.al.getTextFieldSuperficie(), this.al.getTextFieldCplmtAdr(), this.al.getComboType(), this.al.getTextFieldPrixAcquisition(), this.al.getSpinnerNbPiece(), this.al.getSpinnerNbChambre(), this.al.getTextDescription(), this.al.getCheckboxGarage(), this.al.getTextFieldFraisAcquisition(), true, this.al.getTextFieldCaution(), "1");
						//idLogement, 									superficie, 						complementAdresseLogement, 	typeLogement, 					prixAcquisitionLog, 				nbPiece, 					nbChambre, 						descriptionLogement, 		avoirGarageLog, 				fraisAcquiLog, 				actifLogement, montantCaution, 			immeuble
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				this.al.dispose();
				break;
		}
	}
}
