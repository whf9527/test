package dao;

import java.util.List;

import comment.Student;

import comment.Users;



public interface UserDao {

	List<Users> selectAll();

	void userInsert(String userName, String userPsw);	
}