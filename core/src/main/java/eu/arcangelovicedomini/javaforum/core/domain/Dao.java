package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Interface of the DAO Architecture by Arcangelo Vicedomini
 * 
 * @author Arcangelo Vicedomini
 *
 * @param <En> Persistance Entity Class
 * @param <Vo> Value Object Class
 * @param <Id> Primary Key class (extends Serializable)
 */
public interface Dao<En, Vo, Id extends Serializable> {
	
	/**
	 * Return the detail on an entity
	 * @param id 
	 * @return
	 */
	public En get(Id id);

	public En create(En entity);

	public void update(En entity);

	public void delete(En entity);

	public List<En> findAll();

	public void deleteAll();
	
	public Vo toVo(En entity);
	
	public Collection<Vo> toVoCollection(Collection<En> entities);
	
	public Collection<Vo> toVoCollection(En... entities);
}
