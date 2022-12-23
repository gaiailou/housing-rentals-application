package modele.dao;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import modele.Locataire;

public class DaoLocataire implements Dao<Locataire> {
    @Override
    public void create(Locataire tupple) {
        DaoTest.insertLocataire(tupple);
    }

    @Override
    public Collection<Locataire> findAll() {
        return DaoTest.selectLocataire();
    }

	@Override
	public void update(Locataire donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Locataire donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Locataire findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}