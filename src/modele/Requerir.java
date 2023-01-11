package modele;

import java.util.Objects;

public class Requerir {
	private Logement logement;
	private Revision revision;
	public Requerir(Logement logement, Revision revision) {
		super();
		this.logement = logement;
		this.revision = revision;
	}
	@Override
	public int hashCode() {
		return Objects.hash(logement, revision);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Requerir)) {
			return false;
		}
		Requerir other = (Requerir) obj;
		return Objects.equals(logement, other.logement) && Objects.equals(revision, other.revision);
	}
	public Logement getLogement() {
		return logement;
	}
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
	public Revision getRevision() {
		return revision;
	}
	public void setRevision(Revision revision) {
		this.revision = revision;
	}
	
	
}
