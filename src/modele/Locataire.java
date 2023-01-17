package modele;

import java.sql.SQLException;
import java.util.Objects;

import javax.sql.DataSource;

import modele.dao.requete.RequeteDelete;
import modele.dao.requete.RequeteInsert;

public class Locataire {
	private String idLocataire;
	private String nomLocataire;
	private String prenomLocataire;
	private char genreLocataire;
	private String telephoneFixeLocataire;
	private String telephoneMobileLocataire;
	private String mailLocataire;
	private String ddnLocataire;
	private String pieceIdentiteLocataire;
  
	public Locataire(String idLocataire, String nomLocataire, String prenomLocataire, char genreLocataire,
			String telephoneFixeLocataire, String telephoneMobileLocataire, String mailLocataire, String ddnLocataire,
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
		result = prime * result + Objects.hashCode(telephoneFixeLocataire);
		result = prime * result + Objects.hashCode(telephoneMobileLocataire);
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
				&& Objects.equals(telephoneFixeLocataire, other.telephoneFixeLocataire)
				&& Objects.equals(telephoneMobileLocataire, other.telephoneMobileLocataire);
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

	public String getTelephoneFixeLocataire() {
		return telephoneFixeLocataire;
	}

	public void setTelephoneFixeLocataire(String telephoneFixeLocataire) {
		this.telephoneFixeLocataire = telephoneFixeLocataire;
	}

	public String getTelephoneMobileLocataire() {
		return telephoneMobileLocataire;
	}

	public void setTelephoneMobileLocataire(String telephoneMobileLocataire) {
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
		RequeteInsert.insererLocataire(id, nom, prenom, genre, tf, tm, mail, ddn, pIDL);
	}
	
	public void deleteLocataire() throws SQLException {
		RequeteDelete.deleteLocataire(this.getIdLocataire());
	}

}