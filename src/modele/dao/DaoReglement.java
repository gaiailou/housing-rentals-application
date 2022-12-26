package modele.dao;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import modele.Reglement;

public class DaoReglement implements Dao<Reglement> {

	@Override
	public void create(Reglement donnee) {
		DaoTest.insertReglement(donnee);
		
	}

	@Override
	public void update(Reglement donnee) {
		DaoTest.updateReglement(donnee);
		
	}

	@Override
	public void delete(Reglement donnee) {
		DaoTest.deleteReglement(donnee);
	}

	@Override
	public Collection<Reglement> findAll() {
		return DaoTest.selectReglement();
	}

	@Override
	public Reglement findById(String... id) throws SQLException {
		List<Reglement> list = DaoTest.selectReglement(id);
        return (list.isEmpty() ? null : list.get(0));
	}
	

}
