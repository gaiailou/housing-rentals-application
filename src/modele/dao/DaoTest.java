package modele.dao;

import java.util.HashSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import modele.Charge;
import modele.Contrat;
import modele.Document;
import modele.Immeuble;
import modele.Locataire;
import modele.Logement;
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
		d.setTéléphoneMobileLocataire(l.getTéléphoneMobileLocataire());
		d.setMailLocataire(l.getMailLocataire());
		d.setDdnLocataire(l.getDdnLocataire());
		d.setPièceIdentitéLocataire(l.getPièceIdentitéLocataire());
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
	
	
	
// -------------------------- Test Charge --------------------------------------------
		@Test
		public void testGetIdCharge() {
			char[] idCharge = {'e', 'a', 'u'};
			Charge charge = new Charge(null, 0, 0, null, null);
			charge.setIdCharge(idCharge);
			char[] temp = charge.getIdCharge();
			assertArrayEquals(idCharge, temp);
		}
		
		@Test
		public void testGetAncienIndex() {
			double ancienIndex = 10.01;
			Charge charge = new Charge(null, 0, 0, null, null);
			charge.setAncienIndex(ancienIndex);
			double temp = charge.getAncienIndex();
			assertEquals(ancienIndex, temp,0.0);
		}
		
		@Test
		public void testGetNouvelIndex() {
			double nouvelIndex = 30.01;
			Charge charge = new Charge(null, 0,0, null, null);
			charge.setNouvelIndex(nouvelIndex);
			double temp = charge.getNouvelIndex();
			assertEquals(nouvelIndex, temp,0.0);
		}
		
		@Test
		public void testGetLogement() {
			char[] idCharge = {'M', 'O', 'H'};
			Logement logement = new Logement(idCharge, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			Charge charge = new Charge(idCharge, 16.02, 30, null, null);
			charge.setLogement(logement);
			Logement temp = charge.getLogement();
			assertEquals(logement,temp);
		}
		
		@Test
		public void testGetLocataire() {
			Locataire locataire = new Locataire(null, "Julie", "Broisie", '0', null, null, null, null, null);
			Charge charge = new Charge(null, 0, 0, null, null);
			charge.setLocataire(locataire);
			Locataire temp = charge.getLocataire();
			assertEquals(locataire,temp);
		}
// -------------------------- Test Logement --------------------------------------------
		@Test
		public void testGetIdLogement() {
			char[]idLogement = {'L','o','g'};
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setIdLogement(idLogement);
			char[] temp = logement.getIdLogement();
			assertEquals(idLogement, temp);
		}
		
		@Test
		public void testGetSuperficieLogement() {
			double superficieLogement = 09.19;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setSuperficieLogement(superficieLogement);
			double temp = logement.getSuperficieLogement();
			assertEquals(superficieLogement, temp, 0.0);
		}
		
		@Test
		public void testGetComplementAdresseLogement() {
			String CALogement = "Bat refractoring";
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setComplementAdresseLogement(CALogement);
			String temp = logement.getComplementAdresseLogement();
			assertEquals(CALogement, temp);
		}
		
		@Test
		public void testgetTypeLogement() {
			String typeLogement = "Appartement";
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setTypeLogement(typeLogement);
			String temp = logement.getTypeLogement();
			assertEquals(typeLogement, temp);
		}
		
		@Test
		public void testGetPrixAcquisitionLogement() {
			double prixAcquisitionLogement = 9.31;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setPrixAcquisitionLogement(prixAcquisitionLogement);
			double temp = logement.getPrixAcquisitionLogement();
			assertEquals(prixAcquisitionLogement, temp, 0.0);
		}
		
		@Test
		public void testGetNbPiece() {
			int nbPiece = 3;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setNbPiece(nbPiece);
			int temp = logement.getNbPiece();
			assertEquals(nbPiece, temp);
		}
		
		@Test
		public void testGetNbChambre() {
			int nbChambre = 1;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setNbChambre(nbChambre);
			int temp = logement.getNbChambre();
			assertEquals(nbChambre, temp);
		}
		
		@Test
		public void testGetDescriptionLogement() {
			String descriptionLogement = "Très grand";
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setDescriptionLogement(descriptionLogement);
			String temp = logement.getDescriptionLogement();
			assertEquals(descriptionLogement, temp);
		}
		
		@Test
		public void testIsAvoirGarageLogement() {
			boolean avoirGarage = false;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setAvoirGarageLogement(avoirGarage);
			boolean temp = logement.isAvoirGarageLogement();
			assertEquals(avoirGarage, temp);
		}
		
		@Test
		public void testGetFraisAcquisitionLogement() {
			double fraisAcquisitionLogement = 1.01;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setFraisAcquisitionLogement(fraisAcquisitionLogement);
			double temp = logement.getFraisAcquisitionLogement();
			assertEquals(fraisAcquisitionLogement, temp, 0.0);
		}
		
		@Test
		public void testIsActifLogement() {
			boolean isActifLogement = true;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setActifLogement(isActifLogement);
			boolean temp = logement.isActifLogement();
			assertEquals(isActifLogement, temp);
		}
		
		@Test
		public void testGetMontantCaution() {
			double montantCaution = 30.04;
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setMontantCaution(montantCaution);
			double temp = logement.getMontantCaution();
			assertEquals(montantCaution, temp, 0.0);
		}
		
		@Test
		public void testGetImmeuble() {
			Immeuble immeuble = new Immeuble(null, 10, null, null, null, false);
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setImmeuble(immeuble);
			Immeuble temp = logement.getImmeuble();
			assertEquals(immeuble, temp);
		}
		
		@Test
		public void testGetProprietaire() {
			Proprietaire proprietaire = new Proprietaire(null, "Jul", "Pro", 0, null, null, null, null, null);
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			logement.setProprietaire(proprietaire);
			Proprietaire temp = logement.getProprietaire();
			assertEquals(proprietaire, temp);
		}

// -------------------------- Test Locataire --------------------------------------------

		@Test
		public void testGetIdLocataire() {
			String idLocataire = "BJG";
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setIdLocataire(idLocataire);
			String temp = locataire.getIdLocataire();
			assertEquals(idLocataire, temp);
		}
		
		@Test
		public void testGetNomLocataire() {
			String nomLocataire = "Broi";
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setNomLocataire(nomLocataire);
			String temp = locataire.getNomLocataire();
			assertEquals(nomLocataire, temp);
		}
		
		@Test
		public void testGetPrenomLocataire() {
			String prenomLocataire = "Jules";
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setPrenomLocataire(prenomLocataire);
			String temp = locataire.getPrenomLocataire();
			assertEquals(prenomLocataire, temp);
		}
		
		@Test
		public void testGetGenreLocataire() {
			char genreLocataire = 'M';
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setGenreLocataire(genreLocataire);
			char temp = locataire.getGenreLocataire();
			assertEquals(genreLocataire, temp);
		}
		
		@Test
		public void testGetTelephonefixeLocataire() {
			char[] telephoneFixeLocataire = {'0','6','1','2','9'};
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setTelephoneFixeLocataire(telephoneFixeLocataire);
			char[] temp = locataire.getTelephoneFixeLocataire();
			assertEquals(telephoneFixeLocataire, temp);
		}
		
		@Test
		public void testGetTéléphoneMoLocataire() {
			char[] téléphoneMobileLocataire = {'0','6','1','2','9'};
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setTéléphoneMobileLocataire(téléphoneMobileLocataire);
			char[] temp = locataire.getTéléphoneMobileLocataire();
			assertEquals(téléphoneMobileLocataire, temp);
		}
		
		@Test
		public void testGetMailLocataire() {
			String mailLocataire = "test@refractor.fr";
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setMailLocataire(mailLocataire);
			String temp = locataire.getMailLocataire();
			assertEquals(mailLocataire, temp);
		}
		
		@Test
		public void testGetDdnLocataire() {
			String ddnLocataire = "10/10/2010";
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setDdnLocataire(ddnLocataire);
			String temp = locataire.getDdnLocataire();
			assertEquals(ddnLocataire, temp);
		}
		
		@Test
		public void testGetPièceIdentitéLocataire() {
			String pièceIdentitéLocataire = "lien pièce";
			Locataire locataire = new Locataire(null, null, null, 'x', null, null, null, null, null);
			locataire.setPièceIdentitéLocataire(pièceIdentitéLocataire);
			String temp = locataire.getPièceIdentitéLocataire();
			assertEquals(pièceIdentitéLocataire, temp);
		}
		
	}
