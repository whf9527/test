package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comment.Student;
import comment.Users;




public class ResultSetHandlerImpl implements ResultSetHandler {

	@Override
	public Object handle(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		List<Users> list = new ArrayList<>();

		while(rs.next()) {
			Users user = new Users(rs.getInt("userId"), rs.getString("userName"),rs.getString("userPwd"));
			list.add(user);
		}
		return list;
	}

}
