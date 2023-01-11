package modele.dao.requete;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RequeteInsert {
	
	public static void insererLocataire(String idLocataire, String nomLocataire, String prenomLocataire, String genreLocataire,
			String telephoneFixeLocataire, String telephoneMobileLocataire, String mailLocataire, String ddnLocataire,
			String pieceIdentiteLocataire) {
		Connection cn = ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("call InsererNouveauLocataire(?, ? , ?, ?, ?, ?, ?, ?, ?)");
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
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}