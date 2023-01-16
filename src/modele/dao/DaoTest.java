package modele.dao;

import java.util.HashSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.junit.Test;

import controleur.CictOracleDataSource;
import modele.Charge;
import modele.Contrat;
import modele.Document;
import modele.Entreprise;
import modele.Facture;
import modele.Immeuble;
import modele.Inclure;
import modele.Locataire;
import modele.Location;
import modele.Logement;
import modele.Proprietaire;
import modele.Realiser;
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
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
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
// -------------------------- Test Immeuble --------------------------------------------

		@Test
		public void testGetIdImmeuble() {
			char[] idImmeuble = {'t','e','s','t'};
			Immeuble immeuble = new Immeuble(null, 0, null, null, null, false);
			immeuble.setIdImmeuble(idImmeuble);
			char[] temp = immeuble.getIdImmeuble();
			assertEquals(idImmeuble, temp);
		}
		
		@Test
		public void testGetNumeroAdresseLogement() {
			int numeroAdresseLogement = 3;
			Immeuble immeuble = new Immeuble(null, 0, null, null, null, false);
			immeuble.setNumeroAdresseLogement(numeroAdresseLogement);
			int temp = immeuble.getNumeroAdresseLogement();
			assertEquals(numeroAdresseLogement, temp);
		}
		
		@Test
		public void testGetNomRueAdresseLogement() {
			String nomRueAdresseLogement = "Rue de linux";
			Immeuble immeuble = new Immeuble(null, 0, null, null, null, false);
			immeuble.setNomRueAdresseLogement(nomRueAdresseLogement);
			String temp = immeuble.getNomRueAdresseLogement();
			assertEquals(nomRueAdresseLogement, temp);
		}
		
		@Test
		public void testGetAnneeConstructionImmeuble() {
			char[] anneeConstructionImmeuble = {'1','9','7','0'};
			Immeuble immeuble = new Immeuble(null, 0, null, null, null, false);
			immeuble.setAnneeConstructionImmeuble(anneeConstructionImmeuble);
			char[] temp = immeuble.getAnneeConstructionImmeuble();
			assertEquals(anneeConstructionImmeuble, temp);
		}
		
		@Test
		public void testGetCpVille() {
			char[] cpVille = {'3','1','0','0','0'};
			Immeuble immeuble = new Immeuble(null, 0, null, null, null, false);
			immeuble.setCpVille(cpVille);
			char[] temp = immeuble.getCpVille();
			assertEquals(cpVille, temp);
		}
		
		@Test
		public void testIsCoPropriete() {
			boolean isCoPropriete = true;
			Immeuble immeuble = new Immeuble(null, 0, null, null, null, false);
			immeuble.setCoPropriete(isCoPropriete);
			boolean temp = immeuble.isCoPropriete();
			assertEquals(isCoPropriete, temp);
		}
