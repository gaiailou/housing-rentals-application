package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modele.Location;
import vue.AjouterLocation;

public class GestionAjouterLocation implements ActionListener {
	private AjouterLocation al;
	
	public GestionAjouterLocation(AjouterLocation al) {
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
			if (this.al.getTextLocataire().compareTo("") == 0) {
				//Mise en evidence si pas complete
				this.al.setLabelLocataire(al.getLabelLocataire());
				
			}else if(this.al.getTextLogement().compareTo("") == 0){
				//Mise en evidence si pas complete
				this.al.setLabelLogement(al.getLabelLogement());
				
			}else if(this.al.getTextTypeLocation().compareTo("") == 0){
				//Mise en evidence si pas complete
				this.al.setLabelTypeLocation(al.getLabelTypeLocation());
				
			}else {
				try {
					Location.insererLocation(this.al.getTextLogement(),this.al.getTextLocataire(),this.al.getTextIndiceInitial(),
							this.al.getTextDateDebut(),this.al.getTextDateFin(),this.al.getTextMontantLoyer(),this.al.getActeDeCaution(),
							this.al.getTextTypeLocation(),this.al.getTextMontantCharges(),this.al.getTextMontantFonciere(),
							this.al.getPhoto(),this.al.getTextPeriodicite(),this.al.getAjustementLoyer(),this.al.getVersementDernierLoyer(),
							this.al.getTextVersement(),this.al.getBail(),this.al.getQuittance(),this.al.getTextIdContrat(),
							this.al.getNomGarant(),this.al.getPrenomGarant(),this.al.getTelGarant());
					this.al.dispose();
					
				}catch(SQLException e2) {
					JOptionPane jpn = new JOptionPane();
					jpn.showMessageDialog(jpn, "Il semble que les param�tres entr�s rencontrent un probl�me.\n V�rifiez les informations et recommencez.", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
					e2.printStackTrace();
				}
			}
		}
	}

}
