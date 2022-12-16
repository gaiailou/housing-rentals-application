package modele;

import java.util.Arrays;
import java.util.Objects;

public class Entreprise {
	private char[] siren = new char[8];
	private char[] iban = new char[27];
	private char[] siret = new char[14];
	private String nomEntreprise;
	private int numeroRueAdresseEntreprise;
	private String nomRueAdresseEntreprise;
	private char[] cpAdresseEntreprise = new char[5];
	private String nomVilleAdresseEntreprise;
	private char[] telephoneEntreprise = new char[10];
	private String mailEntreprise;
	public Entreprise(char[] siren, char[] iban, char[] siret, String nomEntreprise, int numeroRueAdresseEntreprise,
			String nomRueAdresseEntreprise, char[] cpAdresseEntreprise, String nomVilleAdresseEntreprise,
			char[] telephoneEntreprise, String mailEntreprise) {
		super();
		this.siren = siren;
		this.iban = iban;
		this.siret = siret;
		this.nomEntreprise = nomEntreprise;
		this.numeroRueAdresseEntreprise = numeroRueAdresseEntreprise;
		this.nomRueAdresseEntreprise = nomRueAdresseEntreprise;
		this.cpAdresseEntreprise = cpAdresseEntreprise;
		this.nomVilleAdresseEntreprise = nomVilleAdresseEntreprise;
		this.telephoneEntreprise = telephoneEntreprise;
		this.mailEntreprise = mailEntreprise;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cpAdresseEntreprise);
		result = prime * result + Arrays.hashCode(iban);
		result = prime * result + Arrays.hashCode(siren);
		result = prime * result + Arrays.hashCode(siret);
		result = prime * result + Arrays.hashCode(telephoneEntreprise);
		result = prime * result + Objects.hash(mailEntreprise, nomEntreprise, nomRueAdresseEntreprise,
				nomVilleAdresseEntreprise, numeroRueAdresseEntreprise);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Entreprise)) {
			return false;
		}
		Entreprise other = (Entreprise) obj;
		return Arrays.equals(cpAdresseEntreprise, other.cpAdresseEntreprise) && Arrays.equals(iban, other.iban)
				&& Objects.equals(mailEntreprise, other.mailEntreprise)
				&& Objects.equals(nomEntreprise, other.nomEntreprise)
				&& Objects.equals(nomRueAdresseEntreprise, other.nomRueAdresseEntreprise)
				&& Objects.equals(nomVilleAdresseEntreprise, other.nomVilleAdresseEntreprise)
				&& numeroRueAdresseEntreprise == other.numeroRueAdresseEntreprise && Arrays.equals(siren, other.siren)
				&& Arrays.equals(siret, other.siret) && Arrays.equals(telephoneEntreprise, other.telephoneEntreprise);
	}
	public char[] getSiren() {
		return siren;
	}
	public void setSiren(char[] siren) {
		this.siren = siren;
	}
	public char[] getIban() {
		return iban;
	}
	public void setIban(char[] iban) {
		this.iban = iban;
	}
	public char[] getSiret() {
		return siret;
	}
	public void setSiret(char[] siret) {
		this.siret = siret;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public int getNumeroRueAdresseEntreprise() {
		return numeroRueAdresseEntreprise;
	}
	public void setNumeroRueAdresseEntreprise(int numeroRueAdresseEntreprise) {
		this.numeroRueAdresseEntreprise = numeroRueAdresseEntreprise;
	}
	public String getNomRueAdresseEntreprise() {
		return nomRueAdresseEntreprise;
	}
	public void setNomRueAdresseEntreprise(String nomRueAdresseEntreprise) {
		this.nomRueAdresseEntreprise = nomRueAdresseEntreprise;
	}
	public char[] getCpAdresseEntreprise() {
		return cpAdresseEntreprise;
	}
	public void setCpAdresseEntreprise(char[] cpAdresseEntreprise) {
		this.cpAdresseEntreprise = cpAdresseEntreprise;
	}
	public String getNomVilleAdresseEntreprise() {
		return nomVilleAdresseEntreprise;
	}
	public void setNomVilleAdresseEntreprise(String nomVilleAdresseEntreprise) {
		this.nomVilleAdresseEntreprise = nomVilleAdresseEntreprise;
	}
	public char[] getTelephoneEntreprise() {
		return telephoneEntreprise;
	}
	public void setTelephoneEntreprise(char[] telephoneEntreprise) {
		this.telephoneEntreprise = telephoneEntreprise;
	}
	public String getMailEntreprise() {
		return mailEntreprise;
	}
	public void setMailEntreprise(String mailEntreprise) {
		this.mailEntreprise = mailEntreprise;
	}
	
	
}
