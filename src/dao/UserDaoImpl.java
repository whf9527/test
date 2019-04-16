package dao;

import java.util.List;

import comment.Student;
import comment.Users;


public  class UserDaoImpl implements UserDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from User";
		ResultSetHandler h = new ResultSetHandlerImpl();
		Object obj = Jdbc.executeQuery(sql, h);
		return (List<Users>) obj;
	}

	@Override
	public void userInsert(String userName, String userPsw) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO `user` (userName,userPwd) VALUES (?,?)";
		Jdbc.executeUpdate(sql, userName, userPsw);
	}


}
