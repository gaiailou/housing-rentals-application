package BDLien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import controleur.CictOracleDataSource;

public class BDInsert {
	
	private DataSource bd;
	
	protected void insererLocataire(String id, String nom, String prenom, char genre, String tf, String tm, String mail, String ddn, String pid) throws SQLException {
		
		bd = new CictOracleDataSource ();
		Connection cn = bd.getConnection() ;
		String req = "call BSJ3657.inserernouveaulocataire('" + id +"', '" + nom + "', '"+ prenom +"', '" + genre + "', '" + tf + "', '" + tm + "', '" + mail + "', '" + ddn + "', '" + pid + "')";
		java.sql.Statement stEns = cn.createStatement () ;
		ResultSet rsEns = stEns.executeQuery (req) ;
		
		rsEns.close () ;
		stEns.close() ;
		cn.close() ;
	}
}

