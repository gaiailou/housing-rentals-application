package modele;

import java.util.Objects;

public class Location {
	private Logement logement;
	private Locataire locataire;
	private double indiceInitial;
	private double dateDebutLocation;
	private double dateFinLocation;
	private double montantLoyerLocation;
	private String typeLocation;
	private double montantChargesLocation;
	private double montantTaxeFonciereLocation;
	private String photoLocation;
	private String periodicitePaiementLoyer;
	private double ajustementLoyer;
	private String dateVersementDernierLoyer;
	private String dateVersementLoyer;
	private String fichierBail;
	private String fichierQuittanceLoyer;
	private Contrat contrat;
	public Location(Logement logement, Locataire locataire, double indiceInitial, double dateDebutLocation,
			double dateFinLocation, double montantLoyerLocation, String typeLocation, double montantChargesLocation,
			double montantTaxeFonciereLocation, String photoLocation, String periodicitePaiementLoyer,
			double ajustementLoyer, String dateVersementDernierLoyer, String dateVersementLoyer, String fichierBail,
			String fichierQuittanceLoyer, Contrat contrat) {
		super();
		this.logement = logement;
		this.locataire = locataire;
		this.indiceInitial = indiceInitial;
		this.dateDebutLocation = dateDebutLocation;
		this.dateFinLocation = dateFinLocation;
		this.montantLoyerLocation = montantLoyerLocation;
		this.typeLocation = typeLocation;
		this.montantChargesLocation = montantChargesLocation;
		this.montantTaxeFonciereLocation = montantTaxeFonciereLocation;
		this.photoLocation = photoLocation;
		this.periodicitePaiementLoyer = periodicitePaiementLoyer;
		this.ajustementLoyer = ajustementLoyer;
		this.dateVersementDernierLoyer = dateVersementDernierLoyer;
		this.dateVersementLoyer = dateVersementLoyer;
		this.fichierBail = fichierBail;
		this.fichierQuittanceLoyer = fichierQuittanceLoyer;
		this.contrat = contrat;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ajustementLoyer, contrat, dateDebutLocation, dateFinLocation, dateVersementDernierLoyer,
				dateVersementLoyer, fichierBail, fichierQuittanceLoyer, indiceInitial, locataire, logement,
				montantChargesLocation, montantLoyerLocation, montantTaxeFonciereLocation, periodicitePaiementLoyer,
				photoLocation, typeLocation);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Location)) {
			return false;
		}
		Location other = (Location) obj;
		return Double.doubleToLongBits(ajustementLoyer) == Double.doubleToLongBits(other.ajustementLoyer)
				&& Objects.equals(contrat, other.contrat)
				&& Double.doubleToLongBits(dateDebutLocation) == Double.doubleToLongBits(other.dateDebutLocation)
				&& Double.doubleToLongBits(dateFinLocation) == Double.doubleToLongBits(other.dateFinLocation)
				&& Objects.equals(dateVersementDernierLoyer, other.dateVersementDernierLoyer)
				&& Objects.equals(dateVersementLoyer, other.dateVersementLoyer)
				&& Objects.equals(fichierBail, other.fichierBail)
				&& Objects.equals(fichierQuittanceLoyer, other.fichierQuittanceLoyer)
				&& Double.doubleToLongBits(indiceInitial) == Double.doubleToLongBits(other.indiceInitial)
				&& Objects.equals(locataire, other.locataire) && Objects.equals(logement, other.logement)
				&& Double.doubleToLongBits(montantChargesLocation) == Double
						.doubleToLongBits(other.montantChargesLocation)
				&& Double.doubleToLongBits(montantLoyerLocation) == Double.doubleToLongBits(other.montantLoyerLocation)
				&& Double.doubleToLongBits(montantTaxeFonciereLocation) == Double
						.doubleToLongBits(other.montantTaxeFonciereLocation)
				&& Objects.equals(periodicitePaiementLoyer, other.periodicitePaiementLoyer)
				&& Objects.equals(photoLocation, other.photoLocation)
				&& Objects.equals(typeLocation, other.typeLocation);
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
	public double getIndiceInitial() {
		return indiceInitial;
	}
	public void setIndiceInitial(double indiceInitial) {
		this.indiceInitial = indiceInitial;
	}
	public double getDateDebutLocation() {
		return dateDebutLocation;
	}
	public void setDateDebutLocation(double dateDebutLocation) {
		this.dateDebutLocation = dateDebutLocation;
	}
	public double getDateFinLocation() {
		return dateFinLocation;
	}
	public void setDateFinLocation(double dateFinLocation) {
		this.dateFinLocation = dateFinLocation;
	}
	public double getMontantLoyerLocation() {
		return montantLoyerLocation;
	}
	public void setMontantLoyerLocation(double montantLoyerLocation) {
		this.montantLoyerLocation = montantLoyerLocation;
	}
	public String getTypeLocation() {
		return typeLocation;
	}
	public void setTypeLocation(String typeLocation) {
		this.typeLocation = typeLocation;
	}
	public double getMontantChargesLocation() {
		return montantChargesLocation;
	}
	public void setMontantChargesLocation(double montantChargesLocation) {
		this.montantChargesLocation = montantChargesLocation;
	}
	public double getMontantTaxeFonciereLocation() {
		return montantTaxeFonciereLocation;
	}
	public void setMontantTaxeFonciereLocation(double montantTaxeFonciereLocation) {
		this.montantTaxeFonciereLocation = montantTaxeFonciereLocation;
	}
	public String getPhotoLocation() {
		return photoLocation;
	}
	public void setPhotoLocation(String photoLocation) {
		this.photoLocation = photoLocation;
	}
	public String getPeriodicitePaiementLoyer() {
		return periodicitePaiementLoyer;
	}
	public void setPeriodicitePaiementLoyer(String periodicitePaiementLoyer) {
		this.periodicitePaiementLoyer = periodicitePaiementLoyer;
	}
	public double getAjustementLoyer() {
		return ajustementLoyer;
	}
	public void setAjustementLoyer(double ajustementLoyer) {
		this.ajustementLoyer = ajustementLoyer;
	}
	public String getDateVersementDernierLoyer() {
		return dateVersementDernierLoyer;
	}
	public void setDateVersementDernierLoyer(String dateVersementDernierLoyer) {
		this.dateVersementDernierLoyer = dateVersementDernierLoyer;
	}
	public String getDateVersementLoyer() {
		return dateVersementLoyer;
	}
	public void setDateVersementLoyer(String dateVersementLoyer) {
		this.dateVersementLoyer = dateVersementLoyer;
	}
	public String getFichierBail() {
		return fichierBail;
	}
	public void setFichierBail(String fichierBail) {
		this.fichierBail = fichierBail;
	}
	public String getFichierQuittanceLoyer() {
		return fichierQuittanceLoyer;
	}
	public void setFichierQuittanceLoyer(String fichierQuittanceLoyer) {
		this.fichierQuittanceLoyer = fichierQuittanceLoyer;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	
}
