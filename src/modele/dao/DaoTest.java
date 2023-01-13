package modele.dao;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import modele.Contrat;
import modele.Document;
import modele.Locataire;
import modele.Proprietaire;
import modele.Reglement;

public class DaoTest {
	
	private static final Collection<Locataire> LOCATAIRES = new HashSet<>();
	private static final Collection<Reglement> REGLEMENTS = new HashSet<>();
	private static final Collection<Contrat> CONTRATS = new HashSet<>();
	private static final Collection<Document> DOCUMENTS = new HashSet<>();
	private static final Collection<Proprietaire> PROPRIETAIRES = new HashSet<>();
	//private static final Collection<R> R = new HashSet<>();


	
// -------------------------- Locataire --------------------------------------------

	public static List<Locataire> selectLocataire(String...id){
		List<Locataire> liste;
		
		if (id.length != 0) {
			liste = DaoTest.LOCATAIRES.stream().filter(l -> l.getIdLocataire().equals(id[0])).collect(Collectors.toList()) ;
		} else {
			liste = new ArrayList<>(DaoTest.LOCATAIRES);
		}
		return liste;
	}
	
	public static void insertLocataire(Locataire l) {
		DaoTest.LOCATAIRES.add(l);
	}

	public static void updateLocataire(Locataire l) {
		List<Locataire> liste = DaoTest.selectLocataire(l.getIdLocataire());
		Locataire d = liste.get(0);
		d.setIdLocataire(l.getIdLocataire());
		d.setNomLocataire(l.getNomLocataire());
		d.setPrenomLocataire(l.getPrenomLocataire());
		d.setGenreLocataire(l.getGenreLocataire());
		d.setTelephoneFixeLocataire(l.getTelephoneFixeLocataire());
		d.setTelephoneMobileLocataire(l.getTelephoneMobileLocataire());
		d.setMailLocataire(l.getMailLocataire());
		d.setDdnLocataire(l.getDdnLocataire());
		d.setPieceIdentiteLocataire(l.getPieceIdentiteLocataire());
	}
	
	public static void deleteLocataire(Locataire l) {
		DaoTest.LOCATAIRES.remove(l);
	}

// -------------------------- Reglement --------------------------------------------
	
	public static List<Reglement> selectReglement(String...id){
		List<Reglement> liste;
		
		if (id.length != 0) {
			liste = DaoTest.REGLEMENTS.stream().filter(r -> r.getIdReglement().equals(id[0])).collect(Collectors.toList());
		} else {
			liste = new ArrayList<>(DaoTest.REGLEMENTS);
		}
		return liste;
	}

	public static void insertReglement(Reglement r) {
		DaoTest.REGLEMENTS.add(r);
	}

	public static void updateReglement(Reglement r) {
		List<Reglement> liste = DaoTest.selectReglement(r.getIdReglement());
		Reglement d = liste.get(0);
		d.setIdReglement((r.getIdReglement()));
		d.setDateReglement(r.getDateReglement());
		d.setMontantReglement(r.getMontantReglement());
	}
	
	public static void deleteReglement(Reglement r) {
		DaoTest.REGLEMENTS.remove(r);
	}
	
// -------------------------- Contrat --------------------------------------------
	
	public static List<Contrat> selectContrat(String...id){
		List<Contrat> liste;
		if (id.length != 0) {
			liste = DaoTest.CONTRATS.stream().filter(r -> r.getIdContrat().equals(id[0])).collect(Collectors.toList());
		} else {
			liste = new ArrayList<>(DaoTest.CONTRATS);
		}
		return liste;
	}
	
	public static void insertContrat(Contrat c) {
		DaoTest.CONTRATS.add(c);
	}
	
	public static void updateContrat(Contrat c) {
		List<Contrat> liste = DaoTest.selectContrat(c.getIdContrat());
		Contrat d = liste.get(0);
		d.setIdContrat(c.getIdContrat());
		d.setTypeDocument(c.getTypeDocument());
		d.setFichierDocument(c.getFichierDocument());
		d.setDateDocument(c.getDateDocument());
		d.setDescriptionDocument(c.getDescriptionDocument());
		d.setLocataire(c.getLocataire());
	}

	public static void deleteContrat(Contrat c) {
		DaoTest.CONTRATS.remove(c);
	}

// -------------------------- Documents --------------------------------------------

	public static List<Document> selectDocument(String...id){
		List<Document> liste;
		if (id.length != 0) {
			liste = DaoTest.DOCUMENTS.stream().filter(r -> r.getIdDocument().equals(id[0])).collect(Collectors.toList());
		} else {
			liste = new ArrayList<>(DaoTest.DOCUMENTS);
		}
		return liste;
	}
	
	public static void insertDocument(Document d) {
		DaoTest.DOCUMENTS.add(d);
	}
	
	public static void updateDocument(Contrat d) {
		List<Document> liste = DaoTest.selectDocument(d.getIdContrat());
		Document de = liste.get(0);
		de.setIdDocument(d.getIdContrat());
		de.setTypeDocument(d.getTypeDocument());
		de.setFichierDocument(d.getFichierDocument());
		de.setDateDocument(d.getDateDocument());
		de.setDescriptionDocument(d.getDescriptionDocument());
		de.setLocataire(d.getLocataire());
	}

	public static void deleteDocument(Document d) {
		DaoTest.DOCUMENTS.remove(d);
	}
}
