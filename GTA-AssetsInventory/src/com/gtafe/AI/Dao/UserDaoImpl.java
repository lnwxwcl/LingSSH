package com.gtafe.AI.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.gtafe.AI.Utils.BaseDaoSupportImpl;
import com.gtafe.AI.doMain.TaskAssets;
import com.gtafe.AI.doMain.User;
@Repository
@SuppressWarnings("unchecked")
public class UserDaoImpl extends BaseDaoSupportImpl<User>implements UserDao{
	public User getByNameAndPassword(String username,String password) {
		User users=(User)getSession().createQuery(//
				"FROM User WHERE username=:username AND password=:password" )//
				.setParameter("username",username).setParameter("password",password).uniqueResult();
		
		return users;
	}

	@Override
	public int getProgress(String newTable) {
		int pro=getSession().createSQLQuery("SELECT * FROM "+newTable+" where result !='' ").list().size();
		return pro;
	}
	@Override
	public List<Object> getAllAsset(String newTable) {
		List<Object>list= getSession().createSQLQuery("SELECT `Code`,AssetName,INDate,Config,Price,Type,Place,Deparment,responsibilityUserName,`Describe`,result,AI_User FROM "+newTable).list();
		return list;
	}

	@Override
	public String getTableName() {
		List<String> tempList=getSession().createSQLQuery("SELECT TaskTableName from task ORDER BY TaskCreateDate DESC LIMIT 1").list();
		return tempList.get(0);
	}
}