// -------------------------- Test Location --------------------------------------------
		
		@Test
		public void testGetLogementLocation() {
			Logement logement = new Logement(null, 0, null, null, 0, 0, 0, null, false, 0, false, 0, null, null);
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setLogement(logement);
			Logement temp = location.getLogement();
			assertEquals(logement, temp);
		}
		
		@Test
		public void testGetIndiceInitial() {
			double indiceInitial = 0.98;
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setIndiceInitial(indiceInitial);
			double temp = location.getIndiceInitial();
			assertEquals(indiceInitial,temp,0.0);
		}
		
		@Test
		public void testGetDateDebutLocation() {
			String dateDebutLocation = "18/10/2022";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setDateDebutLocation(dateDebutLocation);
			String temp = location.getDateDebutLocation();
			assertEquals(dateDebutLocation,temp);
		}
		
		@Test
		public void testGetFinLocation() {
			String dateFinLocation="20/02/2023";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setDateFinLocation(dateFinLocation);
			String temp = location.getDateFinLocation();
			assertEquals(dateFinLocation,temp);
		}
		
		@Test
		public void testGetMontantLoyerLocation() {
			double montantLoyerLocation = 999.99;
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setMontantLoyerLocation(montantLoyerLocation);			
			double temp = location.getMontantLoyerLocation();
			assertEquals(montantLoyerLocation,temp,0.0);
		}
		
		@Test
		public void testGetTypeLocation() {
			String typeLocation = "Appartement";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setTypeLocation(typeLocation);
			String temp = location.getTypeLocation();
			assertEquals(typeLocation,temp);
		}
		
		@Test
		public void testGetMontantChargesLocation() {
			double montantChargesLocation= 29.01;
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setMontantChargesLocation(montantChargesLocation);
			double temp = location.getMontantChargesLocation();
			assertEquals(montantChargesLocation,temp,0.0);
		}
		
		@Test
		public void testGetMontantTaxesFoncière() {
			double montantTaxeFoncière = 29.10;
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setMontantTaxeFonciereLocation(montantTaxeFoncière);
			double temp = location.getMontantTaxeFonciereLocation();
			assertEquals(montantTaxeFoncière,temp,0.0);
		}
		
		@Test
		public void testGetPhotoLocation() {
			String cheminPhoto = "./Images/Brs.png";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setPhotoLocation(cheminPhoto);
			String temp = location.getPhotoLocation();
			assertEquals(cheminPhoto,temp);
		}
		
		@Test
		public void testGetPeriodicitePaiementLoyer() {
			String periodicitePaiementLoyer = "Mensuel";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setPeriodicitePaiementLoyer(periodicitePaiementLoyer);
			String temp = location.getPeriodicitePaiementLoyer();
			assertEquals(periodicitePaiementLoyer,temp);
		}
		
		@Test
		public void testGetAjustementLoyer() {
			double ajustementLoyer = 30.00;
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setAjustementLoyer(ajustementLoyer);
			double temp = location.getAjustementLoyer();
			assertEquals(ajustementLoyer,temp,0.0);
		}
		
		@Test
		public void testGetDateVersementDernierLoyer() {
			String dateVersementDernierLoyer = "05/01/2023";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setDateVersementDernierLoyer(dateVersementDernierLoyer);
			String temp = location.getDateVersementDernierLoyer();
			assertEquals(dateVersementDernierLoyer, temp);
		}
		
		@Test
		public void testGetDateVersementLoyer() {
			String dateVersementLoyer = "15/10/2022";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setDateVersementLoyer(dateVersementLoyer);
			String temp = location.getDateVersementLoyer();
			assertEquals(dateVersementLoyer,temp);
		}
		
		@Test
		public void testGetFichierBail() {
			String fichierBail = "./Documents/Bail.pdf";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setFichierBail(fichierBail);
			String temp = location.getFichierBail();
			assertEquals(fichierBail, temp);
		}
		
		@Test
		public void testGetFichierQuittanceLoyer() {
			String fichierQuittanceLoyer = "./Documents/Quittance.pdf";
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setFichierQuittanceLoyer(fichierQuittanceLoyer);
			String temp = location.getFichierQuittanceLoyer();
			assertEquals(fichierQuittanceLoyer,temp);
		}
		
		@Test
		public void testGetContrat() {
			Contrat contrat = new Contrat(null, null, null, null, "long pdf", null);
			Location location = new Location(null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, null, null);
			location.setContrat(contrat);
			Contrat temp = location.getContrat();
			assertEquals(contrat,temp);
		}
	
// -------------------------- Test Propriétaire --------------------------------------------

		@Test
		public void testGetIdProprietaire() {
			String idProprietaire = "BRSJL";
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setIdProprietaire(idProprietaire);
			String temp = proprietaire.getIdProprietaire();
			assertEquals(idProprietaire,temp);
		}
		
		@Test
		public void testGetNomProprietaire() {
			String nomProprietaire = "Julien";
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setNomProprietaire(nomProprietaire);
			String temp = proprietaire.getNomProprietaire();
			assertEquals(nomProprietaire,temp);
		}
		
		@Test
		public void testGetPrenomProprietaire() {
			String prenomProprietaire = "Kemit";
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setPrenomProprietaire(prenomProprietaire);
			String temp = proprietaire.getPrenomProprietaire();
			assertEquals(prenomProprietaire,temp);
		}
		
		@Test
		public void testGetNumeroRueAdresseProprietaire() {
			int numeroRueAdresse = 2;
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setNumeroRueAdresseProprietaire(numeroRueAdresse);
			int temp = proprietaire.getNumeroRueAdresseProprietaire();
			assertEquals(numeroRueAdresse,temp);
		}
		
		@Test
		public void testGetNomRueAdresseProprietaire() {
			String nomRueAdresseProprietaire = "Julien";
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setNomRueAdresseProprietaire(nomRueAdresseProprietaire);
			String temp = proprietaire.getNomRueAdresseProprietaire();
			assertEquals(nomRueAdresseProprietaire,temp);
		}
		
		@Test
		public void testGetCodePostalAdresseProprietaire() {
			char[] codePostal = {'3','1','0','0','0'};
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setCodePostalAdresseProprietaire(codePostal);
			char[] temp = proprietaire.getCodePostalAdresseProprietaire();
			assertEquals(codePostal,temp);
		}
		
		@Test
		public void testGetNomVilleAdresseProprietaire() {
			String nomVille = "Toulouse";
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setNomVilleAdresseProprietaire(nomVille);
			String temp = proprietaire.getNomVilleAdresseProprietaire();
			assertEquals(nomVille,temp);
		}
		
		@Test
		public void testGetMailProprietaire() {
			String mailProprietaire = "Jules.java@refractor.fr";
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setMailProprietaire(mailProprietaire);
			String temp = proprietaire.getMailProprietaire();
			assertEquals(mailProprietaire,temp);
		}
		
		@Test
		public void testGetTelephoneProprietaire() {
			char[] telephoneProprietaire = {'0','6','1','3','5','3','2','4','1','5'};
			Proprietaire proprietaire = new Proprietaire(null, null, null, 0, null, null, null, null, null);
			proprietaire.setTelephoneProprietaire(telephoneProprietaire);
			char[] temp = proprietaire.getTelephoneProprietaire();
			assertEquals(telephoneProprietaire,temp);
		}
		
