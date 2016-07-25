package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, Id extends Serializable> {

	public void create(T entity);

	public void update(T entity);

	public void delete(T entity);

	public List<T> findAll();

	public void deleteAll();
}
