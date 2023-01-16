package modele.dao.requete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RequeteInsert {
	
	public static void insererLocataire(String idLocataire, String nomLocataire, String prenomLocataire, String genreLocataire,
								 String telephoneFixeLocataire, String telephoneMobileLocataire, String mailLocataire, String ddnLocataire,
								 String pieceIdentiteLocataire) throws SQLException {
		
		Connection cn = ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("call insererNouveauLocataire(?, ? , ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, idLocataire);
			st.setString(2,  nomLocataire);
			st.setString(3,  prenomLocataire);
			st.setString(4, genreLocataire);
			st.setString(5, telephoneFixeLocataire);
			st.setString(6,  telephoneMobileLocataire);
			st.setString(7,  mailLocataire);
			st.setString(8,  ddnLocataire);
			st.setString(9, pieceIdentiteLocataire);
			st.executeUpdate();
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static void insererLogement(String idLog, String superficieLog, String cplmAdrLog, String typeLog, String prixAcquisitionLog, 
								String nbPiece, String nbChambre, String descLog, boolean avoirGarageLog, String fraisAcquiLog, 
								boolean estActifLog, String montantCaution, String idImmeuble) throws SQLException {
		
		Connection cn = ConnexionBD.getConnectionBase();
		 
		PreparedStatement st = cn.prepareStatement("call InsererLOGEMENT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
		st.setString(1, idLog);//String idLogement,
		st.setString(2, superficieLog);//String superficie,
		st.setString(3, cplmAdrLog);//String complementAdresseLogement
		st.setString(4, typeLog);//String typeLogement,
		st.setString(5, prixAcquisitionLog);//double prixAcquisitionLog
		st.setString(6, nbPiece);//int nbPiece
		st.setString(7, nbChambre);//int nbChambre
		st.setString(8, descLog);//String descriptionLogement,
		st.setBoolean(9, avoirGarageLog);//boolean avoirGarageLog,
		st.setString(10, fraisAcquiLog);//double fraisAcquiLog,
		st.setBoolean(11, estActifLog);//boolean actifLogement,
		st.setString(12, montantCaution);//double montantCaution,
		st.setString(13, idImmeuble);//String immeuble
		st.setString(14, "1");//correspond � l'id du proprio. Ici on en a seulement 1
		
	}
}