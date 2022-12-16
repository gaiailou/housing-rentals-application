package modele;

import java.util.Arrays;
import java.util.Objects;

public class Reglement {
	private char[] idReglement = new char[5];
	private String dateReglement;
	private double montantReglement;
	
	public Reglement(char[] idReglement, String dateReglement, double montantReglement) {
		super();
		this.idReglement = idReglement;
		this.dateReglement = dateReglement;
		this.montantReglement = montantReglement;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(idReglement);
		result = prime * result + Objects.hash(dateReglement, montantReglement);
		return result;
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
		return Objects.equals(dateReglement, other.dateReglement) && Arrays.equals(idReglement, other.idReglement)
				&& Double.doubleToLongBits(montantReglement) == Double.doubleToLongBits(other.montantReglement);
	}
	public char[] getIdReglement() {
		return idReglement;
	}
	public void setIdReglement(char[] idReglement) {
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
