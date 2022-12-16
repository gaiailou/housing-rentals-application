package modele;

import java.util.Arrays;
import java.util.Objects;

public class Proprietaire {
	private String idProprietaire;
	private String nomProprietaire;
	private String prenomProprietaire;
	private int numeroRueAdresseProprietaire;
	private String nomRueAdresseProprietaire;
	private char[] codePostalAdresseProprietaire = new char[5];
	private String nomVilleAdresseProprietaire;
	private String mailProprietaire;
	private char[] telephoneProprietaire;
	public Proprietaire(String idProprietaire, String nomProprietaire, String prenomProprietaire,
			int numeroRueAdresseProprietaire, String nomRueAdresseProprietaire, char[] codePostalAdresseProprietaire,
			String nomVilleAdresseProprietaire, String mailProprietaire, char[] telephoneProprietaire) {
		super();
		this.idProprietaire = idProprietaire;
		this.nomProprietaire = nomProprietaire;
		this.prenomProprietaire = prenomProprietaire;
		this.numeroRueAdresseProprietaire = numeroRueAdresseProprietaire;
		this.nomRueAdresseProprietaire = nomRueAdresseProprietaire;
		this.codePostalAdresseProprietaire = codePostalAdresseProprietaire;
		this.nomVilleAdresseProprietaire = nomVilleAdresseProprietaire;
		this.mailProprietaire = mailProprietaire;
		this.telephoneProprietaire = telephoneProprietaire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(codePostalAdresseProprietaire);
		result = prime * result + Arrays.hashCode(telephoneProprietaire);
		result = prime * result
				+ Objects.hash(idProprietaire, mailProprietaire, nomProprietaire, nomRueAdresseProprietaire,
						nomVilleAdresseProprietaire, numeroRueAdresseProprietaire, prenomProprietaire);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Proprietaire)) {
			return false;
		}
		Proprietaire other = (Proprietaire) obj;
		return Arrays.equals(codePostalAdresseProprietaire, other.codePostalAdresseProprietaire)
				&& Objects.equals(idProprietaire, other.idProprietaire)
				&& Objects.equals(mailProprietaire, other.mailProprietaire)
				&& Objects.equals(nomProprietaire, other.nomProprietaire)
				&& Objects.equals(nomRueAdresseProprietaire, other.nomRueAdresseProprietaire)
				&& Objects.equals(nomVilleAdresseProprietaire, other.nomVilleAdresseProprietaire)
				&& numeroRueAdresseProprietaire == other.numeroRueAdresseProprietaire
				&& Objects.equals(prenomProprietaire, other.prenomProprietaire)
				&& Arrays.equals(telephoneProprietaire, other.telephoneProprietaire);
	}
	public String getIdProprietaire() {
		return idProprietaire;
	}
	public void setIdProprietaire(String idProprietaire) {
		this.idProprietaire = idProprietaire;
	}
	public String getNomProprietaire() {
		return nomProprietaire;
	}
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	public String getPrenomProprietaire() {
		return prenomProprietaire;
	}
	public void setPrenomProprietaire(String prenomProprietaire) {
		this.prenomProprietaire = prenomProprietaire;
	}
	public int getNumeroRueAdresseProprietaire() {
		return numeroRueAdresseProprietaire;
	}
	public void setNumeroRueAdresseProprietaire(int numeroRueAdresseProprietaire) {
		this.numeroRueAdresseProprietaire = numeroRueAdresseProprietaire;
	}
	public String getNomRueAdresseProprietaire() {
		return nomRueAdresseProprietaire;
	}
	public void setNomRueAdresseProprietaire(String nomRueAdresseProprietaire) {
		this.nomRueAdresseProprietaire = nomRueAdresseProprietaire;
	}
	public char[] getCodePostalAdresseProprietaire() {
		return codePostalAdresseProprietaire;
	}
	public void setCodePostalAdresseProprietaire(char[] codePostalAdresseProprietaire) {
		this.codePostalAdresseProprietaire = codePostalAdresseProprietaire;
	}
	public String getNomVilleAdresseProprietaire() {
		return nomVilleAdresseProprietaire;
	}
	public void setNomVilleAdresseProprietaire(String nomVilleAdresseProprietaire) {
		this.nomVilleAdresseProprietaire = nomVilleAdresseProprietaire;
	}
	public String getMailProprietaire() {
		return mailProprietaire;
	}
	public void setMailProprietaire(String mailProprietaire) {
		this.mailProprietaire = mailProprietaire;
	}
	public char[] getTelephoneProprietaire() {
		return telephoneProprietaire;
	}
	public void setTelephoneProprietaire(char[] telephoneProprietaire) {
		this.telephoneProprietaire = telephoneProprietaire;
	}
	
	
}
