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
			System.out.println("Delete reussie");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static void deleteLogement(String IdLogement) {
		Connection cn = ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("delete from BSJ3657A.logement where idLogement=?");
			st.setString(1, IdLogement);
			st.executeUpdate();
			st.close();
			System.out.println("Delete reussie");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static void deleteLocation(String IdLogement,String IdLocataire) {
		Connection cn = ConnexionBD.getConnectionBase();
		
		try {
			PreparedStatement st = cn.prepareStatement("delete from BSJ3657A.location where idLogement=? and id_Locataire=?");
			st.setString(1, IdLogement);
			st.setString(2, IdLocataire);
			st.executeUpdate();
			st.close();
			System.out.println("Delete reussie");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
