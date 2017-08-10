package com.gtafe.AI.Utils;

import java.util.List;

public interface BaseDaoSupport<T> {
	/**
	 * 保存
	 * @param entity
	 */
	void save(T entity);
	/**
	 * 更新
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 删除
	 * @param id
	 */
	void del(Long id);
	/**
	 * 按ID查找
	 * @param id
	 * @return
	 */
	T getByID(Long id);
	/**
	 * 按多个ID查找多个对象
	 * @param ids
	 * @return
	 */
	List<T> getByIDs(Long[] ids);
	/**
	 * 查询所有
	 * @return
	 */
	List<T> getAll();
}
