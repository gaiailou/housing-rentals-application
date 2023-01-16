package modele;

import java.util.Arrays;
import java.util.Objects;

public class Charge {
	private char[] idCharge = new char[5];
	private double ancienIndex;
	private double nouvelIndex;
	private double prixUnite;
	private String intituleCharge;
	private double montantCharge;
	private Logement logement;
	private Locataire locataire;
	public Charge(char[] idCharge, double ancienIndex, double nouvelIndex, Logement logement, Locataire locataire) {
		super();
		this.idCharge = idCharge;
		this.ancienIndex = ancienIndex;
		this.nouvelIndex = nouvelIndex;
		this.logement = logement;
		this.locataire = locataire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(idCharge);
		result = prime * result + Objects.hash(ancienIndex, locataire, logement, nouvelIndex);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Charge)) {
			return false;
		}
		Charge other = (Charge) obj;
		return Double.doubleToLongBits(ancienIndex) == Double.doubleToLongBits(other.ancienIndex)
				&& Arrays.equals(idCharge, other.idCharge) && Objects.equals(locataire, other.locataire)
				&& Objects.equals(logement, other.logement)
				&& Double.doubleToLongBits(nouvelIndex) == Double.doubleToLongBits(other.nouvelIndex);
	}
	public char[] getIdCharge() {
		return idCharge;
	}
	public void setIdCharge(char[] idCharge) {
		this.idCharge = idCharge;
	}
	public double getAncienIndex() {
		return ancienIndex;
	}
	public void setAncienIndex(double ancienIndex) {
		this.ancienIndex = ancienIndex;
	}
	public double getNouvelIndex() {
		return nouvelIndex;
	}
	public void setNouvelIndex(double nouvelIndex) {
		this.nouvelIndex = nouvelIndex;
	}
	public Logement getLogement() {
		return logement;
	}
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
	public Locataire getLocataire() {
		return locataire;
	}
	public void setLocataire(Locataire locataire) {
		this.locataire = locataire;
	}
	
	public double getPrixUnite() {
		return prixUnite;
	}
	public void setPrixUnite(double prixUnite) {
		this.prixUnite = prixUnite;
	}
	public String getIntituleCharge() {
		return intituleCharge;
	}
	public void setIntituleCharge(String intituleCharge) {
		this.intituleCharge = intituleCharge;
	}
	public double getMontantCharge() {
		return montantCharge;
	}
	public void setMontantCharge(double montantCharge) {
		this.montantCharge = montantCharge;
	}
	
	
}
