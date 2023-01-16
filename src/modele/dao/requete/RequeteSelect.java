package modele.dao.requete;

import java.sql.Statement;
import java.util.ArrayList;
import modele.Locataire;
import modele.Logement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequeteSelect {

	public static ArrayList<Logement> SelectLogement() throws SQLException {

        ArrayList<Logement> liste = new ArrayList<Logement>();
		Connection cn = ConnexionBD.getConnectionBase();

        String req = "SELECT * FROM BSJ3657A.logement";
        
        try {
            Statement st = cn.createStatement();
            ResultSet curseurLogement = st.executeQuery(req);
            boolean enregistrementExiste = curseurLogement.next();
            while (enregistrementExiste) {
            	 
                liste.add(new Logement(curseurLogement.getString("IdLogement"),
                		curseurLogement.getString("superficieLogement"),
                		curseurLogement.getString("complémentAdresseLogement"),
                		curseurLogement.getString("typeLogement"),
                		curseurLogement.getString("prixAcquisitionLogement"),
                		curseurLogement.getInt("nbPièce"),
                		curseurLogement.getInt("nbChambre"),
                		curseurLogement.getString("descriptionLogement"),
                		curseurLogement.getBoolean("avoirGarageLogement"),
                		curseurLogement.getString("fraisAcquisitionLogement"),
                		curseurLogement.getBoolean("actifLogement"),
                		curseurLogement.getString("montant_Caution"),
                		curseurLogement.getString("numimmeuble"),
                		curseurLogement.getString("Idproprietaire")));
                enregistrementExiste = curseurLogement.next();
            }
            System.out.println("Fin de la liste des logements…");
            curseurLogement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw ex;
        }
		return liste;
	
	}
	
	public static ArrayList<Locataire> SelectLocataire() throws SQLException {
		
		ArrayList<Locataire> liste = new ArrayList<Locataire>();
		Connection cn = ConnexionBD.getConnectionBase();

        String req = "SELECT * FROM BSJ3657A.locataire";
        
        try {
            Statement st = cn.createStatement();
            ResultSet curseurLocataire = st.executeQuery(req);
            boolean enregistrementExiste = curseurLocataire.next();
            while (enregistrementExiste) {
            	 
                liste.add (new Locataire(curseurLocataire.getString("id_LOCATAIRE"),
                		curseurLocataire.getString("NOM_LOCATAIRE"),
                		curseurLocataire.getString("PRENOM_LOCATAIRE"),
                		curseurLocataire.getString("genre_locataire").charAt(0),
                		curseurLocataire.getString("téléphone_fixe_LOCATAIRE"),
                		curseurLocataire.getString("téléphone_mobile_LOCATAIRE"),
                		curseurLocataire.getString("mail_LOCATAIRE"),
                		curseurLocataire.getString("ddn_LOCATAIRE"),
                		curseurLocataire.getString("pièce_identité_LOCATAIRE")));
                enregistrementExiste = curseurLocataire.next();
            }
            System.out.println("Fin de la liste des locataires…");
            curseurLocataire.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw ex;
        }
		return liste;
	}
}
