package com.gtafe.AI.Service;

import java.util.List;

import com.gtafe.AI.doMain.TaskAssets;
import com.gtafe.AI.doMain.User;

public interface UserService {

	void save(User entity);

	void update(User entity);

	void del(Long id);

	User getByID(Long id);

	List<User> getByIDs(Long[] ids);

	List<User> getAll();
	
	User getByNameAndPassword(String username,String password);
	 int getProgress(String newTable);
	 List<Object> getAllAsset(String newTable);

	String getTableName();
}
