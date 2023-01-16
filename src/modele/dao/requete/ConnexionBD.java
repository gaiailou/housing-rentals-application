package modele.dao.requete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {
	
		private final static String LOGIN = Login.getLogin();
		private final static String MDP = Login.getMdp();
		private final static String URL = Login.getUrl();
		
		private static Connection instance;
		
		private static Connection instanceBuilder() {
			try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				Connection connx = DriverManager.getConnection(URL, LOGIN, MDP);
				return connx;

			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public static Connection getConnectionBase() {
			if(ConnexionBD.instance == null) {
				instance = ConnexionBD.instanceBuilder();
			} 
			return instance;
		}
		
		
}

