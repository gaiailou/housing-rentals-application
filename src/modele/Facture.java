package modele;

import java.util.Arrays;
import java.util.Objects;

public class Facture {
	private Reglement reglement;
	private char[] numFacture = new char[20];
	private String dateFacture;
	private double montant;
	private String fichier;
	private String numeroCheque;
	private String dateEmissionFacture;
	private String dateReceptionFacture;
	private Travaux travaux;
	private Logement logement;
	public Facture(Reglement reglement, char[] numFacture, String dateFacture, double montant, String fichier,
			String numeroCheque, String dateEmissionFacture, String dateReceptionFacture, Travaux travaux,
			Logement logement) {
		super();
		this.reglement = reglement;
		this.numFacture = numFacture;
		this.dateFacture = dateFacture;
		this.montant = montant;
		this.fichier = fichier;
		this.numeroCheque = numeroCheque;
		this.dateEmissionFacture = dateEmissionFacture;
		this.dateReceptionFacture = dateReceptionFacture;
		this.travaux = travaux;
		this.logement = logement;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(numFacture);
		result = prime * result + Objects.hash(dateEmissionFacture, dateFacture, dateReceptionFacture, fichier,
				logement, montant, numeroCheque, reglement, travaux);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Facture)) {
			return false;
		}
		Facture other = (Facture) obj;
		return Objects.equals(dateEmissionFacture, other.dateEmissionFacture)
				&& Objects.equals(dateFacture, other.dateFacture)
				&& Objects.equals(dateReceptionFacture, other.dateReceptionFacture)
				&& Objects.equals(fichier, other.fichier) && Objects.equals(logement, other.logement)
				&& Double.doubleToLongBits(montant) == Double.doubleToLongBits(other.montant)
				&& Arrays.equals(numFacture, other.numFacture) && Objects.equals(numeroCheque, other.numeroCheque)
				&& Objects.equals(reglement, other.reglement) && Objects.equals(travaux, other.travaux);
	}
	public Reglement getReglement() {
		return reglement;
	}
	public void setReglement(Reglement reglement) {
		this.reglement = reglement;
	}
	public char[] getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(char[] numFacture) {
		this.numFacture = numFacture;
	}
	public String getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(String dateFacture) {
		this.dateFacture = dateFacture;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getFichier() {
		return fichier;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	public String getNumeroCheque() {
		return numeroCheque;
	}
	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}
	public String getDateEmissionFacture() {
		return dateEmissionFacture;
	}
	public void setDateEmissionFacture(String dateEmissionFacture) {
		this.dateEmissionFacture = dateEmissionFacture;
	}
	public String getDateReceptionFacture() {
		return dateReceptionFacture;
	}
	public void setDateReceptionFacture(String dateReceptionFacture) {
		this.dateReceptionFacture = dateReceptionFacture;
	}
	public Travaux getTravaux() {
		return travaux;
	}
	public void setTravaux(Travaux travaux) {
		this.travaux = travaux;
	}
	public Logement getLogement() {
		return logement;
	}
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
	
	
}
