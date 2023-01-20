package modele.dao;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.junit.Test;

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
import modele.dao.requete.ConnexionBD;


public class DaoTest {
	
	private static final Collection<Locataire> LOCATAIRES = new HashSet<>();
	private static final Collection<Reglement> REGLEMENTS = new HashSet<>();
	private static final Collection<Contrat> CONTRATS = new HashSet<>();
	private static final Collection<Document> DOCUMENTS = new HashSet<>();
	private static final Collection<Proprietaire> PROPRIETAIRES = new HashSet<>();
	
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
		public void testGetLocataire() {
			Locataire locataire = new Locataire(null, "Julie", "Broisie", '0', null, null, null, null, null);
			Charge charge = new Charge(null, 0, 0, null, null);
			charge.setLocataire(locataire);
			Locataire temp = charge.getLocataire();
			assertEquals(locataire,temp);
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
	
// -------------------------- Test Propri�taire --------------------------------------------

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
		
// -------------------------- Test R�aliser --------------------------------------------

		
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
				Connection cn = ConnexionBD.getConnectionBase();
				System.out.println("Connexion au SGBD �tablie") ;
				String req = "INSERT INTO Locataire(idLocataire, nomLocataire, prenomLocataire, genreLocataire, t�l�phoneLocataire, t�l�phoneMobileLocataire, mailLocataire, ddnLocataire, pi�cedIdentit�Locataire) VALUES 	('Test','viv','jdbc','M',NULL,NULL,NULL,NULL,NULL)";
				java.sql.Statement stEns = cn.createStatement ();
				int result = stEns.executeUpdate(req);
				if (result > 0) {
					  System.out.println("Insertion r�ussie");
					} else {
					  System.out.println("Aucun locataire n'a �t� ins�r�");
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
				Connection cn = ConnexionBD.getConnectionBase();
				System.out.println("Connexion au SGBD �tablie") ;
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
				Connection cn = ConnexionBD.getConnectionBase();
				System.out.println("Connexion au SGBD �tablie") ;
				String req = "Delete FROM BSJ3657A.locataire WHERE IDLOCATAIRE ='TEST'";
				java.sql.Statement stEns = cn.createStatement ();
				int result = stEns.executeUpdate(req);
				if (result > 0) {
					  System.out.println("Suppression r�ussie");
					} else {
					  System.out.println("Aucun locataire n'a �t� supprim�");
					}
				
				stEns.close() ;
				cn.close() ;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
}
