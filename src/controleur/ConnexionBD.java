package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {
	
		private final static String LOGIN = Login.getLogin();
		private final static String MDP = Login.getMdp();
		private final static String URL = Login.getUrl();
		
		private static Connection instance;
		
		/**
		 * Créée et renvoie une nouvelle connexion à la BD à partir de l'url, du login et du mdp
		 * If an instance of the connection already exists, it will return that instead of creating a new one.
		@return a Connection to the specified database
		@throws SQLException if an error occurs while connecting to the database
		*/
		private static Connection instanceBuilder() {
			if (instance == null) {
		        try {
		            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		            instance = DriverManager.getConnection(URL, LOGIN, MDP);
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		    return instance;
		}
		
		/**
		 * Renvoie une connexion à la base de données
		 * @return la connexion à la base de données
		 */
		public static Connection getConnectionBase() {
			if(ConnexionBD.instance == null) {
				instance = ConnexionBD.instanceBuilder();
			} 
			return instance;
		}
		
		
}

