package modele;

import java.util.Arrays;
import java.util.Objects;

public class Immeuble {
	private char[] idImmeuble = new char[10];
	private int numeroAdresseLogement;
	private String nomRueAdresseLogement;
	private char[] anneeConstructionImmeuble = new char[4];
	private char[] cpVille = new char[5];
	private boolean coPropriete;
	public Immeuble(char[] idImmeuble, int numeroAdresseLogement, String nomRueAdresseLogement,
			char[] anneeConstructionImmeuble, char[] cpVille, boolean coPropriete) {
		super();
		this.idImmeuble = idImmeuble;
		this.numeroAdresseLogement = numeroAdresseLogement;
		this.nomRueAdresseLogement = nomRueAdresseLogement;
		this.anneeConstructionImmeuble = anneeConstructionImmeuble;
		this.cpVille = cpVille;
		this.coPropriete = coPropriete;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(anneeConstructionImmeuble);
		result = prime * result + Arrays.hashCode(cpVille);
		result = prime * result + Arrays.hashCode(idImmeuble);
		result = prime * result + Objects.hash(coPropriete, nomRueAdresseLogement, numeroAdresseLogement);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Immeuble)) {
			return false;
		}
		Immeuble other = (Immeuble) obj;
		return Arrays.equals(anneeConstructionImmeuble, other.anneeConstructionImmeuble)
				&& coPropriete == other.coPropriete && Arrays.equals(cpVille, other.cpVille)
				&& Arrays.equals(idImmeuble, other.idImmeuble)
				&& Objects.equals(nomRueAdresseLogement, other.nomRueAdresseLogement)
				&& numeroAdresseLogement == other.numeroAdresseLogement;
	}
	public char[] getIdImmeuble() {
		return idImmeuble;
	}
	public void setIdImmeuble(char[] idImmeuble) {
		this.idImmeuble = idImmeuble;
	}
	public int getNumeroAdresseLogement() {
		return numeroAdresseLogement;
	}
	public void setNumeroAdresseLogement(int numeroAdresseLogement) {
		this.numeroAdresseLogement = numeroAdresseLogement;
	}
	public String getNomRueAdresseLogement() {
		return nomRueAdresseLogement;
	}
	public void setNomRueAdresseLogement(String nomRueAdresseLogement) {
		this.nomRueAdresseLogement = nomRueAdresseLogement;
	}
	public char[] getAnneeConstructionImmeuble() {
		return anneeConstructionImmeuble;
	}
	public void setAnneeConstructionImmeuble(char[] anneeConstructionImmeuble) {
		this.anneeConstructionImmeuble = anneeConstructionImmeuble;
	}
	public char[] getCpVille() {
		return cpVille;
	}
	public void setCpVille(char[] cpVille) {
		this.cpVille = cpVille;
	}
	public boolean isCoPropriete() {
		return coPropriete;
	}
	public void setCoPropriete(boolean coPropriete) {
		this.coPropriete = coPropriete;
	}
	
	
}
