package modele;

import java.util.Arrays;
import java.util.Objects;

public class Logement {
	private char[] idLogement = new char[15];
	private double superficieLogement;
	private String complementAdresseLogement;
	private String typeLogement;
	private double prixAcquisitionLogement;
	private int nbPiece;
	private int nbChambre;
	private String descriptionLogement;
	private boolean avoirGarageLogement;
	private double fraisAcquisitionLogement;
	private boolean actifLogement;
	private double montantCaution;
	private Immeuble immeuble;
	private Proprietaire proprietaire;
	public Logement(char[] idLogement, double superficieLogement, String complementAdresseLogement, String typeLogement,
			double prixAcquisitionLogement, int nbPiece, int nbChambre, String descriptionLogement,
			boolean avoirGarageLogement, double fraisAcquisitionLogement, boolean actifLogement, double montantCaution,
			Immeuble immeuble, Proprietaire proprietaire) {
		super();
		this.idLogement = idLogement;
		this.superficieLogement = superficieLogement;
		this.complementAdresseLogement = complementAdresseLogement;
		this.typeLogement = typeLogement;
		this.prixAcquisitionLogement = prixAcquisitionLogement;
		this.nbPiece = nbPiece;
		this.nbChambre = nbChambre;
		this.descriptionLogement = descriptionLogement;
		this.avoirGarageLogement = avoirGarageLogement;
		this.fraisAcquisitionLogement = fraisAcquisitionLogement;
		this.actifLogement = actifLogement;
		this.montantCaution = montantCaution;
		this.immeuble = immeuble;
		this.proprietaire = proprietaire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(idLogement);
		result = prime * result + Objects.hash(actifLogement, avoirGarageLogement, complementAdresseLogement,
				descriptionLogement, fraisAcquisitionLogement, immeuble, montantCaution, nbChambre, nbPiece,
				prixAcquisitionLogement, proprietaire, superficieLogement, typeLogement);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Logement)) {
			return false;
		}
		Logement other = (Logement) obj;
		return actifLogement == other.actifLogement && avoirGarageLogement == other.avoirGarageLogement
				&& Objects.equals(complementAdresseLogement, other.complementAdresseLogement)
				&& Objects.equals(descriptionLogement, other.descriptionLogement)
				&& Double.doubleToLongBits(fraisAcquisitionLogement) == Double
						.doubleToLongBits(other.fraisAcquisitionLogement)
				&& Arrays.equals(idLogement, other.idLogement) && Objects.equals(immeuble, other.immeuble)
				&& Double.doubleToLongBits(montantCaution) == Double.doubleToLongBits(other.montantCaution)
				&& nbChambre == other.nbChambre && nbPiece == other.nbPiece
				&& Double.doubleToLongBits(prixAcquisitionLogement) == Double
						.doubleToLongBits(other.prixAcquisitionLogement)
				&& Objects.equals(proprietaire, other.proprietaire)
				&& Double.doubleToLongBits(superficieLogement) == Double.doubleToLongBits(other.superficieLogement)
				&& Objects.equals(typeLogement, other.typeLogement);
	}
	public char[] getIdLogement() {
		return idLogement;
	}
	public void setIdLogement(char[] idLogement) {
		this.idLogement = idLogement;
	}
	public double getSuperficieLogement() {
		return superficieLogement;
	}
	public void setSuperficieLogement(double superficieLogement) {
		this.superficieLogement = superficieLogement;
	}
	public String getComplementAdresseLogement() {
		return complementAdresseLogement;
	}
	public void setComplementAdresseLogement(String complementAdresseLogement) {
		this.complementAdresseLogement = complementAdresseLogement;
	}
	public String getTypeLogement() {
		return typeLogement;
	}
	public void setTypeLogement(String typeLogement) {
		this.typeLogement = typeLogement;
	}
	public double getPrixAcquisitionLogement() {
		return prixAcquisitionLogement;
	}
	public void setPrixAcquisitionLogement(double prixAcquisitionLogement) {
		this.prixAcquisitionLogement = prixAcquisitionLogement;
	}
	public int getNbPiece() {
		return nbPiece;
	}
	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}
	public int getNbChambre() {
		return nbChambre;
	}
	public void setNbChambre(int nbChambre) {
		this.nbChambre = nbChambre;
	}
	public String getDescriptionLogement() {
		return descriptionLogement;
	}
	public void setDescriptionLogement(String descriptionLogement) {
		this.descriptionLogement = descriptionLogement;
	}
	public boolean isAvoirGarageLogement() {
		return avoirGarageLogement;
	}
	public void setAvoirGarageLogement(boolean avoirGarageLogement) {
		this.avoirGarageLogement = avoirGarageLogement;
	}
	public double getFraisAcquisitionLogement() {
		return fraisAcquisitionLogement;
	}
	public void setFraisAcquisitionLogement(double fraisAcquisitionLogement) {
		this.fraisAcquisitionLogement = fraisAcquisitionLogement;
	}
	public boolean isActifLogement() {
		return actifLogement;
	}
	public void setActifLogement(boolean actifLogement) {
		this.actifLogement = actifLogement;
	}
	public double getMontantCaution() {
		return montantCaution;
	}
	public void setMontantCaution(double montantCaution) {
		this.montantCaution = montantCaution;
	}
	public Immeuble getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(Immeuble immeuble) {
		this.immeuble = immeuble;
	}
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	
}
