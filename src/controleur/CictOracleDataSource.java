package controleur;
import java.sql.Connection;
import java.sql.SQLException ;

import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource ;

public class CictOracleDataSource extends OracleDataSource {
	
	private static Connection connection = null;
	private static CictOracleDataSource cOD = null;
	private static final long serialVersionUID = 1L;
	
	public CictOracleDataSource (String nom, String mdp) throws SQLException {
		this.setURL ("jdbc:oracle:thin:@telline.univ-tlse3.fr" +":1521:etupre") ;
		this.setUser (nom) ;
		this.setPassword (mdp) ;
	}
	
	public static void creerAcces (String login, String mdp) throws SQLException{
		CictOracleDataSource.cOD = new CictOracleDataSource (login, mdp) ;
		CictOracleDataSource.connection = CictOracleDataSource.cOD.getConnection();
	}
	
	public static Connection getConnectionBD() throws SQLException{
		return CictOracleDataSource.connection;
	}
	
	public static void deconnecter() {
		try {
			CictOracleDataSource.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		CictOracleDataSource.cOD = null;
		CictOracleDataSource.connection = null;
	}
}