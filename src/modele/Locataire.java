package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Objects;

import javax.sql.DataSource;

import controleur.CictOracleDataSource;
import modele.dao.requete.RequeteInsert;

public class Locataire {
	private String idLocataire;
	private String nomLocataire;
	private String prenomLocataire;
	private char genreLocataire;
	private char[] telephoneFixeLocataire = new char[10];
	private char[]telephoneMobileLocataire = new char[10];
	private String mailLocataire;
	private String ddnLocataire;
	private String pieceIdentiteLocataire;
	private DataSource bd;
	
	
	public Locataire(String idLocataire, String nomLocataire, String prenomLocataire, char genreLocataire,
			char[] telephoneFixeLocataire, char[] telephoneMobileLocataire, String mailLocataire, String ddnLocataire,
			String pieceIdentiteLocataire) {
		this.idLocataire = idLocataire;
		this.nomLocataire = nomLocataire;
		this.prenomLocataire = prenomLocataire;
		this.genreLocataire = genreLocataire;
		this.telephoneFixeLocataire = telephoneFixeLocataire;
		this.telephoneMobileLocataire = telephoneMobileLocataire;
		this.mailLocataire = mailLocataire;
		this.ddnLocataire = ddnLocataire;
		this.pieceIdentiteLocataire = pieceIdentiteLocataire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(telephoneFixeLocataire);
		result = prime * result + Arrays.hashCode(telephoneMobileLocataire);
		result = prime * result + Objects.hash(ddnLocataire, genreLocataire, idLocataire, mailLocataire, nomLocataire,
				pieceIdentiteLocataire, prenomLocataire);
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
				&& Objects.equals(pieceIdentiteLocataire, other.pieceIdentiteLocataire)
				&& Objects.equals(prenomLocataire, other.prenomLocataire)
				&& Arrays.equals(telephoneFixeLocataire, other.telephoneFixeLocataire)
				&& Arrays.equals(telephoneMobileLocataire, other.telephoneMobileLocataire);
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

	public char[] getTelephoneMobileLocataire() {
		return telephoneMobileLocataire;
	}

	public void setTelephoneMobileLocataire(char[] telephoneMobileLocataire) {
		this.telephoneMobileLocataire = telephoneMobileLocataire;
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

	public String getPieceIdentiteLocataire() {
		return pieceIdentiteLocataire;
	}

	public void setPieceIdentiteLocataire(String pieceIdentiteLocataire) {
		this.pieceIdentiteLocataire = pieceIdentiteLocataire;
	}
	
	
	public static void insererLocataire(String id, String nom, String prenom, String genre, String tf, String tm, String mail, String ddn, String pIDL) throws SQLException {
		System.out.println("2 on est là");
		RequeteInsert.insererLocataire(id, nom, prenom, genre, tf, tm, mail, ddn, pIDL);
	}

}
