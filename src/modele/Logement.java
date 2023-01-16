package modele;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Objects;

import javax.swing.JTextField;

import modele.dao.requete.RequeteInsert;

public class Logement {
	private char[] idLogement = new char[15];
	private double superficieLogement;
	private String complementAdresseLogement;
	private String typeLogement;
	private String prixAcquisitionLogement;
	private int nbPiece;
	private int nbChambre;
	private String descriptionLogement;
	private boolean avoirGarageLogement;
	private String fraisAcquisitionLogement;
	private boolean actifLogement;
	private double montantCaution;
	private String immeuble;
	
	public Logement(char[] idLogement, double superficieLogement, String complementAdresseLogement, String typeLogement,
			String prixAcquisitionLogement, int nbPiece, int nbChambre, String descriptionLogement,
			boolean avoirGarageLogement, String fraisAcquisitionLogement, boolean actifLogement, double montantCaution,
			String immeuble, Proprietaire proprietaire) {
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
		result = prime * result + Arrays.hashCode(idLogement);
		result = prime * result + Objects.hash(actifLogement, avoirGarageLogement, complementAdresseLogement,
				descriptionLogement, fraisAcquisitionLogement, immeuble, montantCaution, nbChambre, nbPiece,
				prixAcquisitionLogement, superficieLogement, typeLogement);
		return result;
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
	public String getPrixAcquisitionLogement() {
		return prixAcquisitionLogement;
	}
	public void setPrixAcquisitionLogement(String prixAcquisitionLogement) {
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
	public double getMontantCaution() {
		return montantCaution;
	}
	public void setMontantCaution(double montantCaution) {
		this.montantCaution = montantCaution;
	}
	public String getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(String immeuble) {
		this.immeuble = immeuble;
	}
	
	
	public static void insererLogement(String idLogement, String superficie, String complementAdresseLogement, String typeLogement, String prixAcquisitionLog, String nbPiece, String nbChambre, String descriptionLogement,boolean avoirGarageLog, String fraisAcquiLog, boolean actifLogement, String montantCaution, String immeuble) throws SQLException {
		RequeteInsert.insererLogement(idLogement, superficie, complementAdresseLogement, typeLogement, prixAcquisitionLog, nbPiece, nbChambre, descriptionLogement, avoirGarageLog, fraisAcquiLog, actifLogement, montantCaution, immeuble);
	}

}
