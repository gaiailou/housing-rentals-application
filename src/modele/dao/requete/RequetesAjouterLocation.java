package modele.dao.requete;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import vue.Accueil;
import vue.AjouterLocation;
import vue.AjouterLogement;

public final class RequetesAjouterLocation {

	public static DefaultComboBoxModel comboLocataire(JComboBox comboBoxLocataire) {
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		Connection cn =  ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("SELECT * from BSJ3657A.view_all_locataires");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				model.addElement(rs.getString("ID_LOCATAIRE"));
			}
			
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	    return model;
	}
	
	public static DefaultComboBoxModel comboLogement(JComboBox comboBoxLogement) {
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		Connection cn =  ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("SELECT * from BSJ3657A.view_all_logements");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				model.addElement(rs.getString("IDLOGEMENT"));
			}
			
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	    return model;
	}
	
	public static DefaultComboBoxModel comboIdContrat(JComboBox comboIdContrat) {
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		Connection cn =  ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("SELECT * from BSJ3657A.view_all_contrats");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				model.addElement(rs.getString("IDCONTRAT"));
			}
			
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	    return model;
	}
	
	public static void insererLocation(String textLogement, String textLocataire, String textIndiceInitial,
			String textDateDebut, String textDateFin, String textMontantLoyer, String acteDeCaution,
			String textTypeLocation, String textMontantCharges, String textMontantFonciere, String photo,
			String textPeriodicite, String ajustement, String versementDernierLoyer, String textVersement,
			String bail, String quittance, String textIdContrat, String nomGarant, String prenomGarant,
			String telGarant) throws SQLException {

		Connection cn = ConnexionBD.getConnectionBase();
		
		try {
		PreparedStatement st = cn.prepareStatement("call BSJ3657A.insererlocation(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			st.setString(1, textLogement);
			st.setString(2,  textLocataire);
			st.setString(3,  textIndiceInitial);
			st.setString(4, textDateDebut);
			st.setString(5, textDateFin);
			st.setString(6,  textMontantLoyer);
			st.setString(7,  acteDeCaution);
			st.setString(8,  textTypeLocation);
			st.setString(9, textMontantCharges);
			st.setString(10, textMontantFonciere);
			st.setString(11, photo);
			st.setString(12, textPeriodicite);
			st.setString(13, ajustement);
			st.setString(14, versementDernierLoyer);
			st.setString(15, textVersement);
			st.setString(16, bail);
			st.setString(17, quittance);
			st.setString(18, textIdContrat);
			st.setString(19, nomGarant);
			st.setString(20, prenomGarant);
			st.setString(21, telGarant);
			st.executeUpdate();
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}	
	}
	
//	public void actionPerformed(ActionEvent e) {
//	JButton btn =(JButton)e.getSource();
//	switch(btn.getText()) {
//	
//		case"Ajouter un logement":
//			Accueil fp1 = (Accueil) AjouterLocation.getTopLevelAncestor();
//			AjouterLogement logement=new AjouterLogement();
//			fp1.getLayeredPane().add(logement);
//			logement.setVisible(true);
//			logement.moveToFront();
//			break;
//		case"Ajouter un locataire":
//			Accueil fp2 = (Accueil) this.getTopLevelAncestor();
//			AjouterLocataire locataire=new AjouterLocataire();
//			fp2.getLayeredPane().add(locataire);
//			locataire.setVisible(true);
//			locataire.moveToFront();
//			break;
//	}
//}
	
}
