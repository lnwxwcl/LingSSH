package com.gtafe.service;

import java.util.List;
import com.gtafe.bean.Person;
/**
 * PersonService接口
 * */
public interface PersonService {
	/**
	 * 保存person
	 * 
	 * @param person
	 */
	public void save(Person person);

	/**
	 * 更新person
	 * 
	 * @param person
	 */
	public void update(Person person);

	/**
	 * 获取person
	 * 
	 * @param personid
	 */
	public Person getPerson(Integer personid);

	/**
	 * 获取所有person记录
	 */
	public List<Person> getPersons();

	/**
	 * 删除记录根据id
	 */
	public void delete(Integer personid);
}
