package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class DaoBase<En, Vo, Id extends Serializable> implements Dao<En, Vo, Id> {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void create(En entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(En entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(En entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<En> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	public En get(Id id) {
		return null;
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
