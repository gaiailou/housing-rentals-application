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
	
	public void insererLogement(String idLog, int superficieLog, String cplmAdrLog, String typeLog, double prixAcquisitionLog, 
								int nbPiece, int nbChambre, String descLog, boolean avoirGarageLog, double fraisAcquiLog, 
								boolean estActifLog, int montantCaution, String idImmeuble) throws SQLException {
		Connection cn = ConnexionBD.getConnectionBase();
		PreparedStatement st = cn.prepareStatement("call InsererLOGEMENT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
		st.setString(1, idLog);
		st.setInt(2, superficieLog);
		st.setString(3, cplmAdrLog);
		st.setString(4, typeLog);
		st.setDouble(5, prixAcquisitionLog);
		st.setInt(6, nbPiece);
		st.setInt(7, nbChambre);
		st.setString(8, descLog);
		st.setBoolean(9, avoirGarageLog);
		st.setDouble(10, fraisAcquiLog);
		st.setBoolean(11, estActifLog);
		st.setInt(12, montantCaution);
		st.setString(13, idImmeuble);
		st.setString(14, "1");//correspond � l'id du proprio. Ici on en a seulement 1
		cn.commit();
	}
}