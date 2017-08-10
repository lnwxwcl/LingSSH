package com.gtafe.AI.Utils;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
public class BaseDaoSupportImpl<T> implements BaseDaoSupport<T> {
	@Resource
	private SessionFactory sessionFactory;
	private Class<T> clazz = null;// 待解决
	
	//该类初始化时获得泛型的真实类型
	public BaseDaoSupportImpl(){
		//使用反射技术为clazz赋值，得到T的真是类型
		ParameterizedType parameterizedType= (ParameterizedType) this.getClass().getGenericSuperclass();//获取当前new的对象 泛型的父类。
		this.clazz=(Class<T>) parameterizedType.getActualTypeArguments()[0];
	}
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(T entity) {
		getSession().save(entity);
	}

	public void update(T entity) {
		getSession().update(entity);

	}

	public T getByID(Long id) {
		return getSession().get(clazz, id);
	}

	@Override
	public List<T> getByIDs(Long[] ids) {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName() + "WHERE id IN (:ids) " )//
				.setParameterList("ids",ids)
				.list();
	}

	@Override
	public List<T> getAll() {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName() //
		).list();
	}

	public void del(Long id) {
		Object object = getByID(id);
		if (object != null) {
			getSession().delete(object);
		}
	}

}
