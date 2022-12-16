package modele;

import java.util.Objects;

public class Realiser {
	private Facture facture;
	private Entreprise entreprise;
	public Realiser(Facture facture, Entreprise entreprise) {
		super();
		this.facture = facture;
		this.entreprise = entreprise;
	}
	@Override
	public int hashCode() {
		return Objects.hash(entreprise, facture);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Realiser)) {
			return false;
		}
		Realiser other = (Realiser) obj;
		return Objects.equals(entreprise, other.entreprise) && Objects.equals(facture, other.facture);
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	
	
}
