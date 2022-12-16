package modele;

import java.util.Arrays;
import java.util.Objects;

public class EtatDesLieux {
	private char[] idEtatDesLieux = new char[8];
	private String recapitulatifEtatDesLieuxEntree;
	private String recapitulatifEtatDesLieuxSortie;
	private Logement logement;
	private Locataire locataire;
	public EtatDesLieux(char[] idEtatDesLieux, String recapitulatifEtatDesLieuxEntree,
			String recapitulatifEtatDesLieuxSortie, Logement logement, Locataire locataire) {
		super();
		this.idEtatDesLieux = idEtatDesLieux;
		this.recapitulatifEtatDesLieuxEntree = recapitulatifEtatDesLieuxEntree;
		this.recapitulatifEtatDesLieuxSortie = recapitulatifEtatDesLieuxSortie;
		this.logement = logement;
		this.locataire = locataire;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(idEtatDesLieux);
		result = prime * result
				+ Objects.hash(locataire, logement, recapitulatifEtatDesLieuxEntree, recapitulatifEtatDesLieuxSortie);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EtatDesLieux)) {
			return false;
		}
		EtatDesLieux other = (EtatDesLieux) obj;
		return Arrays.equals(idEtatDesLieux, other.idEtatDesLieux) && Objects.equals(locataire, other.locataire)
				&& Objects.equals(logement, other.logement)
				&& Objects.equals(recapitulatifEtatDesLieuxEntree, other.recapitulatifEtatDesLieuxEntree)
				&& Objects.equals(recapitulatifEtatDesLieuxSortie, other.recapitulatifEtatDesLieuxSortie);
	}
	public char[] getIdEtatDesLieux() {
		return idEtatDesLieux;
	}
	public void setIdEtatDesLieux(char[] idEtatDesLieux) {
		this.idEtatDesLieux = idEtatDesLieux;
	}
	public String getRecapitulatifEtatDesLieuxEntree() {
		return recapitulatifEtatDesLieuxEntree;
	}
	public void setRecapitulatifEtatDesLieuxEntree(String recapitulatifEtatDesLieuxEntree) {
		this.recapitulatifEtatDesLieuxEntree = recapitulatifEtatDesLieuxEntree;
	}
	public String getRecapitulatifEtatDesLieuxSortie() {
		return recapitulatifEtatDesLieuxSortie;
	}
	public void setRecapitulatifEtatDesLieuxSortie(String recapitulatifEtatDesLieuxSortie) {
		this.recapitulatifEtatDesLieuxSortie = recapitulatifEtatDesLieuxSortie;
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
	
	
}
