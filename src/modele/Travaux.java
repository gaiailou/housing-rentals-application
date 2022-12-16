package modele;

import java.util.Arrays;
import java.util.Objects;

public class Travaux {
	private char[] numFacture = new char[10];
	private double montantNonDeductibleTravaux;
	private String dateTravaux;
	private String natureTravaux;
	private Logement logement;
	private Immeuble immeuble;
	public Travaux(char[] numFacture, double montantNonDeductibleTravaux, String dateTravaux, String natureTravaux,
			Logement logement, Immeuble immeuble) {
		super();
		this.numFacture = numFacture;
		this.montantNonDeductibleTravaux = montantNonDeductibleTravaux;
		this.dateTravaux = dateTravaux;
		this.natureTravaux = natureTravaux;
		this.logement = logement;
		this.immeuble = immeuble;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(numFacture);
		result = prime * result
				+ Objects.hash(dateTravaux, immeuble, logement, montantNonDeductibleTravaux, natureTravaux);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Travaux)) {
			return false;
		}
		Travaux other = (Travaux) obj;
		return Objects.equals(dateTravaux, other.dateTravaux) && Objects.equals(immeuble, other.immeuble)
				&& Objects.equals(logement, other.logement)
				&& Double.doubleToLongBits(montantNonDeductibleTravaux) == Double
						.doubleToLongBits(other.montantNonDeductibleTravaux)
				&& Objects.equals(natureTravaux, other.natureTravaux) && Arrays.equals(numFacture, other.numFacture);
	}
	public char[] getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(char[] numFacture) {
		this.numFacture = numFacture;
	}
	public double getMontantNonDeductibleTravaux() {
		return montantNonDeductibleTravaux;
	}
	public void setMontantNonDeductibleTravaux(double montantNonDeductibleTravaux) {
		this.montantNonDeductibleTravaux = montantNonDeductibleTravaux;
	}
	public String getDateTravaux() {
		return dateTravaux;
	}
	public void setDateTravaux(String dateTravaux) {
		this.dateTravaux = dateTravaux;
	}
	public String getNatureTravaux() {
		return natureTravaux;
	}
	public void setNatureTravaux(String natureTravaux) {
		this.natureTravaux = natureTravaux;
	}
	public Logement getLogement() {
		return logement;
	}
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
	public Immeuble getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(Immeuble immeuble) {
		this.immeuble = immeuble;
	}
	
	
}
