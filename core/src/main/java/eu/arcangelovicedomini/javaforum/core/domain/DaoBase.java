package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public abstract class DaoBase<En, Vo, Id extends Serializable> extends HibernateDaoSupport implements Dao<En, Vo, Id> {
	
	
	@Override
	public En create(En entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(En entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(entity);
	}

	@Override
	public void delete(En entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(entity);
	}

	@Override
	public List<En> findAll() {
		getHibernateTemplate().loadAll(En); //FIXME
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		getHibernateTemplate().deleteAll(findAll());
	}
	
	public En get(Id id) {
		getHibernateTemplate().load(En, id); // FIXME
	}
	
	public Vo toVo(En entity) {
		return null;
	}
	
	public List<Vo> toVoCollection(List<En> entities) {
		return null;
	}
	
	public List<Vo> toVoCollection(En... entities) {
		return null;
	}
}
