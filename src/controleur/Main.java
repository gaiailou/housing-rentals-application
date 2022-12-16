package controleur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Main {

	public static void main(String[] args) {
		try {
			DataSource bd = new CictOracleDataSource ("PLM4280A", "$iutinfo") ;
			Connection cn = bd.getConnection() ;
			System.out.println("Connexion au SGBD établie") ;
			String req = "SELECT NOM_LOCATAIRE, PRENOM_LOCATAIRE FROM BSJ3657A.locataire";
			java.sql.Statement stEns = cn.createStatement () ;
			ResultSet rsEns = stEns.executeQuery (req) ;
			boolean suivant = rsEns.next() ;
			while (suivant) {
				System.out.println(rsEns.getString("NOM_LOCATAIRE") + " " + rsEns.getString("PRENOM_LOCATAIRE")) ;
				
				suivant = rsEns.next();
			}
			
			rsEns.close () ;
			stEns.close() ;
			cn.close() ;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
