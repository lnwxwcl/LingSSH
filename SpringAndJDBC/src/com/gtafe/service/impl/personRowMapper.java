package com.gtafe.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.gtafe.bean.Person;

/**
 * 查询结果接收方法。queryForObject所需参数
 * */
public class personRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
		Person person=new Person(arg0.getString("name"));
		person.setId(arg0.getInt("id"));
		return person;
	}

}
