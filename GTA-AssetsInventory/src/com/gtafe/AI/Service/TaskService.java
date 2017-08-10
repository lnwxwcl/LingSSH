package com.gtafe.AI.Service;

import java.util.List;
import com.gtafe.AI.doMain.Task;

public interface TaskService {
	void save(Task entity);

	void update(Task entity);

	void del(Long id);
	
    void createTaskTable(String newTable);
    
	Task getByID(Long id);

	List<Task> getByIDs(Long[] ids);

	List<Task> getAll();
}
