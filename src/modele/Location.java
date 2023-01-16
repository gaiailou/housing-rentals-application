package modele;

import java.util.Objects;

public class Location {
	private String logement;
	private String locataire;
	private String indiceInitial;
	private String dateDebutLocation;
	private String dateFinLocation;
	private String montantLoyerLocation;
	private String typeLocation;
	private String montantChargesLocation;
	private String montantTaxeFonciereLocation;
	private String photoLocation;
	private String periodicitePaiementLoyer;
	private String ajustementLoyer;
	private String dateVersementDernierLoyer;
	private String dateVersementLoyer;
	private String fichierBail;
	private String fichierQuittanceLoyer;
	private String contrat;
	public Location(String logement, String locataire, String indiceInitial, String dateDebutLocation,
			String dateFinLocation, String montantLoyerLocation, String typeLocation, String montantChargesLocation,
			String montantTaxeFonciereLocation, String photoLocation, String periodicitePaiementLoyer,
			String ajustementLoyer, String dateVersementDernierLoyer, String dateVersementLoyer, String fichierBail,
			String fichierQuittanceLoyer, String contrat) {
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
	
	public String getLogement() {
		return logement;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(ajustementLoyer,other.ajustementLoyer)
				&& Objects.equals(contrat, other.contrat) && Objects.equals(dateDebutLocation, other.dateDebutLocation)
				&& Objects.equals(dateFinLocation, other.dateFinLocation)
				&& Objects.equals(dateVersementDernierLoyer, other.dateVersementDernierLoyer)
				&& Objects.equals(dateVersementLoyer, other.dateVersementLoyer)
				&& Objects.equals(fichierBail, other.fichierBail)
				&& Objects.equals(fichierQuittanceLoyer, other.fichierQuittanceLoyer)
				&& Objects.equals(indiceInitial,other.indiceInitial)
				&& Objects.equals(locataire, other.locataire) && Objects.equals(logement, other.logement)
				&& Objects.equals(montantChargesLocation,other.montantChargesLocation)
				&& Objects.equals(montantLoyerLocation,other.montantLoyerLocation)
				&& Objects.equals(montantTaxeFonciereLocation,other.montantTaxeFonciereLocation)
				&& Objects.equals(periodicitePaiementLoyer, other.periodicitePaiementLoyer)
				&& Objects.equals(photoLocation, other.photoLocation)
				&& Objects.equals(typeLocation, other.typeLocation);
	}
	public void setLogement(String logement) {
		this.logement = logement;
	}
	public String getLocataire() {
		return locataire;
	}
	public void setLocataire(String locataire) {
		this.locataire = locataire;
	}
	public String getIndiceInitial() {
		return indiceInitial;
	}
	public void setIndiceInitial(String indiceInitial) {
		this.indiceInitial = indiceInitial;
	}
	public String getDateDebutLocation() {
		return dateDebutLocation;
	}
	public void setDateDebutLocation(String dateDebutLocation) {
		this.dateDebutLocation = dateDebutLocation;
	}
	public String getDateFinLocation() {
		return dateFinLocation;
	}
	public void setDateFinLocation(String dateFinLocation) {
		this.dateFinLocation = dateFinLocation;
	}
	public String getMontantLoyerLocation() {
		return montantLoyerLocation;
	}
	public void setMontantLoyerLocation(String montantLoyerLocation) {
		this.montantLoyerLocation = montantLoyerLocation;
	}
	public String getTypeLocation() {
		return typeLocation;
	}
	public void setTypeLocation(String typeLocation) {
		this.typeLocation = typeLocation;
	}
	public String getMontantChargesLocation() {
		return montantChargesLocation;
	}
	public void setMontantChargesLocation(String montantChargesLocation) {
		this.montantChargesLocation = montantChargesLocation;
	}
	public String getMontantTaxeFonciereLocation() {
		return montantTaxeFonciereLocation;
	}
	public void setMontantTaxeFonciereLocation(String montantTaxeFonciereLocation) {
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
	public String getAjustementLoyer() {
		return ajustementLoyer;
	}
	public void setAjustementLoyer(String ajustementLoyer) {
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
	public String getContrat() {
		return contrat;
	}
	public void setContrat(String contrat) {
		this.contrat = contrat;
	}
	
	
}
