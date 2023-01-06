package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Objects;

import javax.sql.DataSource;

import controleur.CictOracleDataSource;

public class Locataire {
	private String idLocataire;
	private String nomLocataire;
	private String prenomLocataire;
	private char genreLocataire;
	private char[] telephoneFixeLocataire = new char[10];
	private char[]téléphoneMobileLocataire = new char[10];
	private String mailLocataire;
	private String ddnLocataire;
	private String pièceIdentitéLocataire;
	private DataSource bd;
	
	
	public Locataire(String idLocataire, String nomLocataire, String prenomLocataire, char genreLocataire,
			char[] telephoneFixeLocataire, char[] téléphoneMobileLocataire, String mailLocataire, String ddnLocataire,
			String pièceIdentitéLocataire) {
		this.idLocataire = idLocataire;
		this.nomLocataire = nomLocataire;
		this.prenomLocataire = prenomLocataire;
		this.genreLocataire = genreLocataire;
		this.telephoneFixeLocataire = telephoneFixeLocataire;
		this.téléphoneMobileLocataire = téléphoneMobileLocataire;
		this.mailLocataire = mailLocataire;
		this.ddnLocataire = ddnLocataire;
		this.pièceIdentitéLocataire = pièceIdentitéLocataire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(telephoneFixeLocataire);
		result = prime * result + Arrays.hashCode(téléphoneMobileLocataire);
		result = prime * result + Objects.hash(ddnLocataire, genreLocataire, idLocataire, mailLocataire, nomLocataire,
				pièceIdentitéLocataire, prenomLocataire);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Locataire)) {
			return false;
		}
		Locataire other = (Locataire) obj;
		return Objects.equals(ddnLocataire, other.ddnLocataire) && genreLocataire == other.genreLocataire
				&& Objects.equals(idLocataire, other.idLocataire) && Objects.equals(mailLocataire, other.mailLocataire)
				&& Objects.equals(nomLocataire, other.nomLocataire)
				&& Objects.equals(pièceIdentitéLocataire, other.pièceIdentitéLocataire)
				&& Objects.equals(prenomLocataire, other.prenomLocataire)
				&& Arrays.equals(telephoneFixeLocataire, other.telephoneFixeLocataire)
				&& Arrays.equals(téléphoneMobileLocataire, other.téléphoneMobileLocataire);
	}

	public String getIdLocataire() {
		return idLocataire;
	}

	public void setIdLocataire(String idLocataire) {
		this.idLocataire = idLocataire;
	}

	public String getNomLocataire() {
		return nomLocataire;
	}

	public void setNomLocataire(String nomLocataire) {
		this.nomLocataire = nomLocataire;
	}

	public String getPrenomLocataire() {
		return prenomLocataire;
	}

	public void setPrenomLocataire(String prenomLocataire) {
		this.prenomLocataire = prenomLocataire;
	}

	public char getGenreLocataire() {
		return genreLocataire;
	}

	public void setGenreLocataire(char genreLocataire) {
		this.genreLocataire = genreLocataire;
	}

	public char[] getTelephoneFixeLocataire() {
		return telephoneFixeLocataire;
	}

	public void setTelephoneFixeLocataire(char[] telephoneFixeLocataire) {
		this.telephoneFixeLocataire = telephoneFixeLocataire;
	}

	public char[] getTéléphoneMobileLocataire() {
		return téléphoneMobileLocataire;
	}

	public void setTéléphoneMobileLocataire(char[] téléphoneMobileLocataire) {
		this.téléphoneMobileLocataire = téléphoneMobileLocataire;
	}

	public String getMailLocataire() {
		return mailLocataire;
	}

	public void setMailLocataire(String mailLocataire) {
		this.mailLocataire = mailLocataire;
	}

	public String getDdnLocataire() {
		return ddnLocataire;
	}

	public void setDdnLocataire(String ddnLocataire) {
		this.ddnLocataire = ddnLocataire;
	}

	public String getPièceIdentitéLocataire() {
		return pièceIdentitéLocataire;
	}

	public void setPièceIdentitéLocataire(String pièceIdentitéLocataire) {
		this.pièceIdentitéLocataire = pièceIdentitéLocataire;
	}
	
	
	public void insererLocataire(String id, String nom, String prenom, char genre, String tf, String tm, String mail, String ddn) throws SQLException {
		
		bd = new CictOracleDataSource ();
		Connection cn = bd.getConnection() ;
		String req = "call BSJ3657.inserernouveaulocataire('" + id +"', '" + nom + "', '"+ prenom +"', '" + genre + "', '" + tf + "', '" + tm + "', '" + mail + "', '" + ddn + "', '" + null + "')";
		java.sql.Statement stEns = cn.createStatement () ;
		ResultSet rsEns = stEns.executeQuery (req) ;
		
		rsEns.close () ;
		stEns.close() ;
		cn.close() ;
	}
}
