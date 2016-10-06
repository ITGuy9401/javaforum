package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.List;

public interface Dao<En, Vo, Id extends Serializable> {

	public void create(En entity);

	public void update(En entity);

	public void delete(En entity);

	public List<En> findAll();

	public void deleteAll();
}
