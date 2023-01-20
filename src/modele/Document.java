package modele;

import java.util.Objects;

public class Document {
	private String idDocument;
	private String typeDocument;
	private String fichierDocument;
	private String dateDocument;
	private String descriptionDocument;
	private Locataire locataire;
	public Document(String idDocument, String typeDocument, String fichierDocument, String dateDocument,
			String descriptionDocument, Locataire locataire) {
		super();
		this.idDocument = idDocument;
		this.typeDocument = typeDocument;
		this.fichierDocument = fichierDocument;
		this.dateDocument = dateDocument;
		this.descriptionDocument = descriptionDocument;
		this.locataire = locataire;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateDocument, descriptionDocument, fichierDocument, idDocument, locataire, typeDocument);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Document)) {
			return false;
		}
		Document other = (Document) obj;
		return Objects.equals(dateDocument, other.dateDocument)
				&& Objects.equals(descriptionDocument, other.descriptionDocument)
				&& Objects.equals(fichierDocument, other.fichierDocument)
				&& Objects.equals(idDocument, other.idDocument) && Objects.equals(locataire, other.locataire)
				&& Objects.equals(typeDocument, other.typeDocument);
	}
	public String getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	public String getFichierDocument() {
		return fichierDocument;
	}
	public void setFichierDocument(String fichierDocument) {
		this.fichierDocument = fichierDocument;
	}
	public String getDateDocument() {
		return dateDocument;
	}
	public void setDateDocument(String dateDocument) {
		this.dateDocument = dateDocument;
	}
	public String getDescriptionDocument() {
		return descriptionDocument;
	}
	public void setDescriptionDocument(String descriptionDocument) {
		this.descriptionDocument = descriptionDocument;
	}
	public Locataire getLocataire() {
		return locataire;
	}
	public void setLocataire(Locataire locataire) {
		this.locataire = locataire;
	}

	
	
}