// -------------------------- Test Réaliser --------------------------------------------
		
		@Test
		public void testgetFactureRéaliser() {
			Facture facture = new Facture(null, null, null, 10.20, null, null, null, null, null, null);
			Realiser realiser = new Realiser(null, null);
			realiser.setFacture(facture);
			Facture temp = realiser.getFacture();
			assertEquals(facture, temp);
		}
		
		@Test
		public void testGetEntreprise() {
			Entreprise entreprise = new Entreprise(null, null, null, null, 0, null, null, null, null, "Mo.b@sql.fr"); 
			Realiser realiser = new Realiser(null, null);
			realiser.setEntreprise(entreprise);
			Entreprise temp = realiser.getEntreprise();
			assertEquals(entreprise,temp);
			}
		
// -------------------------- Test Inclure --------------------------------------------
		
		@Test 
		public void testGetReglement() {
			Reglement reglement = new Reglement(null, null, 10.02);
			Inclure inclure = new Inclure(null, null, null);
			inclure.setReglement(reglement);
			Reglement temp = inclure.getReglement();
			assertEquals(reglement,temp);
		}
		
		@Test
		public void testGetFacture() {
			Facture facture = new Facture(null, null, null, 30.44, null, null, null, null, null, null);
			Inclure inclure = new Inclure(null, null, null);
			inclure.setFacture(facture);
			Facture temp = inclure.getFacture();
			assertEquals(facture,temp);
		}
		
		@Test
		public void testGetCharge() {
			Charge charge = new Charge(null, 10.30, 0, null, null);
			Inclure inclure = new Inclure(null, null, null);
			inclure.setCharge(charge);
			Charge temp = inclure.getCharge();
			assertEquals(charge,temp);
		}
		
// -------------------------- Test Inclure --------------------------------------------
		@Test
		public void testInsertLocataire() throws SQLException {
			try {
				DataSource bd = new CictOracleDataSource () ;
				Connection cn = bd.getConnection() ;
				System.out.println("Connexion au SGBD établie") ;
				String req = "INSERT INTO Locataire(idLocataire, nomLocataire, prenomLocataire, genreLocataire, téléphoneLocataire, téléphoneMobileLocataire, mailLocataire, ddnLocataire, piècedIdentitéLocataire) VALUES 	('Test','viv','jdbc','M',NULL,NULL,NULL,NULL,NULL)";
				java.sql.Statement stEns = cn.createStatement ();
				int result = stEns.executeUpdate(req);
				if (result > 0) {
					  System.out.println("Insertion réussie");
					} else {
					  System.out.println("Aucun locataire n'a été inséré");
					}
				stEns.close() ;
				cn.close() ;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testAfficherLocataire() throws SQLException  {
			try {
				DataSource bd = new CictOracleDataSource () ;
				Connection cn = bd.getConnection() ;
				System.out.println("Connexion au SGBD établie") ;
				String req = "SELECT NOM_LOCATAIRE, PRENOM_LOCATAIRE FROM BSJ3657A.locataire WHERE IDLOCATAIRE ='TEST'";
				java.sql.Statement stEns = cn.createStatement ();
				ResultSet rsEns = stEns.executeQuery (req) ;
				boolean suivant = rsEns.next() ;
				while (suivant) {
					System.out.println(rsEns.getString("NOM_LOCATAIRE") + " " + rsEns.getString("PRENOM_LOCATAIRE")) ;
					suivant = rsEns.next();
				}
				
				rsEns.close () ;
				stEns.close() ;
				cn.close() ;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testSupprimerLocataire() throws SQLException {
			try {
				DataSource bd = new CictOracleDataSource () ;
				Connection cn = bd.getConnection() ;
				System.out.println("Connexion au SGBD établie") ;
				String req = "Delete FROM BSJ3657A.locataire WHERE IDLOCATAIRE ='TEST'";
				java.sql.Statement stEns = cn.createStatement ();
				int result = stEns.executeUpdate(req);
				if (result > 0) {
					  System.out.println("Suppression réussie");
					} else {
					  System.out.println("Aucun locataire n'a été supprimé");
					}
				
				stEns.close() ;
				cn.close() ;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
}
