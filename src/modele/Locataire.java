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
	private char[]t�l�phoneMobileLocataire = new char[10];
	private String mailLocataire;
	private String ddnLocataire;
	private String pi�ceIdentit�Locataire;
	private DataSource bd;
	
	
	public Locataire(String idLocataire, String nomLocataire, String prenomLocataire, char genreLocataire,
			char[] telephoneFixeLocataire, char[] t�l�phoneMobileLocataire, String mailLocataire, String ddnLocataire,
			String pi�ceIdentit�Locataire) {
		this.idLocataire = idLocataire;
		this.nomLocataire = nomLocataire;
		this.prenomLocataire = prenomLocataire;
		this.genreLocataire = genreLocataire;
		this.telephoneFixeLocataire = telephoneFixeLocataire;
		this.t�l�phoneMobileLocataire = t�l�phoneMobileLocataire;
		this.mailLocataire = mailLocataire;
		this.ddnLocataire = ddnLocataire;
		this.pi�ceIdentit�Locataire = pi�ceIdentit�Locataire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(telephoneFixeLocataire);
		result = prime * result + Arrays.hashCode(t�l�phoneMobileLocataire);
		result = prime * result + Objects.hash(ddnLocataire, genreLocataire, idLocataire, mailLocataire, nomLocataire,
				pi�ceIdentit�Locataire, prenomLocataire);
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
				&& Objects.equals(pi�ceIdentit�Locataire, other.pi�ceIdentit�Locataire)
				&& Objects.equals(prenomLocataire, other.prenomLocataire)
				&& Arrays.equals(telephoneFixeLocataire, other.telephoneFixeLocataire)
				&& Arrays.equals(t�l�phoneMobileLocataire, other.t�l�phoneMobileLocataire);
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

	public char[] getT�l�phoneMobileLocataire() {
		return t�l�phoneMobileLocataire;
	}

	public void setT�l�phoneMobileLocataire(char[] t�l�phoneMobileLocataire) {
		this.t�l�phoneMobileLocataire = t�l�phoneMobileLocataire;
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

	public String getPi�ceIdentit�Locataire() {
		return pi�ceIdentit�Locataire;
	}

	public void setPi�ceIdentit�Locataire(String pi�ceIdentit�Locataire) {
		this.pi�ceIdentit�Locataire = pi�ceIdentit�Locataire;
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
