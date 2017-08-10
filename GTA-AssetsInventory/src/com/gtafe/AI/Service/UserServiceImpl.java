package com.gtafe.AI.Service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gtafe.AI.Dao.UserDao;
import com.gtafe.AI.doMain.TaskAssets;
import com.gtafe.AI.doMain.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void del(Long userid) {
		userDao.del(userid);

	}

	@Override
	public User getByID(Long userid) {
		return userDao.getByID(userid);
	}

	@Override
	public List<User> getByIDs(Long[] userids) {
		return userDao.getByIDs(userids);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	public User getByNameAndPassword(String username, String password) {
		return userDao.getByNameAndPassword(username, password);

	}

	@Override
	public int getProgress(String newTable) {
		return userDao.getProgress(newTable);
	}

	@Override
	public List<Object> getAllAsset(String newTable) {
		return userDao.getAllAsset(newTable);
	}

	@Override
	public String getTableName() {
		return userDao.getTableName();
	}

}
