package modele.dao;

import java.sql.SQLException;
import java.util.Collection;

public interface Dao<T> {
	void create (T donnee) throws SQLException;
	void update (T donnee) throws SQLException;
	void delete (T donnee) throws SQLException;
	
	public Collection<T> findAll();	
	T findById(String... id) throws SQLException;
}
