package modele.dao;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


import modele.Locataire;

public class DaoTest {
	
	private static final Collection<Locataire> LOCATAIRES = new HashSet<>();

	
	
	
	
// -------------------------- Locataire --------------------------------------------

	public static List<Locataire> selectLocataire(String...id){
		List<Locataire> liste;
		
		if (id.length!=0) {
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

}