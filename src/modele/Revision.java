package modele;

import java.util.Objects;

public class Revision {
	private String idRevision;
	private String dateRevision;
	private String sujetRevision;
	private String dateDerniereRevision;
	private double indiceICC;
	public Revision(String idRevision, String dateRevision, String sujetRevision, String dateDerniereRevision,
			double indiceICC) {
		super();
		this.idRevision = idRevision;
		this.dateRevision = dateRevision;
		this.sujetRevision = sujetRevision;
		this.dateDerniereRevision = dateDerniereRevision;
		this.indiceICC = indiceICC;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateDerniereRevision, dateRevision, idRevision, indiceICC, sujetRevision);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Revision)) {
			return false;
		}
		Revision other = (Revision) obj;
		return Objects.equals(dateDerniereRevision, other.dateDerniereRevision)
				&& Objects.equals(dateRevision, other.dateRevision) && Objects.equals(idRevision, other.idRevision)
				&& Double.doubleToLongBits(indiceICC) == Double.doubleToLongBits(other.indiceICC)
				&& Objects.equals(sujetRevision, other.sujetRevision);
	}
	public String getIdRevision() {
		return idRevision;
	}
	public void setIdRevision(String idRevision) {
		this.idRevision = idRevision;
	}
	public String getDateRevision() {
		return dateRevision;
	}
	public void setDateRevision(String dateRevision) {
		this.dateRevision = dateRevision;
	}
	public String getSujetRevision() {
		return sujetRevision;
	}
	public void setSujetRevision(String sujetRevision) {
		this.sujetRevision = sujetRevision;
	}
	public String getDateDerniereRevision() {
		return dateDerniereRevision;
	}
	public void setDateDerniereRevision(String dateDerniereRevision) {
		this.dateDerniereRevision = dateDerniereRevision;
	}
	public double getIndiceICC() {
		return indiceICC;
	}
	public void setIndiceICC(double indiceICC) {
		this.indiceICC = indiceICC;
	}
	
	
}
