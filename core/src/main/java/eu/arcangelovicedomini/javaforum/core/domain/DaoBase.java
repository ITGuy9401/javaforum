package eu.arcangelovicedomini.javaforum.core.domain;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public abstract class DaoBase<En, Vo, Id extends Serializable> extends HibernateDaoSupport implements Dao<En, Vo, Id> {
	
	private Class<En> persistentClass;
	private Class<Vo> voClass;

	@SuppressWarnings("unchecked")
	public DaoBase() {
	    this.persistentClass = (Class<En>) ((ParameterizedType) getClass()
	                            .getGenericSuperclass()).getActualTypeArguments()[0];
	    this.voClass = (Class<Vo>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
	 }
	
	@SuppressWarnings("unchecked")
	@Override
	public En create(En entity) {
		entity = (En) getHibernateTemplate().save(entity);
		return entity;
	}

	@Override
	public void update(En entity) {
		getHibernateTemplate().update(entity);
	}

	@Override
	public void delete(En entity) {
		getHibernateTemplate().delete(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<En> findAll() {
		List<En> entities = (List<En>) getHibernateTemplate().loadAll(persistentClass.getClass());
		return entities;
	}

	@Override
	public void deleteAll() {
		getHibernateTemplate().deleteAll(findAll());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public En get(Id id) {
		En entity = (En) getHibernateTemplate().load(persistentClass.getClass(), id);
		return entity;
	}
	
	protected abstract void toVo(En entity, Vo vo) throws Exception;
	
	@Override
	public Vo toVo(En entity) {
		try {
			Vo newInstance = voClass.newInstance();
			toVo(entity, newInstance);
			return newInstance;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public List<Vo> toVoCollection(List<En> entities) {
		List<Vo> vos = new ArrayList<>();
		for (En en : entities) {
			vos.add(toVo(en));
		}
		return vos;
	}
	
	@Override
	public List<Vo> toVoCollection(En... entities) {
		return toVoCollection(Arrays.asList(entities));
	}
}
