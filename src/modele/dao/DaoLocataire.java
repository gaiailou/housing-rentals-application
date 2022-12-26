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
	public void update(Locataire tupple) {
		DaoTest.updateLocataire(tupple);
		
	}

	@Override
	public void delete(Locataire tupple) {
		DaoTest.deleteLocataire(tupple);
		
	}

	@Override
	public Locataire findById(String... id) throws SQLException {
		List<Locataire> list = DaoTest.selectLocataire(id);
        return (list.isEmpty() ? null : list.get(0));
	}
	
	@Override
    public Collection<Locataire> findAll() {
        return DaoTest.selectLocataire();
    }

}
