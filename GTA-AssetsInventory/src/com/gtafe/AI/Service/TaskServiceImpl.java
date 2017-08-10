package com.gtafe.AI.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gtafe.AI.Dao.TaskDao;
import com.gtafe.AI.doMain.Task;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
	@Resource
	private TaskDao taskDao;

	@Override
	public void save(Task entity) {
		taskDao.save(entity);

	}

	@Override
	public void update(Task entity) {
		taskDao.update(entity);

	}

	@Override
	public void del(Long id) {
		taskDao.del(id);

	}

	@Override
	public Task getByID(Long id) {

		return taskDao.getByID(id);
	}

	@Override
	public List<Task> getByIDs(Long[] ids) {
		return taskDao.getByIDs(ids);
	}

	@Override
	public List<Task> getAll() {
		
		return taskDao.getAll();
	}

	@Override
	public void createTaskTable(String newTable) {
		taskDao.createTaskTable(newTable);
	}

}
