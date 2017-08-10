package com.gtafe.AI.Dao;

import java.util.List;

import com.gtafe.AI.Utils.BaseDaoSupport;
import com.gtafe.AI.doMain.TaskAssets;
import com.gtafe.AI.doMain.User;

public interface UserDao extends BaseDaoSupport<User>{
	 User getByNameAndPassword(String username,String password);
	 int getProgress(String newTable);
	 List<Object> getAllAsset(String newTable);
	String getTableName();
}
