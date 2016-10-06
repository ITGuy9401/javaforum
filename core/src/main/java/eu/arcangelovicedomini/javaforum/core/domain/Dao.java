package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.List;

public interface Dao<En, Vo, Id extends Serializable> {
	
	public En get(Id id);

	public void create(En entity);

	public void update(En entity);

	public void delete(En entity);

	public List<En> findAll();

	public void deleteAll();
	
	public Vo toVo(En entity);
	
	public List<Vo> toVoCollection(List<En> entities);
	
	public List<Vo> toVoCollection(En... entities);
}
