package com.gtafe.AI.Dao;

import com.gtafe.AI.Utils.BaseDaoSupport;
import com.gtafe.AI.doMain.Task;

public interface TaskDao extends BaseDaoSupport<Task> {
	void createTaskTable(String newTable);
}
