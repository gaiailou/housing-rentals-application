package modele.dao.requete;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RequeteDelete {
	
	/**
	 * supprime un locataire de la BD
	 * @param idLocataire Identifiant du locataire à supprimer
	 */
	public static void deleteLocataire(String idLocataire) {
		Connection cn = ConnexionBD.getConnectionBase();
		try {
			PreparedStatement st = cn.prepareStatement("delete from BSJ3657A.locataire where id_Locataire=?");
			st.setString(1, idLocataire);
			st.executeUpdate();
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	/**
	 * supprime un logement de la BD
	 * @param idLogement Identifiant du logement à supprimer
	 */
	public static void deleteLogement(String idLogement) {
		Connection cn = ConnexionBD.getConnectionBase();	
		try {
			PreparedStatement st = cn.prepareStatement("delete from BSJ3657A.logement where idLogement=?");
			st.setString(1, idLogement);
			st.executeUpdate();
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	/**
	 * supprime un location de la BD
	 * @param idLogement Identifiant de la location à supprimer
	 * @param idLocataire Identifiant du locataire à supprimer
	 */
	public static void deleteLocation(String idLogement,String idLocataire) {
		Connection cn = ConnexionBD.getConnectionBase();
		try {
			PreparedStatement st = cn.prepareStatement("delete from BSJ3657A.location where idLogement=? and id_Locataire=?");
			st.setString(1, idLogement);
			st.setString(2, idLocataire);
			st.executeUpdate();
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
