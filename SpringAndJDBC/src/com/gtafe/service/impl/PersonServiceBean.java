package com.gtafe.service.impl;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.gtafe.bean.Person;
import com.gtafe.service.PersonService;
/**
 * PersonService实现类
 * */

@Transactional //确保事务统一。一个方法一个事务
public class PersonServiceBean implements PersonService {
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void save(Person person) {
		jdbcTemplate.update("insert into person(name) values(?)",new Object[]{person.getName()}, new int[]{java.sql.Types.VARCHAR});
	}

	@Override
	public void update(Person person) {
		jdbcTemplate.update("update person set name=? where id=?",new Object[]{person.getName(),person.getId()}, new int[]{java.sql.Types.VARCHAR,java.sql.Types.INTEGER});
	}

	@SuppressWarnings("unchecked")
	@Override
	public Person getPerson(Integer personid) {
		return (Person)jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{personid},
				new int[]{java.sql.Types.INTEGER},new personRowMapper());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getPersons() {
		return (List<Person>)jdbcTemplate.query("select * from person",new personRowMapper());
	}

	@Override
	public void delete(Integer personid) {
		jdbcTemplate.update("delete from person where id=?",new Object[]{personid}, new int[]{java.sql.Types.INTEGER});
	}

}
