package modele;

import java.util.Objects;

public class Inclure {
	private Reglement reglement;
	private Facture facture;
	private Charge charge;
	public Inclure(Reglement reglement, Facture facture, Charge charge) {
		super();
		this.reglement = reglement;
		this.facture = facture;
		this.charge = charge;
	}
	@Override
	public int hashCode() {
		return Objects.hash(charge, facture, reglement);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Inclure)) {
			return false;
		}
		Inclure other = (Inclure) obj;
		return Objects.equals(charge, other.charge) && Objects.equals(facture, other.facture)
				&& Objects.equals(reglement, other.reglement);
	}
	public Reglement getReglement() {
		return reglement;
	}
	public void setReglement(Reglement reglement) {
		this.reglement = reglement;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Charge getCharge() {
		return charge;
	}
	public void setCharge(Charge charge) {
		this.charge = charge;
	}
	
	
}
