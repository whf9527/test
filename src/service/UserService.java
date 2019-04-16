package service;

import java.util.List;

import comment.Student;
import comment.Users;



public interface UserService {
//	查询表格
	List<Users> list();
//插入
	void userinsert(String userName, String userPsw);
}