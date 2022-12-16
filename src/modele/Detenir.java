package modele;

import java.util.Objects;

public class Detenir {
	private Proprietaire proprietaire;
	private Immeuble immeuble;
	public Detenir(Proprietaire proprietaire, Immeuble immeuble) {
		super();
		this.proprietaire = proprietaire;
		this.immeuble = immeuble;
	}
	@Override
	public int hashCode() {
		return Objects.hash(immeuble, proprietaire);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Detenir)) {
			return false;
		}
		Detenir other = (Detenir) obj;
		return Objects.equals(immeuble, other.immeuble) && Objects.equals(proprietaire, other.proprietaire);
	}
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	public Immeuble getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(Immeuble immeuble) {
		this.immeuble = immeuble;
	}
	
	
}
