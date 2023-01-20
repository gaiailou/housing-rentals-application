package modele.dao.requete;

import java.sql.Statement;
import java.util.ArrayList;

import modele.Immeuble;
import modele.Locataire;
import modele.Location;
import modele.Logement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequeteSelect {

	/**
	 * 
	 * @return ArrayList<Logement> liste des logements
	 * @throws SQLException
	 */
	public static ArrayList<Logement> selectLogement() throws SQLException {
        ArrayList<Logement> liste = new ArrayList<Logement>();
		Connection cn = ConnexionBD.getConnectionBase();
        try {
            Statement st = cn.createStatement();
            ResultSet curseurLogement = st.executeQuery("SELECT * FROM BSJ3657A.logement");
            boolean enregistrementExiste = curseurLogement.next();
            while (enregistrementExiste) {
                liste.add(new Logement(curseurLogement.getString("IdLogement"),
                		curseurLogement.getString("superficieLogement"),
                		curseurLogement.getString("complementAdresseLogement"),
                		curseurLogement.getString("typeLogement"),
                		curseurLogement.getString("prixAcquisitionLogement"),
                		curseurLogement.getString("nbPiece"),
                		curseurLogement.getString("nbChambre"),
                		curseurLogement.getString("descriptionLogement"),
                		curseurLogement.getBoolean("avoirGarageLogement"),
                		curseurLogement.getString("fraisAcquisitionLogement"),
                		curseurLogement.getBoolean("actifLogement"),
                		curseurLogement.getString("montant_Caution"),
                		curseurLogement.getString("numimmeuble"),
                		//new Immeuble()
                		curseurLogement.getString("Idproprietaire")));
                enregistrementExiste = curseurLogement.next();
            }
            curseurLogement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return liste;
	
	}
	
	/**
	 * 
	 * @return ArrayList<Locataire> liste des locataires
	 * @throws SQLException
	 */
	public static ArrayList<Locataire> selectLocataire() throws SQLException {
		
		ArrayList<Locataire> liste = new ArrayList<Locataire>();
		Connection cn = ConnexionBD.getConnectionBase();

        try {
            Statement st = cn.createStatement();
            ResultSet curseurLocataire = st.executeQuery("SELECT * FROM BSJ3657A.locataire");
            boolean enregistrementExiste = curseurLocataire.next();
            while (enregistrementExiste) {
                liste.add (new Locataire(curseurLocataire.getString("id_LOCATAIRE"),
                		curseurLocataire.getString("NOM_LOCATAIRE"),
                		curseurLocataire.getString("PRENOM_LOCATAIRE"),
                		curseurLocataire.getString("genre_locataire").charAt(0),
                		curseurLocataire.getString("telephone_fixe_LOCATAIRE"),
                		curseurLocataire.getString("telephone_mobile_LOCATAIRE"),
                		curseurLocataire.getString("mail_LOCATAIRE"),
                		curseurLocataire.getString("ddn_LOCATAIRE"),
                		curseurLocataire.getString("piece_identite_LOCATAIRE")));
                enregistrementExiste = curseurLocataire.next();
            }
            curseurLocataire.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            throw ex;
        }
		return liste;
	}
	
	/**
	 * 
	 * @return ArrayList<Location> liste des locations
	 * @throws SQLException
	 */
	public static ArrayList<Location> selectLocation() throws SQLException {
        ArrayList<Location> liste = new ArrayList<Location>();
		Connection cn = ConnexionBD.getConnectionBase();
        
        try {
            Statement st = cn.createStatement();
            ResultSet curseurLocation = st.executeQuery("SELECT * FROM BSJ3657A.location");
            boolean enregistrementExiste = curseurLocation.next();
            while (enregistrementExiste) {
                liste.add(new Location(
                		curseurLocation.getString("idlogement"), 
                		curseurLocation.getString("id_locataire"), 
                		curseurLocation.getString("indiceInitial"), 
                		curseurLocation.getString("dateDebutLocation"),
                		curseurLocation.getString("dateFinLocation"), 
                		curseurLocation.getInt("montantLoyerLocation"), 
                		curseurLocation.getString("typeLocation"), 
                		curseurLocation.getInt("montantChargesLocation"),
                		curseurLocation.getString("montantTaxeFonciereLocation"), 
                		curseurLocation.getString("photoLocation"), 
                		curseurLocation.getString("periodicitePaiementLoyer"),
                		curseurLocation.getString("ajustementLoyer"), 
                		curseurLocation.getString("dateVersementDernierLoyer"), 
                		curseurLocation.getString("dateVersementLoyer"), 
                		curseurLocation.getString("fichierBail"),
                		curseurLocation.getString("fichierQuittanceLoyer"), 
                		curseurLocation.getString("idcontrat")));
                enregistrementExiste = curseurLocation.next();
            }
            curseurLocation.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return liste;
	
	}
	
	public Locataire selectLocataireById(String idLoc) throws SQLException {
		Locataire leLocataire = null;
		Connection cn = ConnexionBD.getConnectionBase();
		
		
        try {
       
            PreparedStatement st = cn.prepareStatement("SELECT * FROM BSJ3657A.locataire where id_locataire= ?");
			st.setString(1, idLoc);
            ResultSet curseurLocataire = st.executeQuery();
            boolean enregistrementExiste = curseurLocataire.next();
            while (enregistrementExiste) {
                leLocataire = new Locataire(
                		curseurLocataire.getString("id_locataire"), 
                		curseurLocataire.getString("nom_locataire"),
                		curseurLocataire.getString("prenom_locataire"),
                		curseurLocataire.getString("genre_locataire").charAt(0),
                		curseurLocataire.getString("telephone_fixe_locataire"),
                		curseurLocataire.getString("telephone_mobile_locataire"),
                		curseurLocataire.getString("mail_locataire"),
                		curseurLocataire.getString("ddn_locataire"),
                		curseurLocataire.getString("piece_identite_locataire"));
                enregistrementExiste = curseurLocataire.next();
            }
            curseurLocataire.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return leLocataire;
	
	}
	
	public Logement selectLogementById(String idLog) throws SQLException {
		Logement leLogement = null;
		Connection cn = ConnexionBD.getConnectionBase();
		
		
        try {
       
            PreparedStatement st = cn.prepareStatement("SELECT * FROM BSJ3657A.logement where IdLogement= ?");
			st.setString(1, idLog);
            ResultSet curseurLogement = st.executeQuery();
            boolean enregistrementExiste = curseurLogement.next();
            while (enregistrementExiste) {
                leLogement = new Logement(curseurLogement.getString("IdLogement"),
                		curseurLogement.getString("superficieLogement"),
                		curseurLogement.getString("complementAdresseLogement"),
                		curseurLogement.getString("typeLogement"),
                		curseurLogement.getString("prixAcquisitionLogement"),
                		curseurLogement.getString("nbPiece"),
                		curseurLogement.getString("nbChambre"),
                		curseurLogement.getString("descriptionLogement"),
                		curseurLogement.getBoolean("avoirGarageLogement"),
                		curseurLogement.getString("fraisAcquisitionLogement"),
                		curseurLogement.getBoolean("actifLogement"),
                		curseurLogement.getString("montant_Caution"),
                		curseurLogement.getString("numimmeuble"),
                		curseurLogement.getString("Idproprietaire"));
                enregistrementExiste = curseurLogement.next();
            }
            curseurLogement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return leLogement;
	
	}
	
	public Immeuble selectImmeubleById(String idImm) throws SQLException {
		Immeuble leImmeuble = null;
		Connection cn = ConnexionBD.getConnectionBase();
		
		
        try {
       
            PreparedStatement st = cn.prepareStatement("SELECT * FROM BSJ3657A.immeuble where numImmeuble= ?");
			st.setString(1, idImm);
            ResultSet curseurImmeuble = st.executeQuery();
            boolean enregistrementExiste = curseurImmeuble.next();
            while (enregistrementExiste) {
            	leImmeuble = new Immeuble(curseurImmeuble.getString("numImmeuble"),
                		curseurImmeuble.getString("numeroAdresseLogement"),
                		curseurImmeuble.getString("nomRueAdresseLogement"),
                		curseurImmeuble.getString("anneeConstructionImmeuble"),
                		curseurImmeuble.getString("CPville"),
                		curseurImmeuble.getString("nomVille"),
                		curseurImmeuble.getBoolean("CoPropriete"));
                enregistrementExiste = curseurImmeuble.next();
            }
            curseurImmeuble.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return leImmeuble;
	
	}
	
}
