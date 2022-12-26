package modele;

import java.util.Arrays;
import java.util.Objects;

public class Reglement {
	private String idReglement;
	private String dateReglement;
	private double montantReglement;
	
	public Reglement(String idReglement, String dateReglement, double montantReglement) {
		super();
		this.idReglement = idReglement;
		this.dateReglement = dateReglement;
		this.montantReglement = montantReglement;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dateReglement, idReglement, montantReglement);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Reglement)) {
			return false;
		}
		Reglement other = (Reglement) obj;
		return Objects.equals(dateReglement, other.dateReglement) && Objects.equals(idReglement, other.idReglement)
				&& Double.doubleToLongBits(montantReglement) == Double.doubleToLongBits(other.montantReglement);
	}
	public String getIdReglement() {
		return idReglement;
	}
	public void setIdReglement(String idReglement) {
		this.idReglement = idReglement;
	}
	public String getDateReglement() {
		return dateReglement;
	}
	public void setDateReglement(String dateReglement) {
		this.dateReglement = dateReglement;
	}
	public double getMontantReglement() {
		return montantReglement;
	}
	public void setMontantReglement(double montantReglement) {
		this.montantReglement = montantReglement;
	}
	
	
}
