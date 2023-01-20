package modele;

import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;

import modele.dao.requete.RequeteInsert;

public class Immeuble {
	private String idImmeuble;
	private String numeroAdresseLogement;
	private String nomRueAdresseLogement;
	private String anneeConstructionImmeuble;
	private String nomVille;
	private String cpVille;
	private boolean coPropriete;
	
	public Immeuble(String idImmeuble, String numeroAdresseLogement, String nomRueAdresseLogement,
					String anneeConstructionImmeuble,String nomVille, String cpVille, boolean coPropriete) {
		this.nomVille= nomVille;
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
		result = prime * result + Objects.hashCode(anneeConstructionImmeuble);
		result = prime * result + Objects.hashCode(cpVille);
		result = prime * result + Objects.hashCode(idImmeuble);
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
		return Objects.equals(anneeConstructionImmeuble, other.anneeConstructionImmeuble)
				&& coPropriete == other.coPropriete && Objects.equals(cpVille, other.cpVille)
				&& Objects.equals(idImmeuble, other.idImmeuble)
				&& Objects.equals(nomRueAdresseLogement, other.nomRueAdresseLogement)
				&& numeroAdresseLogement == other.numeroAdresseLogement;
	}
	public String getIdImmeuble() {
		return idImmeuble;
	}
	public void setIdImmeuble(String idImmeuble) {
		this.idImmeuble = idImmeuble;
	}
	public String getNumeroAdresseLogement() {
		return numeroAdresseLogement;
	}
	public void setNumeroAdresseLogement(String numeroAdresseLogement) {
		this.numeroAdresseLogement = numeroAdresseLogement;
	}
	public String getNomRueAdresseLogement() {
		return nomRueAdresseLogement;
	}
	public void setNomRueAdresseLogement(String nomRueAdresseLogement) {
		this.nomRueAdresseLogement = nomRueAdresseLogement;
	}
	public String getAnneeConstructionImmeuble() {
		return anneeConstructionImmeuble;
	}
	public void setAnneeConstructionImmeuble(String anneeConstructionImmeuble) {
		this.anneeConstructionImmeuble = anneeConstructionImmeuble;
	}
	public String getCpVille() {
		return cpVille;
	}
	public void setCpVille(String cpVille) {
		this.cpVille = cpVille;
	}
	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public boolean isCoPropriete() {
		return coPropriete;
	}
	public void setCoPropriete(boolean coPropriete) {
		this.coPropriete = coPropriete;
	}
	
	public static void insererImmeuble(String idImmeuble, String string, String nomRueAdr, String anneeConstruction, String cp, String ville, boolean coPro) {
		RequeteInsert.insererImmeuble(idImmeuble, string, nomRueAdr, anneeConstruction, cp, ville, coPro);
	}
}
