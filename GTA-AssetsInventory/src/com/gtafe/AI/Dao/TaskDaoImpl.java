package com.gtafe.AI.Dao;

import org.springframework.stereotype.Repository;

import com.gtafe.AI.Utils.BaseDaoSupportImpl;
import com.gtafe.AI.doMain.Task;
@Repository
public class TaskDaoImpl extends BaseDaoSupportImpl<Task> implements TaskDao{

	@SuppressWarnings("deprecation")
	@Override
	public void createTaskTable(String newTable) {
		getSession().createSQLQuery("CREATE TABLE "+newTable+" LIKE Assets").executeUpdate();
		getSession().createSQLQuery("INSERT INTO "+newTable+" SELECT * FROM Assets").executeUpdate();	
		getSession().createSQLQuery("ALTER TABLE "+newTable+" CHANGE TEMP1 result varchar(255)").executeUpdate();
		getSession().createSQLQuery("ALTER TABLE "+newTable+" CHANGE TEMP2 AI_User varchar(255)").executeUpdate();
	}
}