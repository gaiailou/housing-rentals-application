package modele.dao.requete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequeteFonction {
	
	public static void provisionPourCharges(String dateDebutLocation, String dateFinLocation, int provision_mois) throws SQLException {

        Connection cn = ConnexionBD.getConnectionBase();
        try {
            PreparedStatement st = cn.prepareStatement("call provisionPourCharges(?, ?, ?)");
            //BSJ3657A.
            st.setString(1, dateDebutLocation);
            st.setString(2,  dateFinLocation);
            st.setInt(2,  provision_mois);
            st.executeUpdate();
            st.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
	
	
    public static int soldeToutCompte(String idLocataire, String idLogement) throws SQLException {
    	
    	Connection cn = ConnexionBD.getConnectionBase();
        try {
            PreparedStatement st = cn.prepareStatement("call soldeToutCompte(?, ?)");
            st.setString(1, idLocataire);
            st.setString(2, idLogement);
            
            ResultSet res = st.executeQuery();
            st.close();
            return res.getInt(0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
		return 0;
		
    }

}
