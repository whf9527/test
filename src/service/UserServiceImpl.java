package service;

import java.util.List;

import comment.Student;
import comment.Users;
import dao.UserDao;
import dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

	
	private UserDao stuDao = new UserDaoImpl();

	@Override
	public List<Users> list() {
		// TODO Auto-generated method stub

		return stuDao .selectAll();
	}

	@Override
	public void userinsert(String userName, String passPsw) {
		// TODO Auto-generated method stub
		stuDao.userInsert(userName, passPsw);
	}

}
