package modele.dao.requete;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RequeteDelete {
	
	public static void deleteLocataire(String IdLocataire) {
		Connection cn = ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("delete from BSJ3657A.locataire where id_Locataire=?");
			st.setString(1, IdLocataire);
			st.executeUpdate();
			st.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
