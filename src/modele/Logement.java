package modele;

import java.sql.SQLException;
import java.util.Objects;

import javax.swing.JTextField;

import modele.dao.requete.RequeteDelete;
import modele.dao.requete.RequeteInsert;

public class Logement {
	private String idLogement;
	private String superficieLogement;
	private String complementAdresseLogement;
	private String typeLogement;
	private String prixAcquisitionLogement;
	private String nbPiece;
	private String nbChambre;
	private String descriptionLogement;
	private boolean avoirGarageLogement;
	private String fraisAcquisitionLogement;
	private boolean actifLogement;
	private String montantCaution;
	private String immeuble;
	private String proprietaire;
	public Logement(String idLogement, String superficieLogement, String complementAdresseLogement, String typeLogement,
			String prixAcquisitionLogement, String nbPiece, String nbChambre, String descriptionLogement,
			boolean avoirGarageLogement, String fraisAcquisitionLogement, boolean actifLogement, String montantCaution,
			String immeuble, String proprietaire) {
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
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(idLogement);
		result = prime * result + Objects.hash(actifLogement, avoirGarageLogement, complementAdresseLogement,
				descriptionLogement, fraisAcquisitionLogement, immeuble, montantCaution, nbChambre, nbPiece,
				prixAcquisitionLogement, superficieLogement, typeLogement);
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
				&& Objects.equals(fraisAcquisitionLogement,other.fraisAcquisitionLogement)
				&& Objects.equals(idLogement, other.idLogement) && Objects.equals(immeuble, other.immeuble)
				&& Objects.equals(montantCaution,other.montantCaution)
				&& nbChambre == other.nbChambre && nbPiece == other.nbPiece
				&& Objects.equals(prixAcquisitionLogement,other.prixAcquisitionLogement)
				&& Objects.equals(proprietaire, other.proprietaire)
				&& Objects.equals(superficieLogement,other.superficieLogement)
				&& Objects.equals(typeLogement, other.typeLogement);
	}
	public String getIdLogement() {
		return idLogement;
	}
	public void setIdLogement(String idLogement) {

		this.idLogement = idLogement;
	}
	public String getSuperficieLogement() {
		return superficieLogement;
	}
	public void setSuperficieLogement(String superficieLogement) {
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
	public String getPrixAcquisitionLogement() {
		return prixAcquisitionLogement;
	}
	public void setPrixAcquisitionLogement(String prixAcquisitionLogement) {
		this.prixAcquisitionLogement = prixAcquisitionLogement;
	}
	public String getNbPiece() {
		return nbPiece;
	}
	public void setNbPiece(String nbPiece) {
		this.nbPiece = nbPiece;
	}
	public String getNbChambre() {
		return nbChambre;
	}
	public void setNbChambre(String nbChambre) {
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
	public String getFraisAcquisitionLogement() {
		return fraisAcquisitionLogement;
	}
	public void setFraisAcquisitionLogement(String fraisAcquisitionLogement) {
		this.fraisAcquisitionLogement = fraisAcquisitionLogement;
	}
	public boolean isActifLogement() {
		return actifLogement;
	}
	public void setActifLogement(boolean actifLogement) {
		this.actifLogement = actifLogement;
	}
	public String getMontantCaution() {
		return montantCaution;
	}
	public void setMontantCaution(String montantCaution) {
		this.montantCaution = montantCaution;
	}
	public String getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(String immeuble) {
		this.immeuble = immeuble;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public static void insererLogement(String idLogement, String superficie, String complementAdresseLogement, String typeLogement, String prixAcquisitionLog, String nbPiece, String nbChambre, String descriptionLogement,boolean avoirGarageLog, String fraisAcquiLog, boolean actifLogement, String montantCaution, String immeuble) throws SQLException {
		RequeteInsert.insererLogement(idLogement, superficie, complementAdresseLogement, typeLogement, prixAcquisitionLog, nbPiece, nbChambre, descriptionLogement, avoirGarageLog, fraisAcquiLog, actifLogement, montantCaution, immeuble);
	}
	
	public void deleteLogement() {
		RequeteDelete.deleteLogement(this.getIdLogement());
	}

}